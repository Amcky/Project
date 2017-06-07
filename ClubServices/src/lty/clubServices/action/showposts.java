package lty.clubServices.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.entity.Posts;
import lty.clubServices.server.PostsService;

public class showposts extends ActionSupport{
	private int kid;
	private PostsService postservice;
	
	

	public int getKid() {
		return kid;
	}

	public void setKid(int kid) {
		this.kid = kid;
	}

	public PostsService getPostservice() {
		return postservice;
	}

	public void setPostservice(PostsService postservice) {
		this.postservice = postservice;
	}

	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		Posts posts=postservice.showposts(kid);
		posts.setCritique(posts.getCritique()+1);
		postservice.addPosts(posts);
		request.setAttribute("posts", posts);
		return SUCCESS;
	}

}
