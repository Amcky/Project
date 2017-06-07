package cn.htu.service.impl;

import java.util.List;

import cn.htu.bean.T_user;
import cn.htu.dao.T_userDao;
import cn.htu.service.T_userService;

public class T_userServiceImpl implements T_userService {
	private T_userDao userdao;

	public T_userDao getUserdao() {
		return userdao;
	}

	public void setUserdao(T_userDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public void adduser(T_user a) {
		this.userdao.adduser(a);
	}

	@Override
	public List<T_user> showalluser() {
		// TODO Auto-generated method stub
		return this.userdao.showalluser();
	}

}
