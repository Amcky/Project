package lty.clubServices.club.entity;

import java.util.Date;

public class Club {
	private Integer cid;// 社团id
	private String cname;// 社团名称
	private Date buildtime;// 社团创建时间
	private String subject;// 社团方向
	private Integer members;// 成员数量
	private String place;// 社团地点
	private String image;// 社团图片
	private String introduce;// 社团介绍
	private String tname;

	/*
	 * private Teacher teacher;
	 */
	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Date getBuildtime() {
		return buildtime;
	}

	public void setBuildtime(Date buildtime) {
		this.buildtime = buildtime;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getMembers() {
		return members;
	}

	public void setMembers(Integer members) {
		this.members = members;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	/*
	 * public Teacher getTeacher() { return teacher; }
	 * 
	 * public void setTeacher(Teacher teacher) { this.teacher = teacher; }
	 */

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Club [cid=" + cid + ", cname=" + cname + ", bulidtime=" + buildtime + ", subject=" + subject
				+ ", members=" + members + ", place=" + place + ", image=" + image + ", introduce=" + introduce
				+ ", tname=" + tname + "]";
	}

}
