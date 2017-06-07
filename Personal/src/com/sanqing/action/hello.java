package com.sanqing.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.fenye.Page;
import com.sanqing.fenye.Result;
import com.sanqing.po.Article;
import com.sanqing.service.ArticleService;

import net.sf.json.JSONObject;

public class hello extends ActionSupport
{

	private ArticleService articleService;
	private int currentPage;
	private String reg;
	private String res;
	
	


	public String getRes() {
		return res;
	}


	public void setRes(String res) {
		this.res = res;
	}


	public String getReg() {
		return reg;
	}


	public void setReg(String reg) {
		this.reg = reg;
	}


	public int getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	public ArticleService getArticleService() {
		return articleService;
	}


	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Page page = new Page();
		page.setCurrentPage(this.getCurrentPage());
		page.setEveryPage(20);
		reg=new String(reg.getBytes(),"utf-8");
		Result result = articleService.showArticleBySearch(page,reg );
		page = result.getPage();
		List<Article> all = result.getList();
		
		List critiqueCounts = new ArrayList();
		for(Article article : all) {
			critiqueCounts.add(articleService.getCritiqueCount(article.getId()));
		}
		
	
		
		
		//把查询到的结果保存在一个范围，request
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("all", all);
		request.setAttribute("page", page);
		request.setAttribute("critiqueCounts",critiqueCounts);
		return SUCCESS;
	}
	
}
