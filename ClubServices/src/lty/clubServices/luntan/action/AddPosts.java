package lty.clubServices.luntan.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.luntan.entity.Posts;
import lty.clubServices.luntan.server.PostsService;

public class AddPosts extends ActionSupport {
	private String theme;
	private String text;
	private String name;
	private String type;
	private PostsService postservice;
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
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
		int kid = (Integer) session.get("uid");
		Posts posts=new Posts();
		text  = new String(text.getBytes("ISO-8859-1") , "UTF-8");  
		posts.setText(text);
		posts.setUid(kid);
		theme  = new String(theme.getBytes("ISO-8859-1") , "UTF-8");  
		posts.setTheme(theme);
		type  = new String(type.getBytes("ISO-8859-1") , "UTF-8"); 
		posts.setType(type);
		Date date = new Date();  
		posts.setStime(date);
		//Postsdao postdao=new Postsdaoimp();
		postservice.addPosts(posts);
		HttpServletRequest request = ServletActionContext.getRequest();
		String url="writePosts.action";
		request.setAttribute("url", url);
		request.setAttribute("reply", "·¢Ìû³É¹¦");
		return SUCCESS;
	}

}
