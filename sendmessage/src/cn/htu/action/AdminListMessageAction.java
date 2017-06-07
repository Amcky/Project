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
		int totalCounts = messageService.getTotalCount();// �õ�AP�ܵļ�¼��
		Pager p = new Pager(page, totalCounts);
		
/*		System.out.println("���ݿ��ܼ�¼��:" + totalCounts);
		System.out.println(page); // pageΪ��ǰҳ��
		System.out.println("��ǰҳ:" + page);
		System.out.println("��һҳ:" + p.getFirstPage());
		System.out.println("ǰһҳ:" + p.getPrePage());
		System.out.println("��һҳ:" + p.getNextPage());
		System.out.println("���һҳ:" + p.getLastPage());
		System.out.println("��ҳ��:" + p.getTotalpages());
		System.out.println("ÿҳ��ʾ:" + p.getSize());*/
		

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
