package lty.clubServices.club.admin2service;

import java.util.List;

import lty.clubServices.club.entity.Club;

public interface ClubAdmin2Service {
	// 查询所有社团信息
	public List<Club> findAllClub();

	public void save(Club club);

	public Club findClub(Integer cid);

	void update(Club club);

	public void delete(Club club);
}
