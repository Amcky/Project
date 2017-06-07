package Linux.po;

public class zone {
private int id;
private String name;
private String ip;
private String ttl;
private String serial;
private String refresh;
private String retry;
private String expire;
private String minimum;
private int pid;


public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getMinimum() {
	return minimum;
}
public void setMinimum(String minimum) {
	this.minimum = minimum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
@Override
public String toString() {
	return   "$TTL "+this.getTtl()+"\n" +
    "$ORIGIN "+this.getName()+".\n" +
    "@       IN SOA  @ rname.invalid. (\n" +
    "                                        "+this.getSerial()+"       ; serial\n" +
    "                                        "+this.getRefresh()+"     ; refresh\n" +
    "                                         "+this.getRetry()+"     ; retry\n" +
    "                                        "+this.getExpire()+"     ; expire\n" +
    "                                        "+this.getMinimum()+" )    ; minimum\n" +
    "        IN  NS      @\n" +
    "        A       "+this.getIp()+"\n";
}



public String toStringReverse()
{
	return "$TTL "+this.ttl+"\n" +
                "@ IN SOA ns1."+this.getName()+". admin."+this.getName()+". (\n" +
                "                                        "+this.getSerial()+"       ; serial\n" +
                "                                        "+this.getRefresh()+"     ; refresh\n" +
                "                                         "+this.getRetry()+"     ; retry\n" +
                "                                        "+this.getExpire()+"     ; expire\n" +
                "                                        "+this.getMinimum()+" )    ; minimum\n" +
                " IN NS "+this.getName()+".\n";
	
}





}
