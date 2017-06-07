package com.sms.domains;

import java.nio.charset.Charset;

/**
 * @user handong
 * @description　deliver命令,用于SMG向SP上行一条短信
 */
public class Deliver extends SGIPCommand{

	private String userNumber;     //发送短消息的用户手机号,手机号码必须前加"86"国别标志
	private String SPNumber;       //SP的接入号
	private byte TP_pid;		   //GSM协议类型
	private byte TP_udhi;	       //GSM协议类型
	private byte messageCoding;	   //短消息的编码方式
	                               //0:纯ASCII字符串
		                           //3:写卡操作
	                               //4:二进制编码
		                           //8: UCS2编码
	                               //15:GBK编码
	private int messageLength;     //短消息的长度
	private String messageContent; //短消息的内容 
	private String linkID="";	   //保留，扩展用
	
	public Deliver(SGIPCommand command) {
		this.header = command.header;
		this.bodybytes = command.bodybytes;
		//-------------------------用户手机号
		this.userNumber = new String(this.bodybytes,0,21).trim();
		//-------------------------SP接入号
		this.SPNumber = new String(this.bodybytes,21,21).trim();
		//--------------------------TP_pid
		this.TP_pid = command.bodybytes[42];
		//--------------------------TP_udhi
		this.TP_udhi= command.bodybytes[43];
		//--------------------------编码方式
		this.messageCoding = command.bodybytes[44];
		//--------------------------短消息长度
		byte[] messageLengthBytes = new byte[4];
		System.arraycopy(command.bodybytes, 45, messageLengthBytes, 0, 4);
		this.messageLength = Bytes4ToInt(messageLengthBytes);
		if(this.messageLength > 160) {
			this.messageLength=160;
		}
		//--------------------------短消息内容
		byte[] messageContentBytes = new byte[messageLength];
		System.arraycopy(command.bodybytes, 49, messageContentBytes, 0, messageLength);
		if(messageCoding==8) {//ucs2
			this.messageContent=new String(messageContentBytes,Charset.forName("UnicodeBigUnmarked"));
		} else if(messageCoding==15) {
			this.messageContent=new String(messageContentBytes,Charset.forName("gbk"));
		} else  {
			this.messageContent= new String(messageContentBytes);
		}
		//--------------------------保留
		byte[] linkIDBytes = new byte[8];
		System.arraycopy(command.bodybytes, 49+messageLength, linkIDBytes, 0, 8);
		this.linkID = new String(linkIDBytes).trim();
	}
	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	
	public String getSPNumber() {
		return SPNumber;
	}

	public void setSPNumber(String sPNumber) {
		SPNumber = sPNumber;
	}

	public byte getTP_pid() {
		return TP_pid;
	}
	
	public void setTP_pid(byte tPPid) {
		TP_pid = tPPid;
	}


	public byte getTP_udhi() {
		return TP_udhi;
	}

	public void setTP_udhi(byte tPUdhi) {
		TP_udhi = tPUdhi;
	}

	public byte getMessageCoding() {
		return messageCoding;
	}

	public void setMessageCoding(byte messageCoding) {
		this.messageCoding = messageCoding;
	}
	
	public int getMessageLength() {
		return messageLength;
	}
	
	public void setMessageLength(int messageLength) {
		this.messageLength = messageLength;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getLinkID() {
		return linkID;
	}

	public void setLinkID(String linkID) {
		this.linkID = linkID;
	}
}
