package com.sms.domains;

/**
 * @author handong
 * @description deliver命令的响应
 */
public class DeliverResp extends SGIPCommand{
	private byte result;
	private String reserve="";
	
	public DeliverResp(byte[] unicomSN) {
		this.header = new SGIPHeader(SGIPCommandDefine.SGIP_DELIVER_RESP);
		this.header.setUnicomSN(unicomSN);
		this.bodybytes = new byte[SGIPCommandDefine.LEN_SGIP_DELIVER_RESP];
		//-------------------------------------------
		byte[] reserveByte = new byte[8];
		System.arraycopy(this.reserve.getBytes(), 0, reserveByte, 0, this.reserve.length());
		System.arraycopy(reserveByte, 0, this.bodybytes,1, 8);
	}
	
	public DeliverResp(SGIPCommand command) {
		result =command.bodybytes[0];
		//--------------------------------------------
		byte[] reserveBytes = new byte[8];
		System.arraycopy(command.bodybytes, 1, reserveBytes, 0, 8);
		reserve = new String(reserveBytes);
		//--------------------------------------------
	}

	public byte getResult() {
		return result;
	}

	public void setResult(byte result) {
		this.result = result;
		this.bodybytes[0] =result;
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
}