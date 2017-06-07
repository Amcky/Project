package cn.htu.bean;

import java.util.HashSet;
import java.util.Set;

public class Partner {
	private int id;
	private String corpid;
	private String ipadress;
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIpadress() {
		return ipadress;
	}

	public void setIpadress(String ipadress) {
		this.ipadress = ipadress;
	}

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getCorpid() {
		return corpid;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
