package lty.clubServices.club.admin2dao;

import java.util.List;

import lty.clubServices.club.entity.Club;

public interface ClubAdmin2Dao {
	public List<Club> findAllClub();

	public void save(Club club);

	public void update(Club club);

	public Club findClub(int i);

	public void delete(Club club);
}
