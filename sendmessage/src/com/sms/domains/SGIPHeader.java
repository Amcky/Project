package com.sms.domains;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author handong
 * @description SGIP命令头部分，提供头格式的生成及头部分数据
 * 的读取
 */
public class SGIPHeader {

	private byte[] commandId;
	private int totalmsglen = 0;  //命令体的总长度
	 
	private static volatile int SN =0;      //序列号，循环进位，满了之后再从0开始计位
	private String sequenceNumber;
	

	private byte[] unicomSN = null;
	public SGIPHeader() {
	}
	public void setTotalmsglen(int totalmsglen) {
		this.totalmsglen = totalmsglen;
	}
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public String getSequenceNumber() {
		return this.sequenceNumber;
	}
	public int getTotalmsglen() {
		return totalmsglen;
	}
	
	public void setUnicomSN(byte[] unicomSN) {
		this.unicomSN = unicomSN;
	}
	public byte[] getUnicomSN() {
		return unicomSN;
	}

	public SGIPHeader(byte[] commandId) {
		this.commandId = commandId;
		final int HEAD_LEN = SGIPCommandDefine.LEN_SGIP_HEADER;
		switch (SGIPCommand.Bytes4ToInt(commandId)) {
		case 0x1:
			this.totalmsglen = HEAD_LEN + SGIPCommandDefine.LEN_SGIP_BIND;
			break;
		case 0x80000001:
			this.totalmsglen = HEAD_LEN + SGIPCommandDefine.LEN_SGIP_BIND_RESP;
			break;
		case 0x2:
			this.totalmsglen = HEAD_LEN + SGIPCommandDefine.LEN_SGIP_UNBIND;
			break;
		case 0x80000002:
			this.totalmsglen = HEAD_LEN + SGIPCommandDefine.LEN_SGIP_UNBIND_RESP;
			break;
		case 0x3:
			this.totalmsglen = HEAD_LEN + SGIPCommandDefine.LEN_SGIP_SUBMIT;
			break;
		case 0x80000003:
			this.totalmsglen = HEAD_LEN + SGIPCommandDefine.LEN_SGIP_SUBMIT_RESP;
			break;
		case 0x4:
			this.totalmsglen = HEAD_LEN + SGIPCommandDefine.LEN_SGIP_DELIVER;
			break;
		case 0x80000004:
			this.totalmsglen = HEAD_LEN + SGIPCommandDefine.LEN_SGIP_DELIVER_RESP;
			break;
		case 0x5:
			this.totalmsglen = HEAD_LEN + SGIPCommandDefine.LEN_SGIP_REPORT;
			break;
		case 0x80000005:
			this.totalmsglen = HEAD_LEN + SGIPCommandDefine.LEN_SGIP_REPORT_RESP;
			break;
		default:
			this.totalmsglen = -1;
			break;
		}
	}

	public byte[] getCommandId() {
		return this.commandId;
	}

	public void setCommandId(byte[] commandId) {
		this.commandId = commandId;
	}

	public  byte[] getCommandHeadBytes() {
		int srcnode =new BigInteger("3053141211").intValue();    //源节点编号
		byte[] spsrc = SGIPCommand.IntToBytes4(srcnode);
		byte[] datecmd = SGIPCommand.IntToBytes4(getDateCmd());  //命令产生日期
		byte[] seqnum = SGIPCommand.IntToBytes4(getSeqNumber()); //序列号
		byte[] messageLength = SGIPCommand.IntToBytes4(totalmsglen); //命令体总长度
		
		this.sequenceNumber ="3053141211"+SGIPCommand.Bytes4ToInt(datecmd)+SGIPCommand.Bytes4ToInt(seqnum);
		
		byte[] commandHeadbytes = new byte[SGIPCommandDefine.LEN_SGIP_HEADER];
		byte[] cmdseq = new byte[12]; //总序列号(messageLength + commandid + sequenceNumber)
		System.arraycopy(messageLength, 0, commandHeadbytes, 0, 4);
		System.arraycopy(commandId, 0, commandHeadbytes, 4, 4);
		//------------------------------------------
		if(this.unicomSN !=null) {
			System.arraycopy(this.unicomSN, 0, cmdseq, 0, 12);
			byte[] tempbytes = new byte[4];
			System.arraycopy(unicomSN, 0, tempbytes, 0, 4);
			byte[] srcnodeByte = new byte[5];
			System.arraycopy(tempbytes, 0, srcnodeByte, 1, 4);
			BigInteger src = new BigInteger(srcnodeByte);
			System.arraycopy(unicomSN, 4, tempbytes, 0, 4);
			String date = SGIPCommand.Bytes4ToInt(tempbytes)+"";
			System.arraycopy(unicomSN, 8, tempbytes, 0, 4);
			String num = SGIPCommand.Bytes4ToInt(tempbytes)+"";
			this.sequenceNumber=src+date+num;
		} else {
			System.arraycopy(spsrc, 0,cmdseq , 0, 4);
			System.arraycopy(datecmd, 0,cmdseq , 4, 4);
			System.arraycopy(seqnum, 0, cmdseq, 8, 4);
		}
		//------------------------------------------
		System.arraycopy(cmdseq, 0, commandHeadbytes, 8, 12);
		
		return commandHeadbytes;
	}

	/** 读取头信息的总长度　命令id 和序列号*/
	public void readHead(InputStream in) throws IOException {
		//-------------------------------------------
		byte[] tempbytes = new byte[4];
		in.read(tempbytes);
		this.totalmsglen = SGIPCommand.Bytes4ToInt(tempbytes); //长度
		//--------------------------------------------
		byte[] commandIdByte = new byte[4];
		in.read(commandIdByte);
		this.commandId =commandIdByte;                         //命令id
		//--------------------------------------------
		unicomSN =new byte[12];
		in.read(tempbytes);
		byte[] srcnodeByte = new byte[5];
		System.arraycopy(tempbytes, 0, srcnodeByte, 1, 4);
		BigInteger src = new BigInteger(srcnodeByte);
		System.arraycopy(tempbytes, 0,unicomSN, 0, 4);
		in.read(tempbytes);
		String date = SGIPCommand.Bytes4ToInt(tempbytes)+"";
		System.arraycopy(tempbytes, 0, unicomSN, 4, 4);
		in.read(tempbytes);
		String seqnum = SGIPCommand.Bytes4ToInt(tempbytes)+"";
		this.sequenceNumber=src+date+seqnum;
		System.arraycopy(tempbytes, 0, unicomSN, 8, 4);
		//--------------------------------------------         //命令序号
	}
	/**
	 * 命令产生时间
	 * @return int
	 */
	private int getDateCmd() {
		SimpleDateFormat formate = new SimpleDateFormat("MMddHHmmss");
		String currTime = formate.format(new Date());
		int cmd = new BigInteger(currTime).intValue();
		return cmd;
	}
	/**
	 * 获得序列号
	 * @return
	 */
	private synchronized int getSeqNumber() {
		if(SN == Integer.MAX_VALUE)
			SN=0;
		return ++SN;
	}
}
