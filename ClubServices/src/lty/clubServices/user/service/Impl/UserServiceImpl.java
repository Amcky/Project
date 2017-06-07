package lty.clubServices.user.service.Impl;

import lty.clubServices.user.dao.Impl.UserDaoImpl;
import lty.clubServices.user.entity.User;
import lty.clubServices.user.service.UserService;




public class UserServiceImpl implements UserService{

	private UserDaoImpl userDaolmpl;

	
	public UserDaoImpl getUserDaolmpl() {
		return userDaolmpl;
	}
	public void setUserDaolmpl(UserDaoImpl userDaolmpl) {
		this.userDaolmpl = userDaolmpl;
	}
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDaolmpl.login(user);
	}
	//查找名字，防止注册的时候注册名重复
	public User findByUsername(String userName) {
		return userDaolmpl.findByUsername(userName);
	}
	//保存注册的数据
	public void save(User user) {
		// TODO Auto-generated method stub
		userDaolmpl.save(user);
		
	}
	

	//用户找回密保问题的实现：
	public User fingBySquestion(User user)
	{
		return userDaolmpl.findBySquestion(user);
	}
	//用户找回密码的实现：
	public User fingByPassword(User user)
	{
		return userDaolmpl.findByPassword(user);
	}
	
	
}