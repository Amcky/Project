package cn.htu.bean;

public class Message {
	private int id;
	private String jshm;
	private String dxnr;

	//发送人员
	private User user;
	
	// FSBJ发送标记，是否已经发送，默认为0
	private int fsbj;
	private String fssj;
	private String zb;

	// SP运营商 0移动 1 联通 2其他
	private String sp;
	// Status 0 默认 激活，1删除
	private String status;
	private double fee;
	private Partner partner;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJshm() {
		return jshm;
	}

	public void setJshm(String jshm) {
		this.jshm = jshm;
	}

	public String getDxnr() {
		return dxnr;
	}

	public void setDxnr(String dxnr) {
		this.dxnr = dxnr;
	}

	public int isFsbj() {
		return fsbj;
	}

	public void setFsbj(int fsbj) {
		this.fsbj = fsbj;
	}

	public String getFssj() {
		return fssj;
	}

	public void setFssj(String fssj) {
		this.fssj = fssj;
	}

	public String getZb() {
		return zb;
	}

	public void setZb(String zb) {
		this.zb = zb;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	public Partner getPartner() {
		return partner;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setSp(String sp) {
		this.sp = sp;
	}

	public String getSp() {
		return sp;
	}

	

}
