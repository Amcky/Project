package cn.htu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.htu.bean.Department;
import cn.htu.bean.T_user;
import cn.htu.dao.T_userDao;

public class T_userDaoImpl extends HibernateDaoSupport implements T_userDao {

	@Override
	public void adduser(T_user a) {
			this.getHibernateTemplate().save(a);
	}

	@Override
	public List<T_user> showalluser() {
		return (List<T_user>)this.getHibernateTemplate().find("from T_user");
	}

}
