package lty.clubServices.luntan.dao.Impl;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import lty.clubServices.luntan.dao.CommentDao;
import lty.clubServices.luntan.entity.Comment;

public class CommentDaoimp extends HibernateDaoSupport implements CommentDao{

	@Override
	public void addComment(Comment comment) {
		this.getHibernateTemplate().saveOrUpdate(comment);
		
	}

	@Override
	public List<Comment> queryById(final int id) {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("select art from Comment art where art.kid =? and hid =0");
				query.setParameter(0, id);
				return query.list();
			}
		});
	}

	@Override
	public void deleteComment(Comment comment) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(comment);
	}

	@Override
	public List<Comment> querytwoById(final int id) {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("select art from Comment art where art.kid =? and hid<>0");
				query.setParameter(0, id);
				return query.list();
			}
		});
	}



}
