package lty.clubServices.club.service;

import java.util.List;

import lty.clubServices.club.entity.Club;
import lty.clubServices.club.entity.Look;
import lty.clubServices.club.entity.Source;

public interface ClubSourceService {

	void upLoadSource(Source s);

	List<Source> downSource();

	List<Look> findAllLook();

	void updateL(Look look);

	List<Club> findClubSourceUid(int parseInt);

}
