package lty.clubServices.user.dao.Impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import lty.clubServices.user.dao.UserDao;
import lty.clubServices.user.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	private static final String NULL = null;
	@Override
	// 用户登录的方法
			public User login(User user) {
				String hql = "from User where username = ? and password = ?";
				List<User> list = this.getHibernateTemplate().find(hql,
						user.getUserName(), user.getPassword());
				if (list != null && list.size() > 0) {
					return list.get(0);
				}
				return null;
			}
	//按照名称查询是否已经有名称了
	public User findByUsername(String username) {
		String hql="from User where username=?";
		List<User>list=this.getHibernateTemplate().find(hql,username);
		if(list!=null&&list.size()>0)
		 return list.get(0);
		else	
		return null;
	}
	public void save(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
		
	}
	
	

	//用户找回密保问题的实现
	public User findBySquestion(User user)
	{
	
		String hql="from User where sno=?";
		List<User>list=this.getHibernateTemplate().find(hql,user.getSno());
	
		if(list!=null&&list.size()>0)
		{
			return list.get(0);
		}
		return null;
	}
	//用户找回密码的实现
	public User findByPassword(User user)
	{
	
		String hql="from User where sresult=?";
		List<User>list=this.getHibernateTemplate().find(hql,user.getsresult());
	
		if(list!=null&&list.size()>0)
		{
			return list.get(0);
		}
		return null;
	}


}
