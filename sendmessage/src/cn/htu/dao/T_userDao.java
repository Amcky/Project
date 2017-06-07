package cn.htu.dao;

import java.util.List;

import cn.htu.bean.T_user;

public interface T_userDao {
		public void adduser(T_user a);
		public List<T_user> showalluser();
}
