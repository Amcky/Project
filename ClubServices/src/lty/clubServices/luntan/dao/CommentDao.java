package lty.clubServices.luntan.dao;

import java.util.List;

import lty.clubServices.luntan.entity.Comment;

public interface CommentDao {
		//增加评论
		public void addComment(Comment comment);
		//通过ID查询帖子
		public List<Comment> queryById(int id);
		//通过帖子的ID删除评论
		public void deleteComment(Comment comment);
		//查找二级评论
		public List<Comment> querytwoById(int id);
		
}
