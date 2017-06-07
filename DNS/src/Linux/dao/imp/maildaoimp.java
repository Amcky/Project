package Linux.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Linux.dao.maildao;
import Linux.po.cname;
import Linux.po.mail;

public class maildaoimp extends HibernateDaoSupport implements maildao{

	@Override
	public void addmail(mail a) {
		this.getHibernateTemplate().save(a);
	}

	@Override
	public List<mail> showmailbyid( final int id) {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("select art from mail art where art.pid = ?");
				query.setParameter(0, id);
				return query.list();
			}
		});
	}

	@Override
	public void delmail(mail a) {
		this.getHibernateTemplate().delete(a);
	}

	@Override
	public mail showmail(int id) {
		List find = this.getHibernateTemplate().find("select art from mail art where art.id = ?", id);
		return (mail) find.get(0);
	}

}
