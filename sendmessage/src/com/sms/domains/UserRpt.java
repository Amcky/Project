package com.sms.domains;

/**
 * @user handong
 * @description 保留，用于对一个用户的鉴权，如用户手机是否注销，欠费停机
 */
public class UserRpt extends SGIPCommand{
	private String SPNumber;    //SP接入号
	private String userNumber;  //待配置的手机号，手机号码前面加"86"国别标志
	private byte userCondition; //0:注销 1：欠费停机　2:恢复正常
	private String reserve;     //保留，扩展用
	
	public UserRpt(SGIPCommand command) {
		this.header = command.header;
		this.bodybytes = command.bodybytes;
		//--------------------------------
		this.SPNumber = new String(this.bodybytes,0,21).trim();
		this.userNumber = new String(this.bodybytes,21,21).trim();
		this.userCondition = this.bodybytes[42];
		this.reserve = new String(this.bodybytes,43,8);
	}

	public String getSPNumber() {
		return SPNumber;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public byte getUserCondition() {
		return userCondition;
	}

	public String getReserve() {
		return reserve;
	}
	
	
}
