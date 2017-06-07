package lty.clubServices.luntan.server.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import lty.clubServices.luntan.dao.Postsdao;
import lty.clubServices.luntan.entity.Posts;
import lty.clubServices.luntan.fenye.Page;
import lty.clubServices.luntan.fenye.PageUtil;
import lty.clubServices.luntan.fenye.Result;
import lty.clubServices.luntan.server.PostsService;

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

	@Override
	public Result showUserArticleByPage(int uid, Page page) {
		page = PageUtil.createPage(page,postsdao.queryUserAllCount(uid));
		List<Posts> all = postsdao.queryUserAllByPage(uid, page);
		Result result = new Result();
		result.setPage(page);
		result.setList(all);
		return result;
	}

	@Override
	public void DletePosts(int id) {
		postsdao.DletetPosts(postsdao.queryById(id));
		
	}

	@Override
	public List<String> queryBytype() {
		
		return postsdao.queryBytype();
	}

	@Override
	public Result queryAllByType(String type, Page page) {
		page = PageUtil.createPage(page,postsdao.queryTypeAllCount(type));
		List<Posts> all = postsdao.queryAllByType(type, page);
		Result result = new Result();
		result.setPage(page);
		result.setList(all);
		return result;
	}



	

}
