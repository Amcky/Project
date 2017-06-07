package cn.htu.service.impl;

import java.util.List;

import cn.htu.bean.Message;
import cn.htu.bean.Partner;
import cn.htu.bean.User;
import cn.htu.dao.MessageDao;
import cn.htu.service.MessageService;

public class MessageServiceImpl implements MessageService {

	private MessageDao messageDao;

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	public MessageDao getMessageDao() {
		return messageDao;
	}

	public void addMessage(Message message) {
		this.messageDao.saveMessage(message);
	}

	public List<Message> getAllMessages() {
		return this.messageDao.findAllMessages();
	}

	public Message getMessageById(Integer id) {
		return this.messageDao.findMessageById(id);
	}

	public List<Message> getMessagesByPartnerid(Partner partner) {
		return this.messageDao.findMessagesByCorpid(partner);
	}

	public List<Message> getMessagesByUserid(User user) {
		return this.messageDao.findMessagesByUserid(user);
	}

	public List<Message> findMessagesByCorpid(Partner partner) {
		return null;
	}

	public int getTotalCount() {

		return this.messageDao.getTotalCount();
	}

	public List<Message> queryPages(int start, int offset,User user) {
		
		return this.messageDao.queryPages(start, offset,user);
	}

	public List<Message> queryAdminPages(int start, int offset) {

		return  this.messageDao.queryAdminPages(start, offset);
	}

	@Override
	public void delete(int  id) {
		Message message=this.messageDao.findMessageById(id);
		this.messageDao.deleteMessage(message);
		
	}


}
