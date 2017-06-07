package lty.clubServices.luntan.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.luntan.entity.Posts;
import lty.clubServices.luntan.entity.T_user;
import lty.clubServices.luntan.fenye.Page;
import lty.clubServices.luntan.fenye.Result;
import lty.clubServices.luntan.server.PostsService;
import lty.clubServices.luntan.server.UserService;

public class ShowAllPosts extends ActionSupport{
	private PostsService postsService;
	private int currentPage;
	private UserService userservice;
	
	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public PostsService getPostsService() {
		return postsService;
	}

	public void setPostsService(PostsService postsService) {
		this.postsService = postsService;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Page page = new Page();
		page.setCurrentPage(this.getCurrentPage());
		page.setEveryPage(5);
		List<String> type=postsService.queryBytype();
		Result result = postsService.showPostsByPage(page);
		page = result.getPage();
		List<Posts> all = result.getList();
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String name = (String) session.get("username");
		HttpServletRequest request = ServletActionContext.getRequest();
		List<T_user>  user=userservice.querryAll();
		request.setAttribute("user", user);
		request.setAttribute("all", all);
		request.setAttribute("page", page);
		request.setAttribute("type", type);
		

		
		
		return SUCCESS;
	}

	
}
