package Linux.server.imp;

import java.util.List;

import Linux.dao.forwarddnsdao;
import Linux.po.forwarddns;
import Linux.server.forwarddnsserver;

public class forwarddnsserverimp implements forwarddnsserver{
	private forwarddnsdao fdao;
	public forwarddnsdao getFdao() {
		return fdao;
	}
	public void setFdao(forwarddnsdao fdao) {
		this.fdao = fdao;
	}
	@Override
	public void addforwaeddns(forwarddns a) {
		fdao.addforwarddns(a);
	}
	@Override
	public List<forwarddns> showallforwarddns() {
		// TODO Auto-generated method stub
		return fdao.showallforwarddns();
	}

}
