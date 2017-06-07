package Linux.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import Linux.Auxiliary.Shell;
import Linux.po.forward;
import Linux.po.forwarddns;
import Linux.server.forwarddnsserver;
import Linux.server.forwardserver;

import com.opensymphony.xwork2.ActionSupport;

public class showforward  extends ActionSupport{
	private forwardserver fserver;
	private Shell shell;
	private forwarddnsserver fdserver;
	
	public forwardserver getFserver() {
		return fserver;
	}

	public void setFserver(forwardserver fserver) {
		this.fserver = fserver;
	}

	public Shell getShell() {
		return shell;
	}

	public void setShell(Shell shell) {
		this.shell = shell;
	}

	public forwarddnsserver getFdserver() {
		return fdserver;
	}

	public void setFdserver(forwarddnsserver fdserver) {
		this.fdserver = fdserver;
	}

	@Override
	public String execute() throws Exception {
		List<forward> forward =fserver.showallforward();
		List<forwarddns> forwarddns=fdserver.showallforwarddns();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("forward", forward);
		request.setAttribute("forwarddns", forwarddns);
 		return SUCCESS;
	}

	
}
