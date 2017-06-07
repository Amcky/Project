package Linux.server;

import java.util.List;

import Linux.po.returnan;

public interface returnanserver {
	public void addreturnan(returnan a);
	public List<returnan> showreturnanbyid(int id);
	public void delreturnan(returnan a);
	public returnan showreturnan(int id);
}
