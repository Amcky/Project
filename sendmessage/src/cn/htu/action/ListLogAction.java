package cn.htu.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.htu.bean.Log;
import cn.htu.bean.Message;
import cn.htu.bean.User;
import cn.htu.service.LogService;
import cn.htu.service.UserService;
import cn.htu.util.page.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ListLogAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LogService logService;

	private UserService userService;
	
	private Log log;

	int page = 1;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setLogService(LogService logService) {
		this.logService = logService;
	}

	public LogService getLogService() {
		return logService;
	}

	//分页函数
	public String pagerList() {

		HttpServletRequest request = ServletActionContext.getRequest();
		int totalCounts = logService.getTotalCount();// 得到Log总的记录数
		System.out.println("数据库总记录数:" + totalCounts);
		System.out.println(page); // page为当前页码
		Pager p = new Pager(page, totalCounts);
		System.out.println("当前页:" + page);
		System.out.println("第一页:" + p.getFirstPage());
		System.out.println("前一页:" + p.getPrePage());
		System.out.println("后一页:" + p.getNextPage());
		System.out.println("最后一页:" + p.getLastPage());
		System.out.println("总页数:" + p.getTotalpages());
		System.out.println("每页显示:" + p.getSize());

		Map session = (Map) ActionContext.getContext().getSession();
		String usercode = session.get("usercode").toString();
		User user = this.userService.findUserbyUserCode(usercode);
		List<Log> pagerList = logService.queryPages(p
				.getStartposition(), p.getSize(), user);
		request.setAttribute("p", p);
		request.setAttribute("LogList", pagerList);
		return SUCCESS;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	public Log getLog() {
		return log;
	}

}
