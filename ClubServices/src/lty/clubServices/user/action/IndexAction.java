package lty.clubServices.user.action;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport{

	/**
	 * 只是做一个跳转的作用
	 */
	@Override
	public String execute() throws Exception {
		return "index";
	}

}
