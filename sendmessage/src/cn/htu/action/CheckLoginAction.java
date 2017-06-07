package cn.htu.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.htu.bean.User;
import cn.htu.service.UserService;

public class CheckLoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserService userService;

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {

		String result = this.userService.isVerfy(user.getUsercode(), user
				.getUserpass());

		Map session = (Map) ActionContext.getContext().getSession();
		
		session.put("tip", result);
		session.put("username", user.getUsercode());
		if ("OK".equals(result)) {
			session.put("usercode", user.getUsercode());
			//获取权限
			session.put("pre", user.getPre());
			System.out.println(result);
			return "success";
		} else {
			
			this.addFieldError("user.usercode", "username or password error");
			return "error";
		}
	}
}
