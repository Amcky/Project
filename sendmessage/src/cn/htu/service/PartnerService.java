package cn.htu.service;

import java.util.List;

import cn.htu.bean.Partner;

public interface PartnerService {
	
	public void addPartner(Partner partner);
	
	public List<Partner> getPartnerList();

}
