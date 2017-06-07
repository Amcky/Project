package lty.clubServices.luntan.entity;

public class Comment {
	private int pid;   //评论ID
	private int kid;    //评论帖子的ID
	private int uid;    //用户ID
	private String panswer; //回复的内容
	private int hid;     //回复评论的ID
	
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
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
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getPanswer() {
		return panswer;
	}
	public void setPanswer(String panswer) {
		this.panswer = panswer;
	}
	
}
