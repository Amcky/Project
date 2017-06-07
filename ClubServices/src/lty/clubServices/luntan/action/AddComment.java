package lty.clubServices.luntan.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.luntan.entity.Comment;
import lty.clubServices.luntan.entity.Posts;
import lty.clubServices.luntan.server.CommentService;
import lty.clubServices.luntan.server.PostsService;

public class AddComment extends ActionSupport{
	private CommentService commentservice;
	private PostsService postsService;
	private int kid;
	private String comment;
	
	public PostsService getPostsService() {
		return postsService;
	}

	public void setPostsService(PostsService postsService) {
		this.postsService = postsService;
	}

	public int getKid() {
		return kid;
	}

	public void setKid(int kid) {
		this.kid = kid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public CommentService getCommentservice() {
		return commentservice;
	}

	public void setCommentservice(CommentService commentservice) {
		this.commentservice = commentservice;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		int uid = (Integer) session.get("uid");
		Posts  posts=postsService.showposts(kid);
		posts.setCritique(posts.getCritique()-1);
		postsService.addPosts(posts);
		Comment comment1=new Comment();
		comment  = new String(comment.getBytes("ISO-8859-1") , "UTF-8");  
		comment1.setKid(kid);
		comment1.setPanswer(comment);
		comment1.setUid(uid);
		commentservice.add(comment1);
		HttpServletRequest request = ServletActionContext.getRequest();
		String url="showposts.action?kid="+kid;
		request.setAttribute("url", url);
		return SUCCESS;
	}
	

}
