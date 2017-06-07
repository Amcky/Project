package com.sms.msgpush;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import javax.net.SocketFactory;

import com.sms.domains.Bind;
import com.sms.domains.BindResp;
import com.sms.domains.SGIPCommandDefine;
import com.sms.domains.SocketMsg;
import com.sms.domains.Submit;
import com.sms.domains.SubmitResp;
import com.sms.domains.Unbind;
import com.sms.domains.UnbindResp;

/**
 * @user handong
 * @description  短信下发类
 */
public final class SPSender {
	private final LinkedList<MTReq> mtReqQueue = new LinkedList<MTReq>(); // 发送队列
	private final static int WORKER_NUM = 1;
	private volatile boolean isUnbinded = true;// 是否已向SMG发送 unbind命令的标志
	private static SPSender instance = null;

	private Socket socket = null;
	private DataOutputStream out = null;
	private DataInputStream in = null;
	
	private long bindstartTime;
	private long currentTime;
	private static Map<String, Submit> mtsendedMap;  //已发送的下发实例
	
	private SPSender() {
		for (int i = 0; i < WORKER_NUM; i++) {
			Thread workerThrader = new Thread(new WorkerHandler());
			workerThrader.setName("MT-thread-" + i);
			workerThrader.start();
		}
		System.out.println("【 MT下发线程启动，线程数:" + WORKER_NUM + " 】");
	}

	/**
	 * 单态模式，在获取实例时作双重检测，防止多线程情况下产生多个实例
	 * @return　SPSender
	 */
	public static SPSender getInstance(Map<String, Submit> map) {
		if (instance == null) {
			synchronized (SPSender.class) {
				if (instance == null) {
					instance = new SPSender();
					if(map!=null){
						mtsendedMap=map;
					}
				}
			}
		}
		return instance;
	}
	public static SPSender getInstance() {
		if (instance == null) {
			synchronized (SPSender.class) {
				if (instance == null) {
					instance = new SPSender();
				}
			}
		}
		return instance;
	}
	/**
	 * 向队列添加任务
	 * @param mtreq 短信下发请求
	 */
	public void addTask(MTReq mtreq) {
		synchronized (this) {
			mtReqQueue.add(mtreq);
			System.out.println("**********addTask()****收到MT下发请求，当前队列数:" + mtReqQueue.size());
			this.notifyAll();// 唤醒发送线程
		}
	}

	/**
	 * 从队列中获取一个短信下发实例
	 * @return MTReq
	 * @throws InterruptedException
	 */
	public synchronized MTReq getTask() throws InterruptedException {
		while (mtReqQueue.isEmpty()) {
			System.out.println(Thread.currentThread().getName() + "等待任务");
			wait();
		}
		return mtReqQueue.removeFirst();

	}
	//短信下发线程
	class WorkerHandler implements Runnable {
		MTReq mtreq = null;
		public void run() {
			try {
				while (!Thread.currentThread().isInterrupted()) {
					mtreq = getTask();
					if (mtreq != null) {
						System.out.println("**********WorkerHandler******【" + Thread.currentThread().getName()+ "获得一个短信下发请求实例】");
						Thread.currentThread();
						Thread.yield();
						sendMTReq(mtreq);
					}
				}
			} catch (InterruptedException e) {
				System.out.println("短信下发线程中断!");
			} catch (IOException e) {
				mtReqQueue.add(mtreq);    //如果发送失败，重新放回队列
				System.out.println("短信下发时IO流异常!");
			}
		}
	}

