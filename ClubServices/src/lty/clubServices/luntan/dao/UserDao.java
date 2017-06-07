package lty.clubServices.luntan.dao;

import java.util.List;

import lty.clubServices.luntan.entity.T_user;

public interface UserDao {
	//ͨ��ID��ѯusername
	public String findusername(int uid);
	//��ѯ�����û���Ϣ
	public List<T_user> querryAll();
}
