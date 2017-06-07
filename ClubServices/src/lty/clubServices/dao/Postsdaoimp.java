package lty.clubServices.dao;



import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import lty.clubServices.entity.Posts;
import lty.clubServices.fenye.Page;

public class Postsdaoimp extends HibernateDaoSupport  implements Postsdao{

	@Override
	public void add(Posts posts) {
		this.getHibernateTemplate().saveOrUpdate(posts);
	}

	@Override
	public int queryAllCount() {
		List find = this.getHibernateTemplate().find("select count(*) from Posts ");
		return ((Long) find.get(0)).intValue();
	}

	@Override
	public List<Posts> queryAllByPage(final Page page) {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("select art from Posts art order by art.stime desc");
				// 设置每页显示多少个，设置多大结果。
				query.setMaxResults(page.getEveryPage());
				// 设置起点
				query.setFirstResult(page.getBeginIndex());
				return query.list();
			}
		});
	}

	@Override
	public Posts queryById(int id) {
		List find = this.getHibernateTemplate().find("select art from Posts art where art.id = ?", id);
		return (Posts) find.get(0);
	}

}
