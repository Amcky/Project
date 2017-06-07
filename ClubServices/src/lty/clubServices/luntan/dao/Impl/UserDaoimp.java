package lty.clubServices.luntan.dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import lty.clubServices.luntan.dao.UserDao;
import lty.clubServices.luntan.entity.T_user;

public class UserDaoimp extends HibernateDaoSupport implements UserDao{

	@Override
	public String findusername(int uid) {
		List find=this.getHibernateTemplate().find("select username from T_user art where art.uid = ?",
				uid);
		return ((String) find.get(0));
	}

	@Override
	public List<T_user> querryAll() {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				//Query query = session.createQuery("select art from Posts art order by art.stime desc");
				Query query = session.createQuery("select uid,username from T_user");
				
				return query.list();
			}
		});
	}

}
