package Linux.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Linux.dao.forwarddnsdao;
import Linux.po.forwarddns;

public class forwarddnsdaoimp extends HibernateDaoSupport implements forwarddnsdao {

	@Override
	public void addforwarddns(forwarddns a) {
		this.getHibernateTemplate().save(a);
		
	}

	@Override
	public List<forwarddns> showallforwarddns() {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query =  session.createQuery("from forwarddns");
				return query.list();
			}
			
		});
	}

}
