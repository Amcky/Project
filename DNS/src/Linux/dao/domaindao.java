package Linux.dao;

import java.util.List;

import Linux.po.domain;

public interface domaindao {
	public void add(domain main);
	public List<domain> showalldomain();
	public List<domain> showalldomainById(int id);
	public void dletetdomain(domain domain);
}
