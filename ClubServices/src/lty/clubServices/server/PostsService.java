package lty.clubServices.server;

import java.util.List;

import lty.clubServices.entity.Posts;
import lty.clubServices.fenye.Page;
import lty.clubServices.fenye.Result;

public interface PostsService {
	//增加帖子
	public void addPosts(Posts posts);
	//分页查询
	public Result showPostsByPage(Page page);
	//显示帖子
	public Posts showposts(int id);
}
