package com.sms.domains;

/**
 * @author handong
 * @description　SMG向SP返回短信下发命令的响应  
 */
public class SubmitResp extends SGIPCommand{
	private byte result;
	private String reserve;
	
	public SubmitResp(SGIPCommand command) {
		this.header = command.header;
		this.result = command.bodybytes[0];
	}
	public byte getResult() {
		return result;
	}
	public void setResult(byte result) {
		this.result = result;
	}
	public String getReserve() {
		return reserve;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
}
