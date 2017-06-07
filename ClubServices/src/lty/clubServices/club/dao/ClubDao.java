package lty.clubServices.club.dao;

import java.util.List;

import lty.clubServices.club.entity.Club;

public interface ClubDao {
	public List<Club> findClubCid(Integer cid);

	public List<Club> findAllClub();
}
