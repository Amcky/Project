package Linux.server.imp;

import java.util.List;

import Linux.dao.maildao;
import Linux.po.mail;
import Linux.server.mailserver;

public class mailserverimp implements mailserver {
	private maildao mdao;

	public maildao getMdao() {
		return mdao;
	}

	public void setMdao(maildao mdao) {
		this.mdao = mdao;
	}

	@Override
	public void addmail(mail a) {
		mdao.addmail(a);
	}

	@Override
	public List<mail> showmailbyid(int id) {
		// TODO Auto-generated method stub
		return mdao.showmailbyid(id);
	}

	@Override
	public void delmail(mail a) {
		// TODO Auto-generated method stub
		mdao.delmail(a);
		
	}

	@Override
	public mail showmail(int id) {
		// TODO Auto-generated method stub
		return mdao.showmail(id);
	}

}
