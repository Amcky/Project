package lty.clubServices.luntan.action;

import java.util.List;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.luntan.dao.UserDao;
import lty.clubServices.luntan.entity.Comment;
import lty.clubServices.luntan.entity.Posts;
import lty.clubServices.luntan.entity.T_user;
import lty.clubServices.luntan.server.CommentService;
import lty.clubServices.luntan.server.PostsService;
import lty.clubServices.luntan.server.UserService;

public class showposts extends ActionSupport{
	private int kid;
	private PostsService postservice;
	private CommentService commentservice;
	private UserService userservice;

	
	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public CommentService getCommentservice() {
		return commentservice;
	}

	public void setCommentservice(CommentService commentservice) {
		this.commentservice = commentservice;
	}

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
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		int uid = (Integer) session.get("uid");
		String username=userservice.findusername(uid);
		List<Comment> comment=commentservice.queryById(kid);
		List<Comment> two=commentservice.querytwoById(kid);
		Posts posts=postservice.showposts(kid);
		posts.setCritique(posts.getCritique()+1);
		postservice.addPosts(posts);
		List<T_user>  user=userservice.querryAll();
		request.setAttribute("user", user);
		request.setAttribute("posts", posts);
		request.setAttribute("comment", comment);
		request.setAttribute("two", two);
		return SUCCESS;
	}

}
