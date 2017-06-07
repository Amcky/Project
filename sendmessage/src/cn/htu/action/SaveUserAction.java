package cn.htu.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.htu.bean.User;
import cn.htu.service.UserService;
import cn.htu.service.impl.UserServiceImpl;


public class SaveUserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserServiceImpl();;
	
	private User user;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public String execute() throws Exception {
		
		this.userService.addUser(user);
		return "success";
	}
}
