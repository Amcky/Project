package lty.clubServices.club.activeaction;

import java.io.File;

import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.club.activeservice.ActiveService;
import lty.clubServices.club.activeservice.Impl.ActiveServiceImpl;
import lty.clubServices.club.entity.Active;

public class ActiveAction extends ActionSupport {
	private Active active;
	private ActiveService activeService;
	// 文件上传需要的三个属性:
	private File upload;
	private String uploadFileName;
	private String uploadContentType;

	// 添加活动信息
	public String addActive() throws IOException {
		active.setAname(active.getAname());
		active.setDes(active.getDes());
		active.setTime(active.getTime());
		if (upload != null) {
			// 将商品图片上传到服务器上.
			// 获得上传图片的服务器端路径.
			String path = ServletActionContext.getServletContext().getRealPath("/active");
			// 创建文件类型对象:
			File diskFile = new File(path + "//" + uploadFileName);
			// 文件上传:
			FileUtils.copyFile(upload, diskFile);
			active.setImage("active/" + uploadFileName);
		}
		activeService.save(active);
		return "addActive";
	}

	// 查询所有活动信息
	public String findAllClub() {
  		List<Active> list = activeService.findAllClubActive();
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		/* ActionContext.getContext().getValueStack().set("list", list); */
		return "success";
	}
	
	public String findAllClub1() {
  		List<Active> list = activeService.findAllClubActive();
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		/* ActionContext.getContext().getValueStack().set("list", list); */
		return "success1";
	}

	// 修改活动信息
	public String updateActive() throws IOException {
		Active tmpActive = activeService.findActive(active.getAid());
		tmpActive.setAname(active.getAname());
		tmpActive.setDes(active.getDes());
		if (upload != null) {
			// 将商品图片上传到服务器上.
			// 获得上传图片的服务器端路径.
			String path = ServletActionContext.getServletContext().getRealPath("/tmpActive");
			// 创建文件类型对象:
			File diskFile = new File(path + "//" + uploadFileName);
			// 文件上传:
			FileUtils.copyFile(upload, diskFile);
			tmpActive.setImage("tmpActive/" + uploadFileName);
		}
		activeService.update(tmpActive);
		return "updateSuccess";
	}

	// 删除活动信息
	public String deleteActive() {
		Active tmpActive = activeService.findActive(active.getAid());
		activeService.delete(tmpActive);
		return "deleteSuccess";

	}

	public void setActiveService(ActiveService activeService) {
		this.activeService = activeService;
	}

	public Active getActive() {
		return active;
	}

	public void setActive(Active active) {
		this.active = active;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

}
