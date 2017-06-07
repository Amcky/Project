package lty.clubServices.club.dao.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import lty.clubServices.club.dao.ClubSourceDao;
import lty.clubServices.club.entity.Club;
import lty.clubServices.club.entity.Look;
import lty.clubServices.club.entity.Source;

public class ClubSourceDaoImpl extends HibernateDaoSupport implements ClubSourceDao {

	@Override
	public void upLoadSource(Source s) {
		// TODO Auto-generated method stub
		// String hql = "insert into Source values(?) ";
		this.getHibernateTemplate().save(s);
	}

	@Override
	public List<Source> downSource() {
		// TODO Auto-generated method stub
		String hql = "from Source ";
		List<Source> list = this.getHibernateTemplate().find(hql);
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}

	@Override
	public List<Look> findAllLook() {
		// TODO Auto-generated method stub
		String hql = "from Look";
		List<Look> l = this.getHibernateTemplate().find(hql);
		if (l != null && l.size() > 0) {
			return l;
		}
		return null;
	}

	@Override
	public void updateL(Look look) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(look);
	}

	@Override
	public List<Club> findAllClubSourceUid(Integer uid) {
		// TODO Auto-generated method stub
				String hql = "from Source s where s.uid = ?";
				@SuppressWarnings("unchecked")
				List<Club> list = (List<Club>) this.getHibernateTemplate().find(hql, uid);
				list.get(0).setBuildtime(new Date());
				if (list != null && list.size() > 0) {
					return list;
				}
				return null;
	}

}
