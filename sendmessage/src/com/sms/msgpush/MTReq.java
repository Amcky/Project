package com.sms.msgpush;
import java.util.ArrayList;
import java.util.List;

import org.apache.xerces.impl.dv.util.Base64;
import org.jdom.Document;
import org.jdom.Element;



/**
 * 
 * @author tangxj
 *
 */
public class MTReq{
	private  String spNumber;             //产品服务商号
	private  String serviceType;          //产品服务代码
	private  ArrayList<String> phoneList; //发送手机号
	private  String messageContent;       //短信息内容
	private  String reportFlag;           //是否需要报告短信发送的状态
	private  String linkId;               //linkid,向用户下发短信时的签权
	private  String phoneno;
	public MTReq() {
	}
	@SuppressWarnings("unchecked")
	public MTReq(Document doc) {
		Element root = doc.getRootElement();
		Element message_body =root.getChild("message_body");
		//---------------------------------字段赋值　
		setSpNumber(message_body.getChildTextTrim("sp_number"));
		setServiceType(message_body.getChildTextTrim("service_type"));
		setReportFlag(message_body.getChildTextTrim("report_flag"));
		String messageContent = message_body.getChildTextTrim("message_content");
		setMessageContent(new String(Base64.decode(messageContent)));
		//----------------------------------多个手机号码
		List<Element> list= message_body.getChild("user_numbers").getChildren();
		ArrayList<String> phoneList = new ArrayList<String>();
		for(Element element : list ) {
			phoneList.add("86"+element.getTextTrim());
		}
		setPhoneList(phoneList);
		setLinkId("00000000");
		if(message_body.getChildTextTrim("link_id")!=null) {
			setLinkId(message_body.getChildTextTrim("link_id"));
		}
	}
	
	public String getLinkId() {
		return linkId;
	}
	public void setLinkId(String linkId) {
		this.linkId = linkId;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public String getSpNumber() {
		return spNumber;
	}

	public void setSpNumber(String spNumber) {
		this.spNumber = spNumber;
	}

	public ArrayList<String> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(ArrayList<String> phoneList) {
		this.phoneList = phoneList;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getReportFlag() {
		return reportFlag;
	}

	public void setReportFlag(String reportFlag) {
		if(reportFlag.equals("0")) //不需要状态报告
			this.reportFlag ="2";
		this.reportFlag = reportFlag;
	}
	
	public String toXmlstre() {
		String phonexml="";
		for(int i=0; i < this.getPhoneList().size(); i++) {
			 phonexml += "<user_number>"+this.getPhoneList().get(i)+"</user_number>\n";
		}
		String xmlbody = "{<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
			+ "<gwsmip>\n" + "  <message_header>\n"
			+ "    <command_id>0x3</command_id>\n"
			+ "    <sequence_number/>\n" + "  </message_header>\n"
			+ "  <message_body>\n" + "    <pk_total>1</pk_total>\n"
			+ "    <pk_number>1</pk_number>\n" + "    <user_numbers>\n"
			+ phonexml
			+ "    </user_numbers>\n"
			+ "    <sp_number>"+this.getSpNumber()+"</sp_number>\n"
			+ "    <service_type>"+this.getServiceType()+"</service_type>\n"
			+ (this.getLinkId()!=null ? "    <link_id>"+this.getLinkId()+"</link_id>\n" : "")
			+ "    <message_content>" +Base64.encode(this.getMessageContent().getBytes())
			+ "</message_content>\n"
			+ "    <report_flag>"+this.getReportFlag()+"</report_flag>\n"
			+ "   </message_body>\n" 
			+ "</gwsmip>\n}";
		return xmlbody;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
}
