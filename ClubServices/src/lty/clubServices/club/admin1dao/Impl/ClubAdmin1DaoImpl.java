package lty.clubServices.club.admin1dao.Impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import lty.clubServices.club.admin1dao.ClubAdmin1Dao;
import lty.clubServices.club.entity.Club;

public class ClubAdmin1DaoImpl extends HibernateDaoSupport implements ClubAdmin1Dao {
	public List<Club> findClubCid(Integer cid) {
		// TODO Auto-generated method stub
		String hql = "from Club c where c.cid = ?";
		List<Club> list = (List<Club>) this.getHibernateTemplate().find(hql, cid);
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}

	@Override
	public void update(Club club) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(club);
	}

	@Override
	public Club findClub(Integer cid) {
		// TODO Auto-generated method stub
		Club club = (Club) this.getHibernateTemplate().get(Club.class, cid);
		if (club != null) {
			return club;
		}
		return null;

	}
}
