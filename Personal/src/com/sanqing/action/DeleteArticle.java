package com.sanqing.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.service.ArticleService;

public class DeleteArticle extends ActionSupport 
{
	private int  id;
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private ArticleService articleService;
	public ArticleService getArticleService() {
		return articleService;
	}
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(username == null || "".equals(username)) {
			//首先要获得session
			Map session = ActionContext.getContext().getSession();
			//获得username
			username = (String) session.get("username");
		}
		articleService.delete(id,username);
		return SUCCESS;
	}
	
}
