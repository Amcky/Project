package cn.htu.service.impl;

import cn.htu.bean.User;
import cn.htu.dao.UserDao;
import cn.htu.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) {

		this.userDao.saveUser(user);
	}

	public String isVerfy(String username, String password) {
		
		return this.userDao.checkLogin(username, password);
	}

	public User findUserbyUserCode(String usercode) {
		
		return this.userDao.getUserbyUserCode(usercode);
	}

	
	
}
