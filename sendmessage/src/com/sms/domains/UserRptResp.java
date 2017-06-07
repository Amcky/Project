package com.sms.domains;

/**
 * @author handong
 * @description  保留，userpt命令响应
 */
public class UserRptResp extends SGIPCommand{
	private byte result;  //0:成功　其它：错误码
	private String reserve;
	
	public UserRptResp(byte[] unicomSN) {
		this.header = new SGIPHeader(SGIPCommandDefine.SGIP_USERRPT_RESP);
		this.header.setUnicomSN(unicomSN);
		this.bodybytes = new byte[SGIPCommandDefine.LEN_SGIP_USERRPT_RESP];
	}

	public byte getResult() {
		return result;
	}

	//设置结果
	public void setResult(byte result) {
		this.result = result;
		this.bodybytes[0]=result;
		//--------------------------
		byte[] reserveByte = new byte[8];
		System.arraycopy(this.reserve.getBytes(), 0, reserveByte, 0, this.reserve.length());
		System.arraycopy(reserveByte, 0, this.bodybytes,1, 8);
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
	
}
