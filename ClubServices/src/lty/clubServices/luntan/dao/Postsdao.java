package lty.clubServices.luntan.dao;

import java.util.List;

import lty.clubServices.luntan.entity.Posts;
import lty.clubServices.luntan.fenye.Page;

public interface Postsdao {
	//��������
	public void add(Posts posts);
	//������������
	public int queryAllCount();
	//��ҳ��ѯ
	public List<Posts> queryAllByPage(Page page);
	//��id��ѯ����
	public Posts queryById(int id);
	//�����û���������
	public int queryUserAllCount(int uid);
	//�û���ҳ��ѯ
	public List<Posts> queryUserAllByPage(int uid,Page page);
	//ɾ������
	public void DletetPosts(Posts posts);
	//��ȡ���з���
	public List<String> queryBytype();
	//���շ�����ʾ
	public List<Posts> queryAllByType(String type,Page page);
	
	public int queryTypeAllCount(String type);
}
