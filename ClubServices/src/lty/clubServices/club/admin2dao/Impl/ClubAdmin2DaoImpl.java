package lty.clubServices.club.admin2dao.Impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import lty.clubServices.club.admin2dao.ClubAdmin2Dao;
import lty.clubServices.club.entity.Club;

@Transactional
public class ClubAdmin2DaoImpl extends HibernateDaoSupport implements ClubAdmin2Dao {
	// dao层查询所有社团信息
	public List<Club> findAllClub() {
		// TODO Auto-generated method stub
		String hql = "from Club";
		List<Club> list = (List<Club>) this.getHibernateTemplate().find(hql);
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}

	@Override
	public void save(Club club) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(club);
	}

	@Override
	public void update(Club club) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(club);
	}

	@Override
	public Club findClub(int i) {
		// TODO Auto-generated method stub
		Club club = (Club) this.getHibernateTemplate().get(Club.class, i);
		if (club != null) {
			return club;
		}
		return null;
	}

	@Override
	public void delete(Club club) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(club);
	}

}
