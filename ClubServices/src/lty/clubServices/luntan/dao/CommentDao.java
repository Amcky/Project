package lty.clubServices.luntan.dao;

import java.util.List;

import lty.clubServices.luntan.entity.Comment;

public interface CommentDao {
		//��������
		public void addComment(Comment comment);
		//ͨ��ID��ѯ����
		public List<Comment> queryById(int id);
		//ͨ�����ӵ�IDɾ������
		public void deleteComment(Comment comment);
		//���Ҷ�������
		public List<Comment> querytwoById(int id);
		
}
