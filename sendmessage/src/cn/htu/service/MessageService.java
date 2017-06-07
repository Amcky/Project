package cn.htu.service;

import java.util.List;

import cn.htu.bean.Message;
import cn.htu.bean.Partner;
import cn.htu.bean.User;

public interface MessageService {

	public void addMessage(Message message);

	public Message getMessageById(Integer id);

	public List<Message> getAllMessages();
	
	public List<Message> getMessagesByUserid(User user);
	
	public List<Message> getMessagesByPartnerid(Partner partner);
	
	public List<Message> findMessagesByCorpid(Partner partner);
	
	public int getTotalCount();
	
	public List<Message> queryPages(int start,int offset,User user);

	public List<Message> queryAdminPages(int start, int offset);

	public void delete(int id);
}
