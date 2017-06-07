package cn.htu.dao;

import java.util.List;

import cn.htu.bean.Log;
import cn.htu.bean.User;

public interface LogDao {
	
	public void saveLog(Log log); 
	
	public List<Log> getLogsByUserid(User user);
	
	public int getTotalCount();
	
	public List<Log> queryPages(int start,int offset,User user);
	
	

}
