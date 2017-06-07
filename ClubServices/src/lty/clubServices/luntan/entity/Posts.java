package lty.clubServices.luntan.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Posts {
	private int kid;
	private int uid;
	private String theme;
	private String text;
	private int critique;
	private  Date stime;
	private String type;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
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
	public int getCritique() {
		return critique;
	}
	public void setCritique(int critique) {
		this.critique = critique;
	}
	public Date getStime() {
		return stime;
	}
	public void setStime(Date stime) {
		this.stime = stime;
	}
	
}