	//向联通递交短信下发
	//此地方用synchronized防护的原因是防止计时器线程因空闲时间已到向SMG发送unbind命令
	//将SMG与SP连接断开，而此时刚好有下发实例进入队列，如果不加同步控制，那么计时器请求断开连接，而下发线程则向断开的连接发送
	//数据导致IO流异常
	public synchronized void sendMTReq(MTReq mtreq) throws IOException {
		if (isUnbinded || (!socket.isConnected() && socket.isClosed())) { // 如果连接已断开，则重新与SMG建立连接
			// --------------------连接
			int connectnum =0 ;//连接次数
			while(true) {
				try {
					socket = SocketFactory.getDefault().createSocket(SocketMsg.socketIP,SocketMsg.sport);
					if(socket!=null) break;
				} catch(ConnectException e) {
					try {
						Thread.currentThread();
						Thread.sleep(1000 * 1);
					} catch(InterruptedException e1){System.out.println("The Thread Interrupted!!!!线程中断!");}
					connectnum ++;
					if(connectnum >2) { //如果连接次数超过3次，放弃连接，报告重大错误
						System.out.println("**************The Connection Refused!!!!!!未能与SMG建立连接，连接超时");
						mtReqQueue.addFirst(mtreq);//未发送，放回队列
						return;
					}
					continue;
				}
			}
			socket.setTcpNoDelay(true);// 数据立即发送
			socket.setTrafficClass(0x04 | 0x10);
			bindstartTime = System.currentTimeMillis();
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
			System.out.println("******************Thread "+Thread.currentThread().getName() + " Connettion Success !!!与SMG建立连接");
			// --------------------绑定
			Bind bind = new Bind();
			bind.setLoginType((byte) 1);
			bind.setLoginName(SocketMsg.Login_name);
			bind.setLoginPassword(SocketMsg.Login_pass);
			bind.write(out);
			//--------------------绑定响应
			isUnbinded = false;
			BindResp res = (BindResp) bind.read(in);
			if (res.getResult() != 0) {
				System.out.println("**************SMG Refused !!!!!SMG拒绝连接。错误码：state code:" + res.getResult());
				return;
			}
			this.launchTimer();//启动计时器
		}
		// --------------------下发
		for (int i = 0; i < mtreq.getPhoneList().size(); i++) {
			Submit submit = new Submit();
			submit.setSPNumber(mtreq.getSpNumber());
			submit.setChargeNumber("8615516610575");// 长度21,如果全0表示由SP支付该条短信费用
			submit.setUserNumber(new String[] { mtreq.getPhoneList().get(i) });
			submit.setCorpId("42799");
			submit.setFeeType((byte) 0);
			//submit.setFeeValue("0");
			submit.setFeeValue(null);
			submit.setGivenValue(null);
			//submit.setGivenValue("0");
			submit.setAgentFlag((byte) 0);
			submit.setMorelatetoMTFlag((byte) 2); // 0-MO点播引起的第一条MT信息
			// 1-MO点播引起的非第一条信息
			// 2-非MO点播引引起的MT消息(定购业务)
			// 3系统反馈引起的MT消息
			submit.setPriority((byte) 0);
			submit.setExpireTime("");
			submit.setScheduleTime("");
			submit.setReportFlag(Byte.valueOf(mtreq.getReportFlag())); // 是否向SP报告状态
			submit.setTP_pid((byte) 0);
			submit.setTP_udhi((byte) 0);
			submit.setMessageCoding((byte) 15);
			submit.setMessageType((byte) 0);
			submit.setMessageContent(mtreq.getMessageContent());
			submit.setUserCoun((byte) 1); // 根据sgip1.2扩展协议必须填1,否则视为业务非法包处理
			submit.setServiceType(mtreq.getServiceType());
			submit.setLinkID(mtreq.getLinkId());
			submit.write(out);
			SubmitResp submitres = (SubmitResp) submit.read(in);
			if (submitres.getResult() == 0) {
				System.out.println("***********submit success!!!!!!***************【" + Thread.currentThread().getName()+ "Send MT to SMG Suc 发送的MT请求递交到SMG成功 】**************************");
			}else{
				System.out.println("***********submit error!!!!*************【" + Thread.currentThread().getName()+ "Send MT to SMG Faile 发送的MT请求递交到SMG失败!,错误码 " + submitres.getResult() + "】*********************");
			}
		}
	}
	
	/**
	 * 该计时器用于检测与SMG建立的时间，如果短消息发送队列为空，且空闲时间超过10秒
	 * 则向SMG发送unbind命令，在收到SMG的unbind_resp响应后SP断开连接
	 */
	public void launchTimer() {
		final Timer mtTimer = new Timer();
		mtTimer.schedule(new TimerTask() {
			int freetime=10;//空闲时间
			public void run() {
				if(mtReqQueue.isEmpty()) {
					currentTime = System.currentTimeMillis();
					int passedTime = (int) ((currentTime - bindstartTime) / 1000);
					if(passedTime > freetime) {
						synchronized (this) { //持有对象锁，防止在拆掉SMG链路时，其它线程与SMG建立连接,导致
							                  //SMG认为用户状态不正常并拒绝短信下发请求
							// 向SMG发送unbind命令
							Unbind unbind = new Unbind();
							unbind.write(out);
							System.out.println(Thread.currentThread().getName()+" 向SMG发送unbind命令");
							UnbindResp resp = (UnbindResp) unbind.read(in);
							if (Arrays.equals(resp.header.getCommandId(),SGIPCommandDefine.SGIP_UNBIND_RESP)) {
								isUnbinded = true;
								System.out.println("SMG收到unbind命令，SP关闭连接");
								mtTimer.cancel(); //计时停止
								//释放socket资源
								try {
									if(in !=null) in.close();
									if(out !=null) out.close();
									if(socket !=null) socket.close();
								} catch(IOException e){
									System.out.println("释放socket资源发生异常");
								}
							}
						}
					}
				}
			}
		}, 0, 1000 * 1); //每1秒钟检测一次
	}
}