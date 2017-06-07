package cn.htu.dao;

import java.util.List;

import cn.htu.bean.Message;
import cn.htu.bean.Partner;
import cn.htu.bean.User;

public interface MessageDao {

	public void saveMessage(Message message);

	public Message findMessageById(Integer id);

	public List<Message> findAllMessages();

	public List<Message> findMessagesByUserid(User user);

	public List<Message> findMessagesByCorpid(Partner partner);

	public int getTotalCount();
	// 查看个人操作记录
	public List<Message> queryPages(int start, int offset, User user);
	// 查看全部短信操作记录
	public List<Message> queryAdminPages(int start, int offset);
	public void deleteMessage(Message a);
}
