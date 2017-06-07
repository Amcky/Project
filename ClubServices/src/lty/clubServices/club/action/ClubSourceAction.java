package lty.clubServices.club.action;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.club.entity.Club;
import lty.clubServices.club.entity.Look;
import lty.clubServices.club.entity.Source;
import lty.clubServices.club.service.ClubSourceService;

public class ClubSourceAction extends ActionSupport {
	private Source s;
	private Look look;
	private ClubSourceService clubSourceService;
	// 文件上传需要的三个属性:
	private File upload;
	private String uploadFileName;
	private String uploadContentType;
	private String uid;

	// 上传资源
	public String upLoad() throws IOException {
		if (upload != null) {
			// 将商品图片上传到服务器上.
			// 获得上传图片的服务器端路径.
			String path = ServletActionContext.getServletContext().getRealPath("/s");
			// 创建文件类型对象:
			File diskFile = new File(path + "//" + uploadFileName);
			// 文件上传:
			FileUtils.copyFile(upload, diskFile);
			s.setImage("s/" + uploadFileName);
		}

		s.setUid(s.getUid());
		s.setType(s.getType());
		s.setSource(s.getSource());
		s.setTitle(s.getTitle());
		s.setUdate(new Date());
		clubSourceService.upLoadSource(s);
		return "upLoad";
	}

	// 下载文件资源
	public String downLoad() {
		List<Source> list = clubSourceService.downSource();
		if (list != null && list.size() > 0) {
			List<Look> l = clubSourceService.findAllLook();
			l.get(0).setNumber(l.get(0).getNumber() + 1);
			clubSourceService.updateL(l.get(0));
			List<Look> l1 = clubSourceService.findAllLook();
			ServletActionContext.getRequest().getSession().setAttribute("l1", l1);
		}
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		System.out.println(list);
		return "downLoad";
	}
	
	public String downLoad1() {
		List<Source> list = clubSourceService.downSource();
		if (list != null && list.size() > 0) {
			List<Look> l = clubSourceService.findAllLook();
			l.get(0).setNumber(l.get(0).getNumber() + 1);
			clubSourceService.updateL(l.get(0));
			List<Look> l1 = clubSourceService.findAllLook();
			ServletActionContext.getRequest().getSession().setAttribute("l1", l1);
		}
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		System.out.println(list);
		return "downLoad1";
	}
	
	public String downLoad2() {
		List<Source> list = clubSourceService.downSource();
		if (list != null && list.size() > 0) {
			List<Look> l = clubSourceService.findAllLook();
			l.get(0).setNumber(l.get(0).getNumber() + 1);
			clubSourceService.updateL(l.get(0));
			List<Look> l1 = clubSourceService.findAllLook();
			ServletActionContext.getRequest().getSession().setAttribute("l1", l1);
		}
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		System.out.println(list);
		return "downLoad2";
	}
	
	public String findClubByUid() {
		List<Club> list = clubSourceService.findClubSourceUid(Integer.parseInt(uid));
		System.out.println(list);
		/* ActionContext.getContext().getValueStack().set("list", list); */
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		return "success";
	}

	public Source getS() {
		return s;
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

	public void setS(Source s) {
		this.s = s;
	}

	public void setClubSourceService(ClubSourceService clubSourceService) {
		this.clubSourceService = clubSourceService;
	}

	public Look getLook() {
		return look;
	}

	public void setLook(Look look) {
		this.look = look;
	}

}
