package Linux.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Linux.dao.forwarddao;
import Linux.po.forward;

public class forwarddaoimp extends HibernateDaoSupport implements forwarddao{

	@Override
	public void addforward(forward a) {
		this.getHibernateTemplate().saveOrUpdate(a);
	}

	@Override
	public List<forward> showallforward() {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query =  session.createQuery("from forward");
				return query.list();
			}
			
		});
	}

}
