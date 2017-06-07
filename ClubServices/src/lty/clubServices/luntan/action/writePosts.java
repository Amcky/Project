package lty.clubServices.luntan.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.luntan.server.PostsService;

public class writePosts extends ActionSupport {
	private PostsService postsService;
	
	public PostsService getPostsService() {
		return postsService;
	}

	public void setPostsService(PostsService postsService) {
		this.postsService = postsService;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		List<String> type=postsService.queryBytype();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("type", type);
		return SUCCESS;
	}
	

}
