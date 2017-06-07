package Linux.action;

import java.util.List;

import Linux.po.addre;
import Linux.po.cname;
import Linux.po.mail;
import Linux.po.returnan;
import Linux.server.addreserver;
import Linux.server.cnameserver;
import Linux.server.mailserver;
import Linux.server.namedserver;
import Linux.server.returnanserver;
import Linux.server.zoneserver;

import com.opensymphony.xwork2.ActionSupport;

public class deleteDNS  extends ActionSupport{
	private namedserver nserver;
	private zoneserver zserver;
	private addreserver  aserver;
	private cnameserver cserver;
	private mailserver mserver;
	private returnanserver rserver;
	private int id;


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

	public returnanserver getRserver() {
		return rserver;
	}

	public void setRserver(returnanserver rserver) {
		this.rserver = rserver;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		nserver.delete(id);
		zserver.deletezone(id);
		List<addre> addre=aserver.showaddrebyid(id);
		for(addre a:addre){
			aserver.deladdre(a);
		}
		List<cname> cname=cserver.showcnamebyid(id);
		for(cname a:cname){
			cserver.delcname(a);
		}
		List<mail> mail=mserver.showmailbyid(id);
		for(mail a:mail){
			mserver.delmail(a);
		}
		List<returnan> returnan=rserver.showreturnanbyid(id);
		for(returnan a:returnan){
			rserver.delreturnan(a);
		}
		return SUCCESS;
	}

}
