package lty.clubServices.luntan.entity;

public class Comment {
	private int pid;   //����ID
	private int kid;    //�������ӵ�ID
	private int uid;    //�û�ID
	private String panswer; //�ظ�������
	private int hid;     //�ظ����۵�ID
	
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
