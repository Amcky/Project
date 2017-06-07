package Linux.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Linux.dao.addredao;
import Linux.po.addre;
import Linux.po.named;

public class addredaoimp extends HibernateDaoSupport implements addredao {

	@Override
	public void addaddre(addre a) {
		this.getHibernateTemplate().save(a);
	}

	@Override
	public List<addre> showaddrebyid(final int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("select art from addre art where art.pid = ?");
				query.setParameter(0, id);
				return query.list();
			}
		});
	}

	@Override
	public List<addre> showalladdre() {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query =  session.createQuery("from addre");
				return query.list();
			}
			
		});
	}

	@Override
	public void deladdre(addre a) {
		this.getHibernateTemplate().delete(a);
	}

	@Override
	public addre showaddre(int id) {
		List find = this.getHibernateTemplate().find("select art from addre art where art.id = ?", id);
		return (addre) find.get(0);
	}

	

}
