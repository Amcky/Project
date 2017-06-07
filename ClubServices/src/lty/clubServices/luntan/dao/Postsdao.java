package lty.clubServices.luntan.dao;

import java.util.List;

import lty.clubServices.luntan.entity.Posts;
import lty.clubServices.luntan.fenye.Page;

public interface Postsdao {
	//增加帖子
	public void add(Posts posts);
	//返回帖子总数
	public int queryAllCount();
	//按页查询
	public List<Posts> queryAllByPage(Page page);
	//按id查询帖子
	public Posts queryById(int id);
	//返回用户帖子总数
	public int queryUserAllCount(int uid);
	//用户分页查询
	public List<Posts> queryUserAllByPage(int uid,Page page);
	//删除帖子
	public void DletetPosts(Posts posts);
	//获取所有分类
	public List<String> queryBytype();
	//按照分类显示
	public List<Posts> queryAllByType(String type,Page page);
	
	public int queryTypeAllCount(String type);
}
