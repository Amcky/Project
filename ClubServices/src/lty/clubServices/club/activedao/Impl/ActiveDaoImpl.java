package lty.clubServices.club.activedao.Impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import lty.clubServices.club.activedao.ActiveDao;
import lty.clubServices.club.entity.Active;

public class ActiveDaoImpl extends HibernateDaoSupport implements ActiveDao {

	@Override
	public void save(Active active) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(active);
	}

	@Override
	public List<Active> findAllClubActive() {
		// TODO Auto-generated method stub
		String hql = "from Active";
		List<Active> list = (List<Active>) this.getHibernateTemplate().find(hql);
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}

	@Override
	public Active findActive(Integer aid) {
		// TODO Auto-generated method stub
		Active a = (Active) this.getHibernateTemplate().get(Active.class, aid);
		if (a != null) {
			return a;
		}
		return null;
	}

	@Override
	public void update(Active tmpActive) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(tmpActive);
	}

	@Override
	public void delete(Active tmpActive) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(tmpActive);
	}

}
