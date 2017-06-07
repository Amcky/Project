package lty.clubServices.luntan.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.luntan.entity.Comment;
import lty.clubServices.luntan.server.CommentService;

public class Reply  extends ActionSupport{
	private int pid;
	private int uid;
	private int kid;
	private int hid;
	private String panswer;
	private CommentService commentservice;
	
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public CommentService getCommentservice() {
		return commentservice;
	}
	public void setCommentservice(CommentService commentservice) {
		this.commentservice = commentservice;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getPanswer() {
		return panswer;
	}
	public void setPanswer(String panswer) {
		this.panswer = panswer;
	}
	@Override
	public String execute() throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		Comment comment=new Comment();
		if(hid!=0)
			comment.setHid(hid);
		else
			comment.setHid(pid);
		int uid = (Integer) session.get("uid");
		comment.setUid(uid);
		comment.setKid(kid);
		panswer  = new String(panswer.getBytes("ISO-8859-1") , "UTF-8");  
		comment.setPanswer(panswer);
		commentservice.add(comment);
		HttpServletRequest request = ServletActionContext.getRequest();
		String url="showposts.action?kid="+kid;
		request.setAttribute("url", url);
		return SUCCESS;
	}
	
	
}
