package lty.clubServices.club.dao.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import lty.clubServices.club.dao.ClubDao;
import lty.clubServices.club.entity.Club;

public class ClubDaoImpl extends HibernateDaoSupport implements ClubDao {
	// dao层查询所有社团信息
	public List<Club> findAllClub() {
		// TODO Auto-generated method stub
		String hql = "select club from Club club group by club.subject";
		List<Club> list = (List<Club>) this.getHibernateTemplate().find(hql);
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}

	public List<Club> findClubCid(Integer cid) {
		// TODO Auto-generated method stub
		String hql = "from Club c where c.cid = ?";
		@SuppressWarnings("unchecked")
		List<Club> list = (List<Club>) this.getHibernateTemplate().find(hql, cid);
		list.get(0).setBuildtime(new Date());
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}

}
