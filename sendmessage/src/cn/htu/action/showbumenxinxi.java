package cn.htu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.htu.bean.Department;
import cn.htu.service.DepartmentService;

public class showbumenxinxi extends ActionSupport {
	private DepartmentService departmentservice;
	
	public DepartmentService getDepartmentservice() {
		return departmentservice;
	}

	public void setDepartmentservice(DepartmentService departmentservice) {
		this.departmentservice = departmentservice;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request=ServletActionContext.getRequest();
		List<Department> list=departmentservice.showalldepartment();
		request.setAttribute("zhuzhi", list);
		request.setAttribute("zhuzhi2", list);
		request.setAttribute("zhuzhi3", list);
		return SUCCESS;
	}

	
}
