package Linux.server;

import java.util.List;

import Linux.po.domain;

public interface domainserver {
	public void add(domain main);
	public List<domain>showdomain();
	public List<domain>showdomainById(int id);
	public void deletedomain(int  id);
}
