package cn.htu.service;

import cn.htu.bean.User;

public interface UserService {
	
	public void addUser(User user);
	
	public String isVerfy(String username,String password);
	
	public User findUserbyUserCode(String usercode);
}
