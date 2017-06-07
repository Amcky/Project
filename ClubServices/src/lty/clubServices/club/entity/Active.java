package lty.clubServices.club.entity;

import java.util.Date;

public class Active {
	private Integer aid;
	private String aname;// 活动名称
	private String des;// 活动描述
	private Date time;// 活动时间
	private String image;// 活动图片

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Active [aid=" + aid + ", aname=" + aname + ", des=" + des + ", time=" + time + ", image=" + image + "]";
	}

}
