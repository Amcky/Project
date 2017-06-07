package lty.clubServices.dao;

import java.util.List;

import lty.clubServices.entity.Posts;
import lty.clubServices.fenye.Page;

public interface Postsdao {
	//增加帖子
	public void add(Posts posts);
	//返回帖子总数
	public int queryAllCount();
	//按页查询
	public List<Posts> queryAllByPage(Page page);
	//按id查询帖子
	public Posts queryById(int id);
}
