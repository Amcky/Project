package lty.clubServices.luntan.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.luntan.entity.Posts;
import lty.clubServices.luntan.fenye.Page;
import lty.clubServices.luntan.fenye.Result;
import lty.clubServices.luntan.server.PostsService;

public class showUserAllPosts extends ActionSupport{
	private PostsService postservice;
	private int currentPage;
	private int uid;
	
	public PostsService getPostservice() {
		return postservice;
	}

	public void setPostservice(PostsService postservice) {
		this.postservice = postservice;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		int uid = (Integer) session.get("uid");
		String username=(String) session.get("username");
		Page page = new Page();
		page.setCurrentPage(this.getCurrentPage());
		page.setEveryPage(5);
		int kid = (Integer) session.get("uid");
		Result result = postservice.showUserArticleByPage(uid, page);
		page = result.getPage();
		List<Posts> all = result.getList();
		
		
		//把查询到的结果保存在一个范围，request
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("all", all);
		request.setAttribute("page", page);
		request.setAttribute("username", username);
		return SUCCESS; 
	}
	

}
