package Linux.server.imp;

import java.util.List;

import Linux.dao.cnamedao;
import Linux.po.cname;
import Linux.server.cnameserver;

public class cnameserverimp implements cnameserver{
	private cnamedao cdao;
	
	public cnamedao getCdao() {
		return cdao;
	}

	public void setCdao(cnamedao cdao) {
		this.cdao = cdao;
	}

	@Override
	public void addcname(cname a) {
		// TODO Auto-generated method stub
		cdao.addcname(a);
	}

	@Override
	public List<cname> showcnamebyid(int id) {
		// TODO Auto-generated method stub
		return cdao.showcnamebyid(id);
	}

	@Override
	public void delcname(cname a) {
		cdao.delcname(a);
	}

	@Override
	public cname showcname(int id) {
		// TODO Auto-generated method stub
		return cdao.showcname(id);
	}

}
