package Linux.server.imp;

import java.util.List;

import Linux.dao.namedao;
import Linux.po.named;
import Linux.server.namedserver;

public class nameserverimp implements namedserver{
	private namedao nadao;
	
	

	



	public namedao getNadao() {
		return nadao;
	}



	public void setNadao(namedao nadao) {
		this.nadao = nadao;
	}



	@Override
	public int add(named name) {
		return nadao.addnamed(name);
		
	}



	@Override
	public List<named> shownamed() {
		return nadao.shownamed();
	}



	@Override
	public void delete(int id) {
		named list=nadao.querById(id);
		nadao.delete(list);
		
	}



	@Override
	public named shownamedById(int id) {
		// TODO Auto-generated method stub
		return nadao.querById(id);
	}

}
