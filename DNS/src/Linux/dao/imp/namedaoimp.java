package Linux.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Linux.dao.namedao;
import Linux.po.named;

public class namedaoimp  extends HibernateDaoSupport implements namedao{

	@Override
	public int addnamed(named name) {
		this.getHibernateTemplate().save(name);
		return name.getId();
	}

	@Override
	public List<named> shownamed() {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("from named ");
				return query.list();
			}
		});
	}

	@Override
	public void delete(named name) {
		this.getHibernateTemplate().delete(name);
		
	}

	@Override
	public named querById(int id) {
		List find = this.getHibernateTemplate().find("select art from named art where art.id = ?", id);
		return (named) find.get(0);
	}

	


}
