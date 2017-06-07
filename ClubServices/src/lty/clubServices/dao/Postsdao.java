package lty.clubServices.dao;

import java.util.List;

import lty.clubServices.entity.Posts;
import lty.clubServices.fenye.Page;

public interface Postsdao {
	//��������
	public void add(Posts posts);
	//������������
	public int queryAllCount();
	//��ҳ��ѯ
	public List<Posts> queryAllByPage(Page page);
	//��id��ѯ����
	public Posts queryById(int id);
}
