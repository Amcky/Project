package lty.clubServices.club.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import lty.clubServices.club.dao.ClubDao;
import lty.clubServices.club.entity.Club;
import lty.clubServices.club.service.ClubService;

@Transactional
public class ClubServiceImpl implements ClubService {
	private ClubDao clubDao;

	// service层查询所有社团信息
	@Override
	public List<Club> findAllClub() {
		// TODO Auto-generated method stub
		return clubDao.findAllClub();
	}

	public void setClubDao(ClubDao clubDao) {
		this.clubDao = clubDao;
	}

	public List<Club> findClubCid(Integer cid) {
		// TODO Auto-generated method stub

		return clubDao.findClubCid(cid);
	}

}
