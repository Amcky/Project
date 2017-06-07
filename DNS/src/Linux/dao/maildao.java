package Linux.dao;

import java.util.List;

import Linux.po.mail;

public interface maildao {
	public void addmail(mail a);
	public List<mail> showmailbyid(int id);
	public void delmail(mail a);
	public mail showmail(int id);
}
