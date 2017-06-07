package Linux.server;

import java.util.List;

import Linux.po.forward;

public interface forwardserver {
	public void addforward(forward a);
	public List<forward> showallforward();
}
