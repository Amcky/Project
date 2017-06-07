package lty.clubServices.server;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import lty.clubServices.dao.Postsdao;
import lty.clubServices.entity.Posts;
import lty.clubServices.fenye.Page;
import lty.clubServices.fenye.PageUtil;
import lty.clubServices.fenye.Result;

@Transactional
public class PostsServiceimp implements PostsService{
	private Postsdao  postsdao;
	
	public Postsdao getPostsdao() {
		return postsdao;
	}

	public void setPostsdao(Postsdao postsdao) {
		this.postsdao = postsdao;
	}

	@Override
	public void addPosts(Posts posts) {
		// TODO Auto-generated method stub
		System.out.println("service");
		postsdao.add(posts);
		
	}

	@Override
	public Result showPostsByPage(Page page) {
		page = PageUtil.createPage(page,postsdao.queryAllCount());
		List<Posts> all = postsdao.queryAllByPage(page);
		Result result = new Result();
		result.setPage(page);
		result.setList(all);
		return result;
	}

	@Override
	public Posts showposts(int id) {
		return postsdao.queryById(id);
	}



	

}
