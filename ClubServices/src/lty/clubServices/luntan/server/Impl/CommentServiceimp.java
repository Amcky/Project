package lty.clubServices.luntan.server.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import lty.clubServices.luntan.dao.CommentDao;
import lty.clubServices.luntan.entity.Comment;
import lty.clubServices.luntan.server.CommentService;

@Transactional
public class CommentServiceimp implements CommentService {
	CommentDao commentdao;
	public CommentDao getCommentdao() {
		return commentdao;
	}
	public void setCommentdao(CommentDao commentdao) {
		this.commentdao = commentdao;
	}
	@Override
	public void add(Comment comment) {
		commentdao.addComment(comment);
		
	}
	@Override
	public List<Comment> queryById(int id) {
		
		return commentdao.queryById(id);
	}
	@Override
	public void deleteComment(int kid) {
		List<Comment> list=commentdao.queryById(kid);
		for(Comment a:list)
		{
			commentdao.deleteComment(a);
		}
		
	}
	@Override
	public List<Comment> querytwoById(int id) {
		return commentdao.querytwoById(id);
	}

}
