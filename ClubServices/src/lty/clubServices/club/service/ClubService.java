package lty.clubServices.club.service;

import java.util.List;

import lty.clubServices.club.entity.Club;

public interface ClubService {
	public List<Club> findClubCid(Integer cid);

	public List<Club> findAllClub();
}
