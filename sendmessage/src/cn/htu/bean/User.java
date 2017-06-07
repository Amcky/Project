package cn.htu.bean;

public class User {
	
	private int id;
	
	//教师工号，学生学号
	private String usercode;
	
	private String userpass;
	
	private String pre;
	
//	private Set<Message> messages = new HashSet<Message>();
//	private Set<Log> logs = new HashSet<Log>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public void setPre(String pre) {
		this.pre = pre;
	}

	public String getPre() {
		return pre;
	}

/*	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

	public Set<Message> getMessages() {
		return messages;
	}

	public void setLogs(Set<Log> logs) {
		this.logs = logs;
	}

	public Set<Log> getLogs() {
		return logs;
	}*/

}
