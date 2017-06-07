package Linux.po;

public class mail {
	private int id;
	private int priority;    //youxianji
	private String logo;
	private String server;
	private int pid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "IN MX   "+this.priority+"  "+this.logo+"\n";
	}
	public String toString1(){
		return this.logo+" IN A  "+this.server+"\n";
	}
	

}
