package lty.clubServices.club.activeservice.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import lty.clubServices.club.activedao.ActiveDao;
import lty.clubServices.club.activedao.Impl.ActiveDaoImpl;
import lty.clubServices.club.activeservice.ActiveService;
import lty.clubServices.club.entity.Active;

@Transactional
public class ActiveServiceImpl implements ActiveService {
	private ActiveDao activeDao;

	@Override
	public void save(Active active) {
		// TODO Auto-generated method stub
		activeDao.save(active);

	}

	public void setActiveDao(ActiveDao activeDao) {
		this.activeDao = activeDao;
	}

	@Override
	public Active findActive(Integer aid) {
		// TODO Auto-generated method stub
		return activeDao.findActive(aid);
	}

	@Override
	public void update(Active tmpActive) {
		// TODO Auto-generated method stub
		activeDao.update(tmpActive);
	}

	@Override
	public List<Active> findAllClubActive() {
		// TODO Auto-generated method stub
		return activeDao.findAllClubActive();
	}

	@Override
	public void delete(Active tmpActive) {
		// TODO Auto-generated method stub
		activeDao.delete(tmpActive);
	}

}
