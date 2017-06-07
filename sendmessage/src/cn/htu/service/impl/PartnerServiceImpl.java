package cn.htu.service.impl;
import java.util.List;
import cn.htu.bean.Partner;
import cn.htu.dao.PartnerDao;
import cn.htu.service.PartnerService;

public class PartnerServiceImpl implements PartnerService {

	PartnerDao partnerDao;
	
	public PartnerDao getPartnerDao() {
		return partnerDao;
	}

	public void setPartnerDao(PartnerDao partnerDao) {
		this.partnerDao = partnerDao;
	}
	
	//保存集团信息
	public void addPartner(Partner partner) {
		
		this.partnerDao.saveUser(partner);
	}

	//获取集团信息列表
	public List<Partner> getPartnerList() {
		
		return this.partnerDao.listPartner();
		
	}

}
