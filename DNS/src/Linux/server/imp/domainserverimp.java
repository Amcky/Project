package Linux.server.imp;

import java.util.List;

import Linux.dao.domaindao;
import Linux.po.domain;
import Linux.server.domainserver;

public class domainserverimp implements domainserver{
	private domaindao dodao;
	
	public domaindao getDodao() {
		return dodao;
	}

	public void setDodao(domaindao dodao) {
		this.dodao = dodao;
	}

	@Override
	public void add(domain main) {
		dodao.add(main);
		
	}

	@Override
	public List<domain> showdomain() {
		
		return dodao.showalldomain();
	}

	@Override
	public List<domain> showdomainById(int id) {
		return dodao.showalldomainById(id);
	}

	@Override
	public void deletedomain(int id) {
		List<domain> list=dodao.showalldomainById(id);
		for(domain a:list)
		{
			dodao.dletetdomain(a);
		}
		
	}

}
