package Linux.server;

import java.util.List;

import Linux.po.addre;

public interface addreserver {
	public void addaddre(addre a);
	public List<addre> showaddrebyid(int id);
	public void deladdre(addre a);
	public addre showaddre(int id);
}
