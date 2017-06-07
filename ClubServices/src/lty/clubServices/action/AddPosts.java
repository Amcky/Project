package lty.clubServices.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.entity.Posts;
import lty.clubServices.server.PostsService;

public class AddPosts extends ActionSupport {
	private String theme;
	private String text;
	private String name;
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private PostsService postservice;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public PostsService getPostservice() {
		return postservice;
	}

	public void setPostservice(PostsService postservice) {
		this.postservice = postservice;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String execute() throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		int kid = (Integer) session.get("kid");
		Posts posts=new Posts();
		posts.setText(text);
		posts.setKid(kid);
		posts.setTheme(theme);
		posts.setType(type);
		Date date = new Date();  
		posts.setStime(date);
		//Postsdao postdao=new Postsdaoimp();
		System.out.println("action"+this.name);
		postservice.addPosts(posts);
		//postdao.add(posts);
		return SUCCESS;
	}

}
