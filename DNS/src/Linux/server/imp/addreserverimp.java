package Linux.server.imp;

import java.util.List;

import Linux.dao.addredao;
import Linux.po.addre;
import Linux.server.addreserver;

public class addreserverimp implements addreserver{
	private addredao adao;



	public addredao getAdao() {
		return adao;
	}



	public void setAdao(addredao adao) {
		this.adao = adao;
	}



	@Override
	public void addaddre(addre a) {
		adao.addaddre(a);
	}



	@Override
	public List<addre> showaddrebyid(int id) {
		return adao.showaddrebyid(id);
	}



	@Override
	public void deladdre(addre a) {
		adao.deladdre(a);
	}



	@Override
	public addre showaddre(int id) {
		// TODO Auto-generated method stub
		return adao.showaddre(id);
	}
	
	
}
