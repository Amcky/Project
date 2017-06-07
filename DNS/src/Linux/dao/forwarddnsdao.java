package Linux.dao;

import java.util.List;

import Linux.po.forwarddns;

public interface forwarddnsdao {
	public void addforwarddns(forwarddns a);
	public List<forwarddns> showallforwarddns();
}
