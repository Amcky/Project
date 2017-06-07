package com.sms.domains;

/**
 * @user handong
 * @description　unind命令的响应 类
 */
public class UnbindResp extends SGIPCommand{
	public UnbindResp(byte[] unicomSN) {
		this.header = new SGIPHeader(SGIPCommandDefine.SGIP_UNBIND_RESP);
		this.header.setUnicomSN(unicomSN);
	}
	public UnbindResp(SGIPCommand command) {
		this.header = command.header;
	}
}
