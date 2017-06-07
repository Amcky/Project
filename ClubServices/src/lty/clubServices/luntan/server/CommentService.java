package lty.clubServices.luntan.server;

import java.util.List;

import lty.clubServices.luntan.entity.Comment;

public interface CommentService {
	//增加评论
	public void add(Comment comment);
	//按帖子ID查询评论
	public List<Comment> queryById(int id);
	//删除评论
	public void deleteComment(int kid);
	//查询二级评论
	public  List<Comment> querytwoById(int id);
}
