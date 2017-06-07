package cn.htu.chinaunicom;

import java.util.ArrayList;
import java.util.Map;

import com.sms.domains.SocketMsg;
import com.sms.msgpush.MTReq;
import com.sms.msgpush.SPSender;

@SuppressWarnings("unchecked")
public class ChinaUnicomSend {
	
	SPSender spsender=SPSender.getInstance();;
	private ArrayList<String> phonelist;
	private MTReq mtreq;
	public Map map;
	
	
private void sendSms(String no,String con) {

		phonelist = new ArrayList<String>();
		
		System.out.println("MT信息电话号码 MT PhoneNO" + no + "  MT信息内容  MT Message COn:" + con);
		phonelist.add(no.toString());
		mtreq = new MTReq();
		mtreq.setMessageContent(con);
		mtreq.setLinkId("");
		mtreq.setSpNumber(SocketMsg.Sp_number);
		mtreq.setReportFlag("1");
		mtreq.setServiceType("9");
		mtreq.setPhoneList(phonelist);
		mtreq.setLinkId(SocketMsg.Link_id);
		mtreq.setReportFlag("1");
		spsender.addTask(mtreq);
		
}

 public static void main(String[] args) {
	
	 ChinaUnicomSend a= new ChinaUnicomSend();
	 a.sendSms("15038703909", "河南示范大学www.htu.cn");

}

public static void sendUnicom(String[] strings, String string) {
	for(String a:strings){
		 new ChinaUnicomSend().sendSms(a, string);
	}
	
}



}
