package com.sms.domains;

/**
 * 
 * @author handong
 * @description bind命令 
 */
public class Bind extends SGIPCommand{

	private byte loginType =1;
	private String loginName;
	private String loginPassword;
	private String reserve="";
	
	public Bind() {
		//数组初始化
		this.header = new SGIPHeader(SGIPCommandDefine.SGIP_BIND);
		this.bodybytes = new byte[SGIPCommandDefine.LEN_SGIP_BIND];
		byte[] reserveByte = new byte[8];
		System.arraycopy(this.reserve.getBytes(), 0, reserveByte, 0, this.reserve.length());
		System.arraycopy(reserveByte, 0, this.bodybytes,33, 8);
	}
	public Bind(SGIPCommand command) {
		this.header = command.header;
		this.bodybytes = command.bodybytes;
		//----------------------------------
		this.loginType = command.bodybytes[0];
		//----------------------------------
		byte[] loginNameBytes = new byte[16];
		System.arraycopy(command.bodybytes, 1, loginNameBytes, 0, 16);
		this.loginName = new String(loginNameBytes).trim();
		//----------------------------------
		byte[] loginpwdBytes = new byte[16];
		System.arraycopy(command.bodybytes, 17, loginpwdBytes, 0, 16);
		this.loginPassword = new String(loginpwdBytes).trim();
		//----------------------------------
		byte[] reserveByte = new byte[8];
		System.arraycopy(command.bodybytes, 33, reserveByte, 0, 8);
		this.reserve = new String(reserveByte).trim();
	}
	
	public byte getLoginType() {
		return loginType;
	}
	public void setLoginType(byte loginType) {
		this.loginType = loginType;
		this.bodybytes[0]=SGIPCommand.IntToByte(loginType);
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
		byte[] loginNameByte = new byte[16];
		System.arraycopy(loginName.getBytes(), 0, loginNameByte, 0, loginName.length());
		System.arraycopy(loginNameByte, 0, this.bodybytes, 1, 16);
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
		byte[] loginpwd = new byte[16];
		System.arraycopy(loginPassword.getBytes(), 0, loginpwd, 0, loginPassword.length());
		System.arraycopy(loginpwd, 0, this.bodybytes, 17, 16);
	}
	
	public String getReserve() {
		return reserve;
	}
	/**
	 *@deprecated the field is reserved  
	 */
	public void setReserve(String reserve) {
		this.reserve = reserve;
		byte[] reserveByte = new byte[8];
		System.arraycopy(reserve.getBytes(), 0, reserveByte, 0, reserve.length());
		System.arraycopy(reserveByte, 0, this.bodybytes,33, 8);
	}
}
