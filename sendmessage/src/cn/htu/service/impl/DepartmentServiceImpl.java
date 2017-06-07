package cn.htu.service.impl;

import java.util.List;

import cn.htu.bean.Department;
import cn.htu.dao.DepartmentDao;
import cn.htu.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
	private DepartmentDao departmentdao;
	
	public DepartmentDao getDepartmentdao() {
		return departmentdao;
	}

	public void setDepartmentdao(DepartmentDao departmentdao) {
		this.departmentdao = departmentdao;
	}

	@Override
	public void adddepartment(Department a) {
		// TODO Auto-generated method stub
		this.departmentdao.adddepartment(a);
	}

	@Override
	public List<Department> showalldepartment() {
		// TODO Auto-generated method stub
		return this.departmentdao.showalldepartment();
	}

}
