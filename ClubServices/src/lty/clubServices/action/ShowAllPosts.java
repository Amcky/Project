package lty.clubServices.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.entity.Posts;
import lty.clubServices.fenye.Page;
import lty.clubServices.fenye.Result;
import lty.clubServices.server.PostsService;

public class ShowAllPosts extends ActionSupport{
	private PostsService postsService;
	private int currentPage;
	
	public PostsService getPostsService() {
		return postsService;
	}

	public void setPostsService(PostsService postsService) {
		this.postsService = postsService;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Page page = new Page();
		page.setCurrentPage(this.getCurrentPage());
		page.setEveryPage(5);
		
		Result result = postsService.showPostsByPage(page);
		page = result.getPage();
		List<Posts> all = result.getList();
//		List critiqueCounts = new ArrayList();
//		for(Article article : all) {
//			critiqueCounts.add(articleService.getCritiqueCount(article.getId()));
//		}
		
		//把查询到的结果保存在一个范围，request
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String name = (String) session.get("username");
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("all", all);
		request.setAttribute("page", page);
		request.setAttribute("username", name);
	//	request.setAttribute("critiqueCounts",critiqueCounts);

		
		
		return SUCCESS;
	}

	
}
