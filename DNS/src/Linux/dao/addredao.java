package Linux.dao;

import java.util.List;

import Linux.po.addre;

public interface addredao {
	public void addaddre(addre a);
	public List<addre> showaddrebyid(int id);
	public List<addre> showalladdre();
	public void deladdre(addre a);
	public addre showaddre(int id);
}
