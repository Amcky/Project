package cn.htu.service;

import java.util.List;

import cn.htu.bean.Log;
import cn.htu.bean.User;

public interface LogService {

	public void addLog(Log log);

	public int getTotalCount();

	public List<Log> queryPages(int start, int offset, User user);

}
