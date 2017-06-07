package Linux.action;

import java.io.FileWriter;
import java.util.List;

import Linux.Auxiliary.Shell;
import Linux.po.domain;
import Linux.po.named;
import Linux.po.zone;
import Linux.server.domainserver;
import Linux.server.namedserver;
import Linux.server.zoneserver;

import com.opensymphony.xwork2.ActionSupport;

public class add extends ActionSupport {
	//private List<domain> domain;
	private String ip;
	private String dmain;
	private String ttl;
	private String serial;
	private String refresh;
	private String retry;
	private String expire;
	private String minimum;
	private namedserver nserver;
	private domainserver dserver;
	private zoneserver zserver;
	private Shell shell;
	private String description;
	
	


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMinimum() {
		return minimum;
	}

	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}

	public domainserver getDserver() {
		return dserver;
	}

	public void setDserver(domainserver dserver) {
		this.dserver = dserver;
	}

	public zoneserver getZserver() {
		return zserver;
	}

	public void setZserver(zoneserver zserver) {
		this.zserver = zserver;
	}

	public String getDmain() {
		return dmain;
	}

	public void setDmain(String dmain) {
		this.dmain = dmain;
	}

	public String getTtl() {
		return ttl;
	}

	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getRefresh() {
		return refresh;
	}

	public void setRefresh(String refresh) {
		this.refresh = refresh;
	}

	public String getRetry() {
		return retry;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}

	public String getExpire() {
		return expire;
	}

	public void setExpire(String expire) {
		this.expire = expire;
	}

	public Shell getShell() {
		return shell;
	}

	public void setShell(Shell shell) {
		this.shell = shell;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}



	public namedserver getNserver() {
		return nserver;
	}

	public void setNserver(namedserver nserver) {
		this.nserver = nserver;
	}

	@Override
	public String execute() throws Exception {
		named named = new named();
		named.setName(dmain);
		named.setDescription(description);
		named.setPid(0);
		int a=nserver.add(named);
		String namepath = "/etc/named.rfc1912.zones";
		String zonepath = "/var/named/" + named.getName() + ".zone";
		FileWriter writer = new FileWriter(namepath, true);
		writer.write(named.toString());
		writer.close();
		
		
		zone zone=new zone();
		zone.setId(a);
		zone.setIp(ip);
		zone.setTtl(ttl);
		zone.setName(dmain);
		zone.setRefresh(refresh);
		zone.setRetry(retry);
		zone.setSerial(serial);
		zone.setExpire(expire);
		zone.setMinimum(minimum);
		zone.setPid(0);
		zserver.add(zone);
		writer = new FileWriter(zonepath,false);
		writer.write(zone.toString());
		writer.close();
//		writer = new FileWriter(zonepath,true);
//		for(domain s:domain)
//		{
//			writer.write(s.toString());
//			s.setPid(a);
//			dserver.add(s);
//		}
//		writer.close();
		System.out.println(shell.zhixing("chown root:named /var/named/"+named.getName()+".zone"));
		System.out.println(shell.shell("/var/named/restart.sh"));
		return SUCCESS;
	}

}
