package cn.htu.dao;

import cn.htu.bean.User;

public interface UserDao {
	
	public void saveUser(User user);
	
	public String checkLogin(String username,String password);
	public User getUserbyUserCode(String usercode);

}
