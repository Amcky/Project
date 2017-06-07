package lty.clubServices.club.admin1service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import lty.clubServices.club.admin1dao.ClubAdmin1Dao;
import lty.clubServices.club.admin1service.ClubAdmin1Service;
import lty.clubServices.club.entity.Club;

@Transactional
public class ClubAdmin1ServiceImpl implements ClubAdmin1Service {
	private ClubAdmin1Dao clubAdmin1Dao;

	public void setClubAdmin1Dao(ClubAdmin1Dao clubAdmin1Dao) {
		this.clubAdmin1Dao = clubAdmin1Dao;
	}

	public List<Club> findClubCid(Integer cid) {
		// TODO Auto-generated method stub
		return clubAdmin1Dao.findClubCid(cid);
	}

	@Override
	public void update(Club club) {
		// TODO Auto-generated method stub
		clubAdmin1Dao.update(club);
	}

	@Override
	public Club findClub(Integer cid) {
		// TODO Auto-generated method stub
		return clubAdmin1Dao.findClub(cid);
	}

}
