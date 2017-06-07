package Linux.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sun.istack.internal.FinalArrayList;

import Linux.dao.cnamedao;
import Linux.po.addre;
import Linux.po.cname;

public class cnamedaoimp extends HibernateDaoSupport implements cnamedao {

	@Override
	public void addcname(cname a) {
		this.getHibernateTemplate().save(a);
	}

	@Override
	public List<cname> showcnamebyid( final int id) {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("select art from cname art where art.pid = ?");
				query.setParameter(0, id);
				return query.list();
			}
		});
	}

	@Override
	public void delcname(cname a) {
		this.getHibernateTemplate().delete(a);
	}

	@Override
	public cname showcname(int id) {
		List find = this.getHibernateTemplate().find("select art from cname art where art.id = ?", id);
		return (cname) find.get(0);
	}

}
