package Linux.po;

public class domain {
private int id;
private String ip;
private String type;
private String domain;
private int pid;

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
@Override
public String toString() {
	return this.getDomain()+" A  "+this.getIp()+"\n";
}
public String toStringReverse()
{
	return this.getIp()+" PTR "+this.getDomain()+".\n";
}

}
