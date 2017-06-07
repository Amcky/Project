package Linux.dao;

import java.util.List;

import Linux.po.named;

public interface namedao {
	//���named
	public int addnamed(named name);
	
	public List<named> shownamed();
	//ɾ��һ����¼
	public void delete(named name);
	//����ID��ѯ
	public named querById(int id);
	//
}
