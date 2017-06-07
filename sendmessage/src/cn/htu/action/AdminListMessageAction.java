package cn.htu.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.htu.bean.Message;
import cn.htu.bean.User;
import cn.htu.service.MessageService;
import cn.htu.service.UserService;
import cn.htu.util.CharacterUtils;
import cn.htu.util.page.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AdminListMessageAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MessageService messageService;

	private UserService userService;

	private Message message;

	int page = 1;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public Message getMessage() {
		return message;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserService getUserService() {
		return userService;
	}

	@Override
	public String execute() throws Exception {

		Map session = (Map) ActionContext.getContext().getSession();

		String usercode = session.get("usercode").toString();

		User user = this.userService.findUserbyUserCode(usercode);

		List<Message> messageList = this.messageService
				.getMessagesByUserid(user);

		ActionContext.getContext().put("messageList", messageList);

		return "success";
	}

	public String pagerList() {

		HttpServletRequest request = ServletActionContext.getRequest();
		int totalCounts = messageService.getTotalCount();// 得到AP总的记录数
		Pager p = new Pager(page, totalCounts);
		
/*		System.out.println("数据库总记录数:" + totalCounts);
		System.out.println(page); // page为当前页码
		System.out.println("当前页:" + page);
		System.out.println("第一页:" + p.getFirstPage());
		System.out.println("前一页:" + p.getPrePage());
		System.out.println("后一页:" + p.getNextPage());
		System.out.println("最后一页:" + p.getLastPage());
		System.out.println("总页数:" + p.getTotalpages());
		System.out.println("每页显示:" + p.getSize());*/
		

		//Map session = (Map) ActionContext.getContext().getSession();
		//String usercode = session.get("usercode").toString();
		//User user = this.userService.findUserbyUserCode(usercode);
		List<Message> pagerList = messageService.queryAdminPages(p
				.getStartposition(), p.getSize());
		request.setAttribute("p", p);
		request.setAttribute("apList", pagerList);
		return SUCCESS;
	}

}
