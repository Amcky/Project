package lty.clubServices.luntan.server;

import java.util.List;

import lty.clubServices.luntan.entity.T_user;

public interface UserService {
		//通过ID查询username
		public String findusername(int uid);
		//查询所有用户信息
		public  List<T_user> querryAll();
}
