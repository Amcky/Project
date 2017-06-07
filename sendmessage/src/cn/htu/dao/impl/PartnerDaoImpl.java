package cn.htu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.htu.bean.Partner;
import cn.htu.dao.PartnerDao;

public class PartnerDaoImpl extends HibernateDaoSupport implements PartnerDao {

	@SuppressWarnings("unchecked")
	public List<Partner> listPartner() {

		String hql = "from Partner partner where partner.status = 0 order by partner.id desc ";
		return (List<Partner>) this.getHibernateTemplate().find(hql);
	}

	public void saveUser(Partner partner) {
		this.getHibernateTemplate().save(partner);
	}

}
