package lty.clubServices.luntan.dao.Impl;



import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import lty.clubServices.luntan.dao.Postsdao;
import lty.clubServices.luntan.entity.Posts;
import lty.clubServices.luntan.fenye.Page;

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
				// ����ÿҳ��ʾ���ٸ������ö����
				query.setMaxResults(page.getEveryPage());
				// �������
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

	@Override
	public int queryUserAllCount(int uid) {
		List find = this.getHibernateTemplate().find("select count(*) from Posts art where art.uid = ?",
				uid);
		return ((Long) find.get(0)).intValue();
	}

	@Override
	public List<Posts> queryUserAllByPage(final int uid, final Page page) {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("select art from Posts art where art.uid = ?");
				// ���ò���
				query.setParameter(0, uid);
				// ����ÿҳ��ʾ���ٸ������ö����
				query.setMaxResults(page.getEveryPage());
				// �������
				query.setFirstResult(page.getBeginIndex());
				return query.list();
			}

		});
	}

	@Override
	public void DletetPosts(Posts posts) {
		this.getHibernateTemplate().delete(posts);
		
	}

	@Override
	public List<String> queryBytype() {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				//Query query = session.createQuery("select art from Posts art order by art.stime desc");
				Query query = session.createQuery("select distinct type from Posts");
				
				return query.list();
			}
		});
	}

	@Override
	public List<Posts> queryAllByType(final String type, final Page page) {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("select art from Posts art where art.type = ?");
				// ���ò���
				query.setParameter(0, type);
				// ����ÿҳ��ʾ���ٸ������ö����
				query.setMaxResults(page.getEveryPage());
				// �������
				query.setFirstResult(page.getBeginIndex());
				return query.list();
			}

		});
	}

	@Override
	public int queryTypeAllCount(String type) {
		List find = this.getHibernateTemplate().find("select count(*) from Posts art where art.type = ?",type);
		return ((Long) find.get(0)).intValue();
	}

}
