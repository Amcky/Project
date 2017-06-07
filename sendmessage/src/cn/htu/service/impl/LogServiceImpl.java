package cn.htu.service.impl;

import java.util.List;

import cn.htu.bean.Log;
import cn.htu.bean.User;
import cn.htu.dao.LogDao;
import cn.htu.service.LogService;

public class LogServiceImpl implements LogService {

	private LogDao logDao;

	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

	public LogDao getLogDao() {
		return logDao;
	}

	public void addLog(Log log) {
		
		this.logDao.saveLog(log);

	}

	public int getTotalCount() {
		// TODO Auto-generated method stub
		return this.logDao.getTotalCount();
	}

	public List<Log> queryPages(int start, int offset, User user) {
		// TODO Auto-generated method stub
		return this.logDao.queryPages(start, offset, user);
	}

}
