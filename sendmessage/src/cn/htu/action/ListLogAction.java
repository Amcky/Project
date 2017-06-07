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

	//��ҳ����
	public String pagerList() {

		HttpServletRequest request = ServletActionContext.getRequest();
		int totalCounts = logService.getTotalCount();// �õ�Log�ܵļ�¼��
		System.out.println("���ݿ��ܼ�¼��:" + totalCounts);
		System.out.println(page); // pageΪ��ǰҳ��
		Pager p = new Pager(page, totalCounts);
		System.out.println("��ǰҳ:" + page);
		System.out.println("��һҳ:" + p.getFirstPage());
		System.out.println("ǰһҳ:" + p.getPrePage());
		System.out.println("��һҳ:" + p.getNextPage());
		System.out.println("���һҳ:" + p.getLastPage());
		System.out.println("��ҳ��:" + p.getTotalpages());
		System.out.println("ÿҳ��ʾ:" + p.getSize());

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
