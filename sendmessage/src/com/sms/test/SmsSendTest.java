package com.sms.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sms.domains.SocketMsg;
import com.sms.msgpush.MTReq;
import com.sms.msgpush.SPSender;

public class SmsSendTest extends Thread{
	
	SPSender spsender;
	private List<Object> list=new ArrayList();;
	private ArrayList<String> phonelist;
	private MTReq mtreq;
	public Map map;
	
	public String phoneNum="8618637388092"; //phone number
	public String message="测试短信,源码方式"; //content
	
	//*********群发短信
	public String[]phones={"8618637388092","8618637388092","8618637388092","8618637388092"};
	public String[]messages={"测试(群发)短信,源码方式","测试(群发)短信,源码方式","测试(群发)短信,源码方式","测试(群发)短信,源码方式"};
	public static void main(String[] args) {
		junit();
	}
	public static void junit(){
		new SmsSendTest().start();
	}
	@Override
	public void run() {
		spsender = SPSender.getInstance();
		while (true) {
			try {
				Thread.sleep(10 * 1000);
			} catch (InterruptedException e1) {
				System.out.println("*************message send exception!!!!!短信下发线程中断!"+e1);
			}
			if(list.isEmpty()){
				/**群发短信测试数据实例**/
		/*		for(int i=0;i<phones.length;i++){
					Map m=new HashMap();
					m.put("phone_no", ""+phones[i]+"");
					m.put("send_detail", ""+messages[i]+"");
					list.add(m);
				}*/
				/**单条短信发送测试数据**/
				Map m=new HashMap();
				m.put("phone_no", ""+phoneNum+"");
				m.put("send_detail", ""+message+"");
				list.add(m);
			}
			if (list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					phonelist = new ArrayList<String>();
					map = (Map) list.get(i);
					System.out.println("MT信息电话号码 MT PhoneNO" + map.get("phone_no") + "  MT信息内容  MT Message COn:" + map.get("send_detail"));
					phonelist.add(map.get("phone_no").toString());
					mtreq = new MTReq();
					mtreq.setMessageContent(map.get("send_detail").toString());
					mtreq.setLinkId("");
					mtreq.setSpNumber(SocketMsg.Sp_number);
					mtreq.setReportFlag("1");
					mtreq.setServiceType("9");
					mtreq.setPhoneList(phonelist);
					mtreq.setLinkId(SocketMsg.Link_id);
					spsender.addTask(mtreq);
				}
			}
		}
	}
}
