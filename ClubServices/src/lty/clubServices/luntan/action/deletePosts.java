package lty.clubServices.luntan.action;

import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.luntan.server.CommentService;
import lty.clubServices.luntan.server.PostsService;

public class deletePosts extends ActionSupport {
	private PostsService postsService;
	private CommentService commentservice;
	private int id;
	
	public CommentService getCommentservice() {
		return commentservice;
	}

	public void setCommentservice(CommentService commentservice) {
		this.commentservice = commentservice;
	}

	public PostsService getPostsService() {
		return postsService;
	}

	public void setPostsService(PostsService postsService) {
		this.postsService = postsService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		postsService.DletePosts(id);
		commentservice.deleteComment(id);
		return SUCCESS;
	}
	

}
