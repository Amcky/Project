package lty.clubServices.luntan.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class login extends ActionSupport {
	private String username;
	
	private int uid;
	




	public int getUid() {
		return uid;
	}



	public void setUid(int uid) {
		this.uid = uid;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		session.put("username", username);
		session.put("uid", uid);
		System.out.print(username);
		return SUCCESS;
	}

}
