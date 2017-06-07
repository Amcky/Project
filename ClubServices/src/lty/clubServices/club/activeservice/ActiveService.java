package lty.clubServices.club.activeservice;

import java.util.List;

import lty.clubServices.club.entity.Active;

public interface ActiveService {

	void save(Active active);

	List<Active> findAllClubActive();

	void update(Active tmpActive);

	Active findActive(Integer aid);

	void delete(Active tmpActive);

}
