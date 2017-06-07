package lty.clubServices.luntan.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.luntan.entity.Posts;
import lty.clubServices.luntan.entity.T_user;
import lty.clubServices.luntan.fenye.Page;
import lty.clubServices.luntan.fenye.Result;
import lty.clubServices.luntan.server.PostsService;
import lty.clubServices.luntan.server.UserService;

public class showAllPostsByType extends ActionSupport {
	private String type;
	private PostsService postsService;
	private int currentPage;
	private UserService userservice;
	
	
	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public PostsService getPostsService() {
		return postsService;
	}

	public void setPostsService(PostsService postsService) {
		this.postsService = postsService;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String execute() throws Exception {
		Page page = new Page();
		page.setCurrentPage(this.getCurrentPage());
		page.setEveryPage(5);
		type  = new String(type.getBytes("ISO-8859-1") , "UTF-8");  
		Result result =postsService.queryAllByType(type, page);
		List<String> type=postsService.queryBytype();
		page = result.getPage();
		List<Posts> all = result.getList();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<T_user>  user=userservice.querryAll();
		request.setAttribute("user", user);
		request.setAttribute("all", all);
		request.setAttribute("page", page);
		request.setAttribute("type", type);
		return SUCCESS;
	}
	

}
