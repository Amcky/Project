package cn.htu.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.htu.bean.Department;
import cn.htu.dao.DepartmentDao;

public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao{

	@Override
	public void adddepartment(Department a) {
		this.getHibernateTemplate().save(a);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> showalldepartment() {
//		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
//			public Object doInHibernate(Session session) throws HibernateException, SQLException {
//				Query query = session.createQuery("select art from Department art order by art.id desc");
//				return query.list();
//			}
//		});	}
		return (List<Department>)this.getHibernateTemplate().find("from Department");
	}

}
