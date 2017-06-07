package Linux.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Linux.dao.domaindao;
import Linux.po.domain;

public class domaindaoimp extends HibernateDaoSupport  implements domaindao {

	@Override
	public void add(domain main) {
		this.getHibernateTemplate().save(main);
	}

	@Override
	public List<domain> showalldomain() {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query =  session.createQuery("from domain");
				return query.list();
			}
			
		});
	}

	@Override
	public List<domain> showalldomainById(final int id) {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("select art from domain art where art.pid = ?");
				query.setParameter(0, id);
				return query.list();
			}
		});
	}

	@Override
	public void dletetdomain(domain domain) {
		this.getHibernateTemplate().delete(domain);
		
	}

}
