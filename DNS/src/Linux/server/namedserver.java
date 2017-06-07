package Linux.server;

import java.util.List;

import Linux.po.named;

public interface namedserver {
	public int add(named name);
	public List<named> shownamed();
	public void delete(int id);
	public named shownamedById(int id);
}
