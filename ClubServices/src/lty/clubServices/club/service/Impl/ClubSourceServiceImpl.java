package lty.clubServices.club.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import lty.clubServices.club.dao.ClubSourceDao;
import lty.clubServices.club.entity.Club;
import lty.clubServices.club.entity.Look;
import lty.clubServices.club.entity.Source;
import lty.clubServices.club.service.ClubSourceService;

@Transactional
public class ClubSourceServiceImpl implements ClubSourceService {
	private ClubSourceDao clubSourceDao;

	public void setClubSourceDao(ClubSourceDao clubSourceDao) {
		this.clubSourceDao = clubSourceDao;
	}

	@Override
	public void upLoadSource(Source s) {
		// TODO Auto-generated method stub
		clubSourceDao.upLoadSource(s);
	}

	@Override
	public List<Source> downSource() {
		// TODO Auto-generated method stub
		return clubSourceDao.downSource();
	}

	@Override
	public List<Look> findAllLook() {
		// TODO Auto-generated method stub
		return clubSourceDao.findAllLook();
	}

	@Override
	public void updateL(Look look) {
		// TODO Auto-generated method stub
		clubSourceDao.updateL(look);
	}

	@Override
	public List<Club> findClubSourceUid(int uid) {
		// TODO Auto-generated method stub
		return clubSourceDao.findAllClubSourceUid(uid);
	}

	

}
