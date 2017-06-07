package com.sms.domains;
/**
 * 
 * @author handong
 * @description 用于通知server端，拆掉已建立的链接
 */
public class Unbind extends SGIPCommand{

	public Unbind() {
		this.header = new SGIPHeader(SGIPCommandDefine.SGIP_UNBIND);
	}
	
	public Unbind(SGIPCommand command) {
		this.header = command.header;
		this.bodybytes = command.bodybytes;
	}
}
