package cn.htu.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.htu.service.MessageService;

public class DeleteMessageAction extends ActionSupport {
	private int id;
	private MessageService messageService;
	
	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		messageService.delete(id);
		return SUCCESS;
	}
	
}
