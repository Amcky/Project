package Linux.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Linux.dao.zonedao;
import Linux.po.zone;

public class zonedaoimp extends HibernateDaoSupport implements zonedao{

	@Override
	public void add(zone zone) {
	this.getHibernateTemplate().save(zone);
		
	}

	@Override
	public List<zone> showzone() {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("from zone ");
				return query.list();
			}
		});
	}

	@Override
	public zone showzoneById(int id) {
		List find = this.getHibernateTemplate().find("select art from zone art where art.id = ?", id);
		return (zone) find.get(0);
	}

	@Override
	public void deletezone(zone zone) {
		this.getHibernateTemplate().delete(zone);
	}



}
