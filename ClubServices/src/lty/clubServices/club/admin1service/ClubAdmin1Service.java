package lty.clubServices.club.admin1service;

import java.util.List;

import lty.clubServices.club.entity.Club;

public interface ClubAdmin1Service {
	public List<Club> findClubCid(Integer cid);

	public void update(Club club);

	public Club findClub(Integer cid);
}
