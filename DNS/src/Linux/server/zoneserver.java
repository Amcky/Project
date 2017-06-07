package Linux.server;

import java.util.List;

import Linux.po.zone;

public interface zoneserver {
	public void add(zone zone);
	public List<zone> showzone();
	public zone showzoneById(int id);
	public void deletezone(int id);
}
