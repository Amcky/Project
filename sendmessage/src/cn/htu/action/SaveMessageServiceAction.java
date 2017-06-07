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
	
	// 此处没有使用注入方式，而是直接new出来的
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
		//向数据库中添加短信记录
		Map session = (Map) ActionContext.getContext().getSession();

		String usercode = session.get("usercode").toString();
		
		

		User user = this.userService.findUserbyUserCode(usercode);
		
		message.setUser(user);

		Properties props = new Identify().getConfig("/const.properties");
		
		int i = new Identify().identifyNum(message.getJshm());
		switch(i)
		{
		case 3: 
		SP="河南联通" ; //河南联通
		feePer = props.getProperty("henanunicomfeeper");
		break;
		case 4: SP="其他" ; //其他
		feePer = props.getProperty("elsefeeper");
		break;
		case 1: SP="中国移动" ; //返回“1”说明是中国移动
		feePer = props.getProperty("chinamobilefeeper");
		break;
		case 2: SP="非河南联通" ; //返回“2”说明是非河南联通
		feePer = props.getProperty("chinaunicomfeeper");
		}
		
	//message.setFee(Double.parseDouble(feePer));
		message.setFee(0.05);

		message.setFsbj(0);

		message.setSp(SP);

		message.setFssj(new Date().toLocaleString());

		message.setStatus("0");

		message.setZb(CharacterUtils.getRandomString(12));
        //发送记录
		this.messageService.addMessage(message);
		
		//记录操作日志		
//		Log log = new Log();
//		log.setUser(user);
//		log.setContent("发送短信:"+message.getJshm());
//		log.setCreateTime(new Date().toLocaleString());
//		log.setStatus("0");
//		this.logService.addLog(log);
		//使用模型驱动方式，参数直接封装到message中，所以只需要取得相应的值即可
		sendMessage.mobilesend(message.getJshm(), message.getDxnr());
		return "success";
	}

}
