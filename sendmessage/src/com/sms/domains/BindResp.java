package com.sms.domains;

/**
 * 
 * @author handong
 * @description bind命令返回体
 */
public class BindResp extends SGIPCommand{

	private byte result; //0表示执行成功
	private String reserve="";
	
	public BindResp(byte[] unicomSN) {
		this.header = new SGIPHeader(SGIPCommandDefine.SGIP_BIND_RESP);
		this.header.setUnicomSN(unicomSN);
		this.bodybytes = new byte[SGIPCommandDefine.LEN_SGIP_BIND_RESP];
		//-------------------------------------------
		byte[] reserveByte = new byte[8];
		System.arraycopy(this.reserve.getBytes(), 0, reserveByte, 0, this.reserve.length());
		System.arraycopy(reserveByte, 0, this.bodybytes,1, 8);
	}
	public BindResp(SGIPCommand command) {
		this.header = command.header;
		this.bodybytes = command.bodybytes;
		//--------------------------------------------
		result =command.bodybytes[0];
		//--------------------------------------------
		byte[] reserveBytes = new byte[8];
		System.arraycopy(command.bodybytes, 1, reserveBytes, 0, 8);
		reserve = new String(reserveBytes);
		//--------------------------------------------
	}
	public int getResult() {
		return result;
	}
	public String getReserve() {
		return reserve;
	}
	public void setResult(byte result) {
		this.result = result;
		this.bodybytes[0] =result;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
}
