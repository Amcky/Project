package cn.htu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.htu.bean.Log;
import cn.htu.bean.Message;
import cn.htu.bean.User;
import cn.htu.dao.LogDao;

public class LogDaoImpl extends HibernateDaoSupport implements LogDao {

	public void saveLog(Log log) {
		
		this.getHibernateTemplate().save(log);

	}

	@SuppressWarnings("unchecked")
	public int getTotalCount() {
		
		String hql = "from User";
		List<Message> list = this.getHibernateTemplate().find(hql);
		return list.size();
	}

	public List<Log> queryPages(int start, int offset, User user) {

		   Session session=getSession();
		   String hql = "from Log log where log.status = 0 and log.user.id='"
				+ user.getId() + "' order by log.id desc ";
		   Query query=session.createQuery(hql).setFirstResult(start).setMaxResults(offset);
		   List<Log> list=query.list();
		   return list;
	}

	public List<Log> getLogsByUserid(User user) {
		
		String hql = "from Message message where message.status = 0 and message.user.id='"
			+ user.getId() + "' order by message.id desc ";
	return (List<Log>) this.getHibernateTemplate().find(hql);
	}

}
