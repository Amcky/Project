package lty.clubServices.luntan.server;

import java.util.List;

import lty.clubServices.luntan.entity.Posts;
import lty.clubServices.luntan.fenye.Page;
import lty.clubServices.luntan.fenye.Result;

public interface PostsService {
	//增加帖子
	public void addPosts(Posts posts);
	//分页查询
	public Result showPostsByPage(Page page);
	//显示帖子
	public Posts showposts(int id);
	//查询用户的帖子
	public Result showUserArticleByPage(int uid,Page page);
	//用户删除帖子
	public void DletePosts(int id);
	//显示所有分类
	public List<String> queryBytype();
	//分类显示帖子
	public Result queryAllByType(String type,Page page);
}
