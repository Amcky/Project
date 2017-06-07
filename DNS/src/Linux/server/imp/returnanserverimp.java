package Linux.server.imp;

import java.util.List;

import Linux.dao.returnandao;
import Linux.po.returnan;
import Linux.server.returnanserver;

public class returnanserverimp implements returnanserver{
	private returnandao rdao;
	
	public returnandao getRdao() {
		return rdao;
	}

	public void setRdao(returnandao rdao) {
		this.rdao = rdao;
	}

	@Override
	public void addreturnan(returnan a) {
		rdao.addreturnan(a);
	}

	@Override
	public List<returnan> showreturnanbyid(int id) {
		return rdao.showreturnanbyid(id);
	}

	@Override
	public void delreturnan(returnan a) {
		rdao.delreturnan(a);
	}

	@Override
	public returnan showreturnan(int id) {
		// TODO Auto-generated method stub
		return rdao.showreturnan(id);
	}

}
