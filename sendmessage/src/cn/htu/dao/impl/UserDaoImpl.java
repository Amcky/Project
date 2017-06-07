package cn.htu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.htu.bean.User;
import cn.htu.dao.UserDao;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public String checkLogin(String username, String password) {

		String hql = "from User user where user.usercode='" + username + "'";
		List<User> list = this.getHibernateTemplate().find(hql);
		String result = null;
		
		
		if (list.size() > 0) {
			User user = list.get(0);
		
			if (password.equals(user.getUserpass()))
				result = "OK";
			else
				result = "PWD";
		}
		else
		{
			result = "NoUser";
			
		}
		return result;
	}

	public void saveUser(User user) {

		this.getHibernateTemplate().save(user);
	}

	public User getUserbyUserCode(String usercode) {
		String hql = "from User user where user.usercode='" + usercode + "'";
		List<User> list = this.getHibernateTemplate().find(hql);
		User user = null;
		user = list.get(0);
		return user;
	}

}
