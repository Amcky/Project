package cn.htu.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.htu.bean.Department;
import cn.htu.bean.T_user;
import cn.htu.service.DepartmentService;
import cn.htu.service.T_userService;

public class showuserxinxi extends ActionSupport{
	private T_userService userservice;
	private DepartmentService departmentservice;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DepartmentService getDepartmentservice() {
		return departmentservice;
	}

	public void setDepartmentservice(DepartmentService departmentservice) {
		this.departmentservice = departmentservice;
	}

	public T_userService getUserservice() {
		return userservice;
	}

	public void setUserservice(T_userService userservice) {
		this.userservice = userservice;
	}

	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		List<Department> list=departmentservice.showalldepartment();
		List<T_user> user=userservice.showalluser();
		
		request.setAttribute("user",user);
		request.setAttribute("zhuzhi", list);
		request.setAttribute("zhuzhi2", list);
		request.setAttribute("zhuzhi3", list);
		return SUCCESS;
	}
	
}
