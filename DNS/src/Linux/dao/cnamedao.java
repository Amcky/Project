package Linux.dao;

import java.util.List;

import Linux.po.cname;

public interface cnamedao {
	public void addcname(cname a);
	public List<cname> showcnamebyid(int id);
	public void delcname(cname a );
	public cname showcname(int id);
}
