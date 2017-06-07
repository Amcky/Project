package com.sms.domains;

import java.io.UnsupportedEncodingException;

/**
 * 
 * @author handong
 * @description  短信下发类
 *
 */
public class Submit extends SGIPCommand{

	private String SPNumber;         //SP接入号码(21字节)
		
	private String ChargeNumber;     //付费号码,手机号码前加"86"国别标志,当且仅当群发且对用户收费是为空;如
	//果为空，则该条短信消息产生的费用由UserNumber代表的用户支付;如果为全字符串
	//"000000000000000000000",表示该条消息产生的费用由SP支付 (21字节)
	private byte userCoun;           //接收短消息的手机数量，取值 范围1至100(1字节)
	private String[] userNumber;       //接收该短消息的手机号，该字段重复UserCount指定的次数，手机号加86国别标志(21字节)
	private String corpId;           //企业代码(5字节)
	private String serviceType;      //业务代码(10字节)
	private byte feeType;			 //计费类型(6字节)
	private String feeValue;           //该条短信的收费值，由SP定义，对于包月制收费的用户，该值的为月租费的值　
	private String givenValue;       //赠送话费
	private byte agentFlag;          //代收费标标志(0应收 1实收)
	private byte morelatetoMTFlag;   //引起MT 消息的原因
	//0-MO点播引起的第一条MT消息
	//1-MO点播引起的非第一条 MT消息 
	//2-非MO点播 引起的MT消息
	//3-系统反馈引起的MT消息
	private byte priority;           //优先级(0-9),从低到高，默认为0
	private String expireTime;		 //短消息寿命终止时间  ，格式为"yymmddhhmmsstnnp"
	private String scheduleTime;     //定时发送时间,如果为空发示立即发送，格式化"yymmddhhmmsstnnp"
	private byte reportFlag;		 //状态报告标记
	//0-该条消息只有最后出错时要返回状态报告
	//1-该条消息无论最后是否成功都要返回状态报告
	//2-该条消息不需要返回状态报告
	//3-该条消息仅携带包月计费信息，不下发给用户
	//其它保留，缺省为0
	private byte TP_pid;             //GSM协议类型
	private byte TP_udhi;            //GSM协议类型
	private byte messageCoding;      //短消息的编码格式
	//0:纯ASCII字符串
	//3:写卡操作
	//4:二进制编码
	//8:UCS2编码
	//15:GBK编码
	private byte messageType;        //信息类型
	//0-短消息信息  其它 :待定
	private int messageLength;       //短消息的长度 
	private String messageContent;   //短消息的内容
	private String linkID;           //linkID

	public Submit() {
		
	}
	
