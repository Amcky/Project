package Linux.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import Linux.po.addre;
import Linux.po.cname;
import Linux.po.mail;
import Linux.po.named;
import Linux.po.returnan;
import Linux.po.zone;
import Linux.server.addreserver;
import Linux.server.cnameserver;
import Linux.server.mailserver;
import Linux.server.namedserver;
import Linux.server.returnanserver;
import Linux.server.zoneserver;

import com.opensymphony.xwork2.ActionSupport;

public class showzone extends ActionSupport {
	private namedserver nserver;
	private zoneserver zserver;
	private addreserver  aserver;
	private cnameserver cserver;
	private mailserver mserver;
	
	private returnanserver rserver;
	private int id;
	
	
	public returnanserver getRserver() {
		return rserver;
	}

	public void setRserver(returnanserver rserver) {
		this.rserver = rserver;
	}

	public addreserver getAserver() {
		return aserver;
	}

	public void setAserver(addreserver aserver) {
		this.aserver = aserver;
	}

	public cnameserver getCserver() {
		return cserver;
	}

	public void setCserver(cnameserver cserver) {
		this.cserver = cserver;
	}

	public mailserver getMserver() {
		return mserver;
	}

	public void setMserver(mailserver mserver) {
		this.mserver = mserver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public namedserver getNserver() {
		return nserver;
	}

	public void setNserver(namedserver nserver) {
		this.nserver = nserver;
	}



	public zoneserver getZserver() {
		return zserver;
	}

	public void setZserver(zoneserver zserver) {
		this.zserver = zserver;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		named named=nserver.shownamedById(id);
		zone zone=zserver.showzoneById(id);
		List<addre> addre=aserver.showaddrebyid(id);
		List<cname> cname=cserver.showcnamebyid(id);
		List<mail> mail=mserver.showmailbyid(id);
		List<returnan> returnan=rserver.showreturnanbyid(id);
		request.setAttribute("returnan", returnan);
		request.setAttribute("addre", addre);
		request.setAttribute("cname", cname);
		request.setAttribute("mail", mail);
		request.setAttribute("named", named);
		request.setAttribute("zone", zone);
		return SUCCESS;
	}

}
