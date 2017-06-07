package lty.clubServices.user.action;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.user.entity.User;
import lty.clubServices.user.service.Impl.UserServiceImpl;



public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private String squestion;

	private UserServiceImpl userServicelmpl;
	private String checkcode;
	
	
	// 文件上传需要的三个属性:
	private File upload;//文件上传的路径
	private String uploadFileName;//文件上传的名字
	private String uploadContentType;//文件上传的类型
	
	
	public String findByName() throws Exception
	{
		
		
		User existUser = userServicelmpl.findByUsername(user.getUserName());
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		if (existUser != null) {
			
			// 查询到该用户:用户名已经存在
			response.getWriter().println("<font color='red'>用户名已经存在</font>");
		} else {
			// 没查询到该用户:用户名可以使用
			response.getWriter().println("<font color='green'>用户名可以使用</font>");
		}
		return NONE;
	}
	
	public String regist() throws Exception {
		// 判断验证码程序:
		// 从session中获得验证码的随机值:
		
		String checkcode1 = (String) ServletActionContext.getRequest()
				.getSession().getAttribute("checkcode");
		if(!checkcode.equalsIgnoreCase(checkcode1)){
			this.addActionError("验证码输入错误!");
			return "checkcodeFail";
		}
		  Date date=new Date();
		  DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  String createTime=format.format(date);
		  user.setCreatetime(createTime);
		  user.setsquestion(squestion);
		  user.setPower(0);  
		
	//处理上传头像
	if(upload != null){
	    // 将商品图片上传到服务器上.
	    // 获得上传图片的服务器端路径.
        String path = ServletActionContext.getServletContext().getRealPath("/image/userImage");
	    // 创建文件类型对象:
        Long l=Calendar.getInstance().getTimeInMillis();
        String tmp=String.valueOf(l);
        uploadFileName=tmp.concat(uploadFileName.substring(uploadFileName.lastIndexOf(".")));
	    File diskFile = new File(path + "//" + uploadFileName);
		// 文件上传:
		FileUtils.copyFile(upload, diskFile);
		user.setImage(("/image/userImage/" + uploadFileName));;
	}
    userServicelmpl.save(user);
    System.out.println(user);
	this.addActionMessage("注册成功!");
	return "save";
}
	
	
	
	
	//实现登录：
	public String login() {
		User existUser = userServicelmpl.login(user);
		// 判断
		if (existUser == null) {
			// 登录失败
			this.addActionError("登录失败:用户名或密码错误!");
			return LOGIN;
		}
		else {
			return "SUCCESS";
		}
		
		
	}
	public String getCheckcode() {
		return checkcode;
	}


	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}
     
	public String getSquestion() {
		return squestion;
	}

	public void setSquestion(String squestion) {
		this.squestion = squestion;
	}
	public String login(User user)throws Exception{
		if(userServicelmpl.login(user)!=null){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public void setUserServicelmpl(UserServiceImpl userServicelmpl) {
		this.userServicelmpl = userServicelmpl;
	}

	public UserServiceImpl getUserServicelmpl() {
		return userServicelmpl;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	

	//查询密保问题的答案:
		public String findBySquestion() throws Exception
		{
			User user1=userServicelmpl.fingBySquestion(user);
			
			HttpServletResponse response=ServletActionContext.getResponse();
		    HttpServletRequest request=ServletActionContext.getRequest();
	        if (user1!= null) {
				
				String squestion=user1.getsquestion();
				request.setAttribute("squestion",squestion);
				request.getRequestDispatcher("findPassword.jsp").forward(request, response);
			} else {
				
				String fail="你输入的学号不存在";
				request.setAttribute("fail",fail);
				request.getRequestDispatcher("sno.jsp").forward(request, response);
			}
			return NONE;
			
		}
		
		public String findByPassword() throws Exception
		{
			User user1=userServicelmpl.fingByPassword(user);
			HttpServletResponse response=ServletActionContext.getResponse();
			response.setContentType("text/html;charset=UTF-8");
		    HttpServletRequest request=ServletActionContext.getRequest();
	        if (user1!= null) {
				String password=user1.getPassword();
				request.setAttribute("password", password);
				
			    return "PSUCCESS";
			} else {
				// 没查询到该用户:用户名可以使用
				response.getWriter().println("<font color='red'>输入的问题的答案有错误，请重新输入</font>");
				return NONE;
			}
			
			
		}
}

