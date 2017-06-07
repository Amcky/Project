package cn.htu.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.htu.bean.Message;
import cn.htu.service.MessageService;

public class showxiaoximingxiAction extends ActionSupport {
	private MessageService messageService;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		Message message=messageService.getMessageById(id);
		request.setAttribute("message", message);
		return SUCCESS;
	}

}
