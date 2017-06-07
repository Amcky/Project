package Linux.action;

import java.io.FileWriter;
import java.util.List;

import Linux.Auxiliary.Shell;
import Linux.po.addre;
import Linux.po.cname;
import Linux.po.mail;
import Linux.po.returnan;
import Linux.server.addreserver;
import Linux.server.cnameserver;
import Linux.server.mailserver;
import Linux.server.returnanserver;

import com.opensymphony.xwork2.ActionSupport;

public class adddomain extends ActionSupport {
	private List<addre> addre = null;
	private List<cname> cname = null;
	private List<mail> mail = null;
	private List<returnan> returnan = null;
	private Shell shell;
	private String name;
	private int id;
	private returnanserver rserver;
	private addreserver aserver;
	private cnameserver cserver;
	private mailserver mserver;

	public returnanserver getRserver() {
		return rserver;
	}

	public void setRserver(returnanserver rserver) {
		this.rserver = rserver;
	}

	public List<returnan> getReturnan() {
		return returnan;
	}

	public void setReturnan(List<returnan> returnan) {
		this.returnan = returnan;
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

	public Shell getShell() {
		return shell;
	}

	public void setShell(Shell shell) {
		this.shell = shell;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<addre> getAddre() {
		return addre;
	}

	public void setAddre(List<addre> addre) {
		this.addre = addre;
	}

	public List<cname> getCname() {
		return cname;
	}

	public void setCname(List<cname> cname) {
		this.cname = cname;
	}

	public List<mail> getMail() {
		return mail;
	}

	public void setMail(List<mail> mail) {
		this.mail = mail;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String path = "/var/named/" + this.name + ".zone";
		FileWriter writer = new FileWriter(path, true);
		if (addre != null) {
			for (addre a : addre) {
				writer.write(a.toString());
				a.setPid(id);
				aserver.addaddre(a);
			}
		}
		if (mail != null) {
			for (mail a : mail) {
				writer.write(a.toString());
				writer.write(a.toString1());
				a.setPid(id);
				mserver.addmail(a);
			}
		}
		if (cname != null) {
			for (cname a : cname) {
				writer.write(a.toString());
				a.setPid(id);
				cserver.addcname(a);
			}
		}
		if (returnan != null) {
			for (returnan a : returnan) {
				writer.write(a.toString());
				a.setPid(id);
				rserver.addreturnan(a);
			}
		}
		writer.close();
		System.out.println(shell.shell("/var/named/restart.sh"));
		return SUCCESS;
	}

}
