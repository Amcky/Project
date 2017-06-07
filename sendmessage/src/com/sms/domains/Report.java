package com.sms.domains;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @user handong
 * @description 用于SMG向SP报告之前一条短信的状态
 */
public class Report extends SGIPCommand{
	private String submitSequenceNumber;  //该命令所涉及的Submit或deliver命令的弃列号
	private byte reportType;           //0:对先前的一条Submit命令的状态报告
		                               //1:对先前一条前转Deliver命令的状态报告
	private String userNumber;         //接收短消息的手机号码
	private byte state;                //0:发送成功　　1:等待发送　2:发送失败
	private byte errorCode;            //当state=2时为错误码值，否则为0
	private String reverse;            //保留
	
	public Report(SGIPCommand command) {
		this.header = command.header;
		this.bodybytes = command.bodybytes;
		
		int curr_index =0;
		//-----------------序列号
		byte[] tmpBytes = null;
		//源节点编码
		tmpBytes = new byte[5];
		System.arraycopy(this.bodybytes, curr_index, tmpBytes, 1, 4);
		submitSequenceNumber = new BigInteger(tmpBytes).toString();
		curr_index +=4;
		//日期时间
		tmpBytes = new byte[4];
		System.arraycopy(this.bodybytes, curr_index, tmpBytes, 0, 4);
		submitSequenceNumber += SGIPCommand.Bytes4ToInt(tmpBytes);
		curr_index +=4;
		//序号
		tmpBytes = new byte[4];
		System.arraycopy(this.bodybytes, curr_index, tmpBytes, 0, 4);
		submitSequenceNumber += SGIPCommand.Bytes4ToInt(tmpBytes);
		curr_index +=4;
		//-----------------reportType
		this.reportType=this.bodybytes[curr_index];
		curr_index ++;
		//-----------------UserNumber
		byte[] userNumberBytes = new byte[21];
		System.arraycopy(this.bodybytes, curr_index, userNumberBytes, 0, 21);
		this.userNumber = new String(userNumberBytes).trim();
		curr_index += 21;
		//-----------------state
		this.state = this.bodybytes[curr_index];
		curr_index ++;
		//-----------------ErrorCode
		this.errorCode = this.bodybytes[curr_index];
		curr_index ++;
		//-----------------reverse
		byte[] reverseBytes = new byte[8];
		System.arraycopy(this.bodybytes, curr_index, reverseBytes, 0, 8);
		this.reverse = new String(reverseBytes).trim();
	}
	public String getSubmitSequenceNumber() {
		return submitSequenceNumber;
	}
	public byte getReportType() {
		return reportType;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public byte getState() {
		return state;
	}
	public byte getErrorCode() {
		return errorCode;
	}
	public String getReverse() {
		return reverse;
	}
	
}
