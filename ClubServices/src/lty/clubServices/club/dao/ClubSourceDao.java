package lty.clubServices.club.dao;

import java.util.List;

import lty.clubServices.club.entity.Club;
import lty.clubServices.club.entity.Look;
import lty.clubServices.club.entity.Source;

public interface ClubSourceDao {

	void upLoadSource(Source s);

	List<Source> downSource();

	List<Look> findAllLook();

	void updateL(Look look);

	List<Club> findAllClubSourceUid(Integer uid);

}
