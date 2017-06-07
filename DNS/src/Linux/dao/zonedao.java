package Linux.dao;

import java.util.List;

import Linux.po.zone;

public interface zonedao {
	public void add(zone zone);
	public List<zone> showzone();
	public zone showzoneById(int id);
	public void deletezone(zone zone);
}