	public Submit(int contentLen) {
	}
	public String getSPNumber() {
		return SPNumber;
	}
	public void setSPNumber(String sPNumber) {
		SPNumber = sPNumber;
	}
	public String getChargeNumber() {
		return ChargeNumber;
	}
	public void setChargeNumber(String chargeNumber) {
		ChargeNumber = chargeNumber;
	}
	public byte getUserCoun() {
		return userCoun;
	}
	public void setUserCoun(byte userCoun) {
		this.userCoun = userCoun;
	}
	public String[] getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String[] userNumber) {
		this.userNumber = userNumber;
	}
	public String getCorpId() {
		return corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}
	public String getServiceType() {
		return serviceType;
	}
	//业务代码
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public byte getFeeType() {
		return feeType;
	}
	//计费类型
	public void setFeeType(byte feeType) {
		this.feeType = feeType;
	}
	public String getFeeValue() {
		return feeValue;
	}
	//一条短信的收费值　
	public void setFeeValue(String feeValue) {
		this.feeValue = feeValue;
	}
	
	public String getGivenValue() {
		return givenValue;
	}
	//赠送话费　
	public void setGivenValue(String givenValue) {
		this.givenValue = givenValue;
	}
	public byte getAgentFlag() {
		return agentFlag;
	}
	//代收费标志(0:应收　1:实收)
	public void setAgentFlag(byte agentFlag) {
		this.agentFlag = agentFlag;
	}
	public byte getMorelatetoMTFlag() {
		return morelatetoMTFlag;
	}
	//引起MT消息的原因
	public void setMorelatetoMTFlag(byte morelatetoMTFlag) {
		this.morelatetoMTFlag = morelatetoMTFlag;
	}
	public byte getPriority() {
		return priority;
	}
	//优先级
	public void setPriority(byte priority) {
		this.priority = priority;
	}
	public String getExpireTime() {
		return expireTime;
	}
	//短消息寿命终止时间　
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getScheduleTime() {
		return scheduleTime;
	}
	//短消息定时发送时间　
	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	public byte getReportFlag() {
		return reportFlag;
	}
	//状态报告标记
	public void setReportFlag(byte reportFlag) {
		this.reportFlag = reportFlag;
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
	//短消息编码格式
	public void setMessageCoding(byte messageCoding) {
		this.messageCoding = messageCoding;
	}
	public byte getMessageType() {
		return messageType;
	}
	//信息类型
	public void setMessageType(byte messageType) {
		this.messageType = messageType;
	}
	public int getMessageLength() {
		return messageLength;
	}
	public String getMessageContent() {
		return messageContent;
	}
	//短消息内容
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getLinkID() {
		return linkID;
	}
	public void setLinkID(String linkID) {
		this.linkID = linkID;
	}
	@Override
	public byte[] getCommandBodybytes() {
		 byte[] temp_chn = null;
	     if (this.messageCoding == 15) {
	        try {
				temp_chn = this.messageContent.getBytes("GBK");
			} catch (UnsupportedEncodingException e) {e.printStackTrace();}
	        this.messageLength = temp_chn.length;
	     } else {
	        this.messageLength = this.messageContent.length();
	     }
	     
		this.header = new SGIPHeader(SGIPCommandDefine.SGIP_SUBMIT);
		this.header.setTotalmsglen(143+21*this.userCoun+this.messageLength);
		this.bodybytes = new byte[this.header.getTotalmsglen() - SGIPCommandDefine.LEN_SGIP_HEADER];
		//---------------------SPNumber
		byte[] tempbytes = new byte[21];
		if(this.SPNumber.length() >21)
			throw new SGIPException(String.valueOf("SPNumber Longer than 21 bytes:").concat(String.valueOf(this.SPNumber)));
		this.SPNumber.getBytes(0,this.SPNumber.length(),tempbytes,0);
		BytesCopy(tempbytes, this.bodybytes, 0, 20, 0);
		//---------------------ChargeNumber
		tempbytes = new byte[21];
		if(this.ChargeNumber.length() >21)
			throw new SGIPException(String.valueOf("ChargeNumber longer than 21 bytes:").concat(String.valueOf(this.ChargeNumber)));
		this.ChargeNumber.getBytes(0,this.ChargeNumber.length(),tempbytes, 0);
		BytesCopy(tempbytes, this.bodybytes, 0, 20, 21);
		//----------------------UserCount
		this.bodybytes[42] = this.userCoun;
		//----------------------UserNumbers
		int current_pos = 43;
		for(int i=0; i < this.userCoun; i++) {
			tempbytes = new byte[21];
			String mobile = String.valueOf(this.userNumber[i]);
			if(mobile.length() >21)
				throw new SGIPException(String.valueOf("UserNumber longer than 21 bytes:").concat(String.valueOf(mobile)));
			mobile.getBytes(0,mobile.length(),tempbytes,0);
			BytesCopy(tempbytes, this.bodybytes, 0, 20, current_pos);
			current_pos += 21;
		}
		//------------------------CorpId
		tempbytes = new byte[5];
		if(this.corpId.length() >5) 
			throw new SGIPException(String.valueOf("CorpId longer than 5 bytes:").concat(String.valueOf(this.corpId)));
		this.corpId.getBytes(0,this.corpId.length(),tempbytes,0);
		BytesCopy(tempbytes, this.bodybytes, 0, 4, current_pos);
		current_pos +=5;
		//-------------------------ServiceType
		tempbytes = new byte[10];
		if(this.serviceType.length() > 10)
			throw new SGIPException(String.valueOf("ServiceType longer than 10 bytes:").concat(String.valueOf(this.serviceType)));
		this.serviceType.getBytes(0,this.serviceType.length(),tempbytes,0);
		BytesCopy(tempbytes, this.bodybytes, 0, 9, current_pos);
		current_pos +=10;
		//--------------------------feeType
		this.bodybytes[current_pos] = this.feeType;
		current_pos++;
		//--------------------------feeValue
		tempbytes = new byte[6];
		if(this.feeValue.length() > 6)
			throw new SGIPException(String.valueOf("feeValue longer than 6 bytes:").concat(String.valueOf(this.feeValue)));
		this.feeValue.getBytes(0,this.feeValue.length(),tempbytes,0);
		BytesCopy(tempbytes, this.bodybytes, 0, 5, current_pos);
		current_pos +=6;
		//--------------------------givenValue
		tempbytes = new byte[6];
		if(this.givenValue.length() > 6)
			throw new SGIPException(String.valueOf("GivenValue longer than 6 bytes:").concat(String.valueOf(this.givenValue)));
		this.givenValue.getBytes(0, this.givenValue.length(), tempbytes, 0);
		BytesCopy(tempbytes, this.bodybytes, 0, 5, current_pos);
		current_pos +=6;
		//---------------------------agentFlag
		this.bodybytes[current_pos] = this.agentFlag;
		current_pos++;
		//---------------------------MOrelateMTFlag
		this.bodybytes[current_pos] = this.morelatetoMTFlag;
		current_pos++;
		//---------------------------priority
		this.bodybytes[current_pos] = this.priority;
		current_pos++;
		//---------------------------expireTime
		tempbytes = new byte[16];
		if(this.expireTime.length()>16)
			throw new SGIPException(String.valueOf("EXpireTime longer than 16 bytes:").concat(String.valueOf(this.expireTime)));
		this.expireTime.getBytes(0, this.expireTime.length(), tempbytes, 0);
		BytesCopy(tempbytes, this.bodybytes, 0, 15, current_pos);
		current_pos +=16;
		//----------------------------scheduleTime
		tempbytes = new byte[16];
		if(this.scheduleTime.length()>16)
			throw new SGIPException(String.valueOf("ScheduleTime longer than 16 bytes:").concat(String.valueOf(this.scheduleTime)));
		BytesCopy(tempbytes, this.bodybytes, 0, 15, current_pos);
		current_pos +=16;
		//-----------------------------reportFlag
		this.bodybytes[current_pos] = this.reportFlag;
		current_pos++;
		//-----------------------------TP_pid
		this.bodybytes[current_pos] = this.TP_pid;
		current_pos++;
		//-----------------------------TP_udhi
		this.bodybytes[current_pos] = this.TP_udhi;
		current_pos++;
		//-----------------------------MessageCoding
		this.bodybytes[current_pos] = this.messageCoding;
		current_pos++;
		//-----------------------------MessageType
		this.bodybytes[current_pos] = this.messageType;
		current_pos++;
		//-----------------------------MessageLength
		BytesCopy(IntToBytes4(this.messageLength), this.bodybytes, 0, 3, current_pos);
		current_pos+=4;
		//-----------------------------MessageContent
		if(this.messageCoding==15) {
			BytesCopy(temp_chn, this.bodybytes, 0, this.messageLength-1, current_pos);
		} else {
			 this.messageContent.getBytes(0, this.messageLength, this.bodybytes, current_pos);
		}
		current_pos+=this.messageLength;
		//-----------------------------LinkID
		tempbytes = new byte[8];
		if(this.linkID.length()>8)
			throw new SGIPException(String.valueOf("linkid longer than 8 bytes:").concat(String.valueOf(this.linkID)));
		this.linkID.getBytes(0, this.linkID.length(), tempbytes, 0);
		BytesCopy(tempbytes, this.bodybytes, 0, 7, current_pos);
		
		return super.getCommandBodybytes();
	}
}
