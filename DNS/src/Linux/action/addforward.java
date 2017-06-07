package Linux.action;

import java.io.FileWriter;
import java.util.List;

import Linux.Auxiliary.Shell;
import Linux.po.forward;
import Linux.po.forwarddns;
import Linux.server.forwarddnsserver;
import Linux.server.forwardserver;

import com.opensymphony.xwork2.ActionSupport;

public class addforward extends ActionSupport {
	private forwardserver fserver;
	private Shell shell;
	private forwarddnsserver fdserver;
	private List<forwarddns>  forwarddns;
	private String type;
	public static String namedpath="/etc/named.conf";
	
	public Shell getShell() {
		return shell;
	}

	public void setShell(Shell shell) {
		this.shell = shell;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<forwarddns> getForwarddns() {
		return forwarddns;
	}

	public void setForwarddns(List<forwarddns> forwarddns) {
		this.forwarddns = forwarddns;
	}

	public forwardserver getFserver() {
		return fserver;
	}

	public void setFserver(forwardserver fserver) {
		this.fserver = fserver;
	}

	public forwarddnsserver getFdserver() {
		return fdserver;
	}

	public void setFdserver(forwarddnsserver fdserver) {
		this.fdserver = fdserver;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		forward obj=new forward();
		obj.setId(0);
		obj.setType(type);
		fserver.addforward(obj);
		FileWriter writer = new FileWriter(namedpath, false);
		writer.close();
		FileWriter writer1 = new FileWriter(namedpath, true);
		writer1.write(obj.toString());
		
		for(forwarddns a:forwarddns){
			fdserver.addforwaeddns(a);
			writer1.write(a.toString());
		}
		writer1.write(obj.tostring());
		writer1.close();
		return SUCCESS;
	}

}
