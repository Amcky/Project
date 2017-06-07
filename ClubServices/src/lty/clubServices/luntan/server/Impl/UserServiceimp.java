package lty.clubServices.luntan.server.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import lty.clubServices.luntan.dao.UserDao;
import lty.clubServices.luntan.entity.T_user;
import lty.clubServices.luntan.server.UserService;

@Transactional
public class UserServiceimp implements UserService {
	private UserDao userdao;
	
	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public String findusername(int uid) {
		return userdao.findusername(uid);
	}

	@Override
	public List<T_user> querryAll() {
		return userdao.querryAll();
	}

}
