package cn.htu.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

import cn.htu.bean.Department;
import cn.htu.bean.T_user;
import cn.htu.service.DepartmentService;
import cn.htu.service.T_userService;

public class ajax extends ActionSupport {
	private int id;
	private T_userService userservice;
	private String result;
	private DepartmentService departmentservice;
	public DepartmentService getDepartmentservice() {
		return departmentservice;
	}

	public void setDepartmentservice(DepartmentService departmentservice) {
		this.departmentservice = departmentservice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public T_userService getUserservice() {
		return userservice;
	}

	public void setUserservice(T_userService userservice) {
		this.userservice = userservice;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String execute() throws Exception {
		List<T_user> list1=this.userservice.showalluser();
		List<T_user> user=new ArrayList<T_user>();
		for(T_user a:list1){
			if(a.getFid()==id)
				user.add(a);
		}
		Gson gson = new Gson();
		String result;
		result = gson.toJson(user);
		List<Department> list=departmentservice.showalldepartment();
		HttpServletRequest  request=ServletActionContext.getRequest();
		request.setAttribute("user",user);
		request.setAttribute("zhuzhi", list);
		request.setAttribute("zhuzhi2", list);
		request.setAttribute("zhuzhi3", list);
		return SUCCESS;
	}

}
