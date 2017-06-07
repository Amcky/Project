package Linux.server.imp;

import java.util.List;

import Linux.dao.zonedao;
import Linux.po.zone;
import Linux.server.zoneserver;

public class zoneserverimp implements zoneserver {
	private zonedao zodao;
	
	public zonedao getZodao() {
		return zodao;
	}

	public void setZodao(zonedao zodao) {
		this.zodao = zodao;
	}

	@Override
	public void add(zone zone) {
		zodao.add(zone);
		
	}

	@Override
	public List<zone> showzone() {
		return zodao.showzone();
	}

	@Override
	public zone showzoneById(int id) {
		// TODO Auto-generated method stub
		return zodao.showzoneById(id);
	}

	@Override
	public void deletezone(int id) {
		zone zone=zodao.showzoneById(id);
		zodao.deletezone(zone);
	}

}
