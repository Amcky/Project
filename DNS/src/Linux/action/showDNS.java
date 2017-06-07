package Linux.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import Linux.po.domain;
import Linux.po.named;
import Linux.po.zone;
import Linux.server.domainserver;
import Linux.server.namedserver;
import Linux.server.zoneserver;

import com.opensymphony.xwork2.ActionSupport;

public class showDNS extends ActionSupport{
	private namedserver nserver;
	private zoneserver zserver;
	
	

	public zoneserver getZserver() {
		return zserver;
	}

	public void setZserver(zoneserver zserver) {
		this.zserver = zserver;
	}

	public namedserver getNserver() {
		return nserver;
	}

	public void setNserver(namedserver nserver) {
		this.nserver = nserver;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		List<named> named=nserver.shownamed();
		List<zone> zone=zserver.showzone();
		request.setAttribute("named", named);
		request.setAttribute("zone", zone);
		return SUCCESS;
	}

}
