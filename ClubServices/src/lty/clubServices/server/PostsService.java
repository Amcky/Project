package lty.clubServices.server;

import java.util.List;

import lty.clubServices.entity.Posts;
import lty.clubServices.fenye.Page;
import lty.clubServices.fenye.Result;

public interface PostsService {
	//��������
	public void addPosts(Posts posts);
	//��ҳ��ѯ
	public Result showPostsByPage(Page page);
	//��ʾ����
	public Posts showposts(int id);
}
