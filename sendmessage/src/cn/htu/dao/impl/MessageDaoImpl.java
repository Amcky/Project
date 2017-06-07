package cn.htu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.htu.bean.Message;
import cn.htu.bean.Partner;
import cn.htu.bean.User;
import cn.htu.dao.MessageDao;

public class MessageDaoImpl extends HibernateDaoSupport implements MessageDao {

	@SuppressWarnings("unchecked")
	public List<Message> findAllMessages() {

		String hql = "from Message message where message.status = 0 order by message.id desc ";
		return (List<Message>) this.getHibernateTemplate().find(hql);
	}

	public Message findMessageById(Integer id) {

		Message message = (Message) this.getHibernateTemplate().get(
				Message.class, id);
		return message;
	}

	@SuppressWarnings("unchecked")
	public List<Message> findMessagesByCorpid(Partner partner) {
		String hql = "from Message message where message.status = 0 and message.partner.id='"
				+ partner.getId() + "' order by message.id desc ";
		return (List<Message>) this.getHibernateTemplate().find(hql);
	}

	@SuppressWarnings("unchecked")
	public List<Message> findMessagesByUserid(User user) {
		String hql = "from Message message where message.status = 0 and message.user.id='"
				+ user.getId() + "' order by message.id desc ";
		return (List<Message>) this.getHibernateTemplate().find(hql);
	}

	public void saveMessage(Message message) {
		this.getHibernateTemplate().save(message);
	}

	//获取总记录数
	@SuppressWarnings("unchecked")
	public int getTotalCount() {
		String hql = "from Message";
		List<Message> list = this.getHibernateTemplate().find(hql);
		return list.size();
	}
	
	//分页查询
	@SuppressWarnings("unchecked")
	public List<Message> queryPages(int start, int offset,User user) {
		
		   Session session=getSession();
		   String hql = "from Message message where message.status = 0 and message.user.id='"
				+ user.getId() + "' order by message.id desc ";
		   Query query=session.createQuery(hql).setFirstResult(start).setMaxResults(offset);
		   List<Message> list=query.list();
		   return list;
	}
	
	//分页查询
	@SuppressWarnings("unchecked")
	public List<Message> queryAdminPages(int start, int offset) {
		
		   Session session=getSession();
		   String hql = "from Message message where message.status = 0  order by message.id desc ";
		   Query query=session.createQuery(hql).setFirstResult(start).setMaxResults(offset);
		   List<Message> list=query.list();
		   return list;
	}

	@Override
	public void deleteMessage(Message a) {
		this.getHibernateTemplate().delete(a);
	}
}
