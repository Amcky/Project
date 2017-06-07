package cn.htu.dao;

import java.util.List;

import cn.htu.bean.Partner;


public interface PartnerDao {
	
	public void saveUser(Partner partner);
	public List<Partner>listPartner();

}
