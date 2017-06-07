package lty.clubServices.club.admin2service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import lty.clubServices.club.admin2dao.ClubAdmin2Dao;
import lty.clubServices.club.admin2service.ClubAdmin2Service;
import lty.clubServices.club.entity.Club;

@Transactional
public class ClubAdmin2ServiceImpl implements ClubAdmin2Service {
	private ClubAdmin2Dao clubAdmin2Dao;

	public void setClubAdmin2Dao(ClubAdmin2Dao clubAdmin2Dao) {
		this.clubAdmin2Dao = clubAdmin2Dao;
	}

	// service层查询所有社团信息
	@Override
	public List<Club> findAllClub() {
		// TODO Auto-generated method stub
		return clubAdmin2Dao.findAllClub();
	}

	@Override
	public void save(Club club) {
		// TODO Auto-generated method stub
		clubAdmin2Dao.save(club);
	}

	@Override
	public void update(Club club) {
		// TODO Auto-generated method stub
		clubAdmin2Dao.update(club);
	}

	@Override
	public Club findClub(Integer cid) {
		// TODO Auto-generated method stub
		return clubAdmin2Dao.findClub(cid);
	}

	@Override
	public void delete(Club club) {
		// TODO Auto-generated method stub
		clubAdmin2Dao.delete(club);
	}
}
