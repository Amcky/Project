package cn.htu.action;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

import cn.htu.bean.Log;
import cn.htu.bean.Message;
import cn.htu.bean.User;
import cn.htu.service.LogService;
import cn.htu.service.MessageService;
import cn.htu.service.UserService;
import cn.htu.util.CharacterUtils;
import cn.htu.util.Identify;
import cn.htu.webservice.SendMessage;
import cn.htu.webservice.SendMessageImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SaveMessageServiceAction extends ActionSupport {


	private static final long serialVersionUID = 1L;

	private MessageService messageService;

	private UserService userService;

	private LogService logService;
	
	// �˴�û��ʹ��ע�뷽ʽ������ֱ��new������
	private SendMessage sendMessage = new SendMessageImpl();

	private Message message;

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public Message getMessage() {
		return message;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setLogService(LogService logService) {
		this.logService = logService;
	}

	public LogService getLogService() {
		return logService;
	}

	@Override
	public String execute() throws Exception {

		String SP = "";
		String feePer = "";
		//�����ݿ�����Ӷ��ż�¼
		Map session = (Map) ActionContext.getContext().getSession();

		String usercode = session.get("usercode").toString();
		
		

		User user = this.userService.findUserbyUserCode(usercode);
		
		message.setUser(user);

		Properties props = new Identify().getConfig("/const.properties");
		
		int i = new Identify().identifyNum(message.getJshm());
		switch(i)
		{
		case 3: 
		SP="������ͨ" ; //������ͨ
		feePer = props.getProperty("henanunicomfeeper");
		break;
		case 4: SP="����" ; //����
		feePer = props.getProperty("elsefeeper");
		break;
		case 1: SP="�й��ƶ�" ; //���ء�1��˵�����й��ƶ�
		feePer = props.getProperty("chinamobilefeeper");
		break;
		case 2: SP="�Ǻ�����ͨ" ; //���ء�2��˵���ǷǺ�����ͨ
		feePer = props.getProperty("chinaunicomfeeper");
		}
		
	//message.setFee(Double.parseDouble(feePer));
		message.setFee(0.05);

		message.setFsbj(0);

		message.setSp(SP);

		message.setFssj(new Date().toLocaleString());

		message.setStatus("0");

		message.setZb(CharacterUtils.getRandomString(12));
        //���ͼ�¼
		this.messageService.addMessage(message);
		
		//��¼������־		
//		Log log = new Log();
//		log.setUser(user);
//		log.setContent("���Ͷ���:"+message.getJshm());
//		log.setCreateTime(new Date().toLocaleString());
//		log.setStatus("0");
//		this.logService.addLog(log);
		//ʹ��ģ��������ʽ������ֱ�ӷ�װ��message�У�����ֻ��Ҫȡ����Ӧ��ֵ����
		sendMessage.mobilesend(message.getJshm(), message.getDxnr());
		return "success";
	}

}
