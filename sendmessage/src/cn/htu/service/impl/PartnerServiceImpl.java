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
	
	//���漯����Ϣ
	public void addPartner(Partner partner) {
		
		this.partnerDao.saveUser(partner);
	}

	//��ȡ������Ϣ�б�
	public List<Partner> getPartnerList() {
		
		return this.partnerDao.listPartner();
		
	}

}
