package Linux.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Linux.dao.returnandao;
import Linux.po.cname;
import Linux.po.returnan;

public class returnandaoimp extends HibernateDaoSupport implements returnandao{

	@Override
	public void addreturnan(returnan a) {
		this.getHibernateTemplate().save(a);
	}

	@Override
	public List<returnan> showreturnanbyid(final int id) {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("select art from returnan art where art.pid = ?");
				query.setParameter(0, id);
				return query.list();
			}
		});
	}

	@Override
	public void delreturnan(returnan a) {
		this.getHibernateTemplate().delete(a);
	}

	@Override
	public returnan showreturnan(int id) {
		List find = this.getHibernateTemplate().find("select art from cname art where art.id = ?", id);
		return (returnan) find.get(0);
	}

}
