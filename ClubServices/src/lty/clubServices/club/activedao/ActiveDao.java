package lty.clubServices.club.activedao;

import java.util.List;

import lty.clubServices.club.entity.Active;

public interface ActiveDao {

	void save(Active active);

	List<Active> findAllClubActive();

	Active findActive(Integer aid);

	void update(Active tmpActive);

	void delete(Active tmpActive);

}
