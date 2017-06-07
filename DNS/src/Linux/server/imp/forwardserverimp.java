package Linux.server.imp;

import java.util.List;

import Linux.dao.forwarddao;
import Linux.po.forward;
import Linux.server.forwardserver;

public class forwardserverimp implements forwardserver {
	private forwarddao fdao;
	
	public forwarddao getFdao() {
		return fdao;
	}

	public void setFdao(forwarddao fdao) {
		this.fdao = fdao;
	}

	@Override
	public void addforward(forward a) {
		fdao.addforward(a);
	}

	@Override
	public List<forward> showallforward() {
		// TODO Auto-generated method stub
		return fdao.showallforward();
	}
	
}
