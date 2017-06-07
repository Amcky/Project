package lty.clubServices.club.admin1action;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.club.admin1service.ClubAdmin1Service;
import lty.clubServices.club.entity.Club;

public class ClubAdmin1Action extends ActionSupport {
	private Club club;
	private ClubAdmin1Service clubAdmin1Service;
	// 文件上传需要的三个属性:
	private File upload;
	private String uploadFileName;
	private String uploadContentType;

	// 根据id找到社团信息
	public String findClubByCid() {
		System.out.println(club.getCid());
		System.out.println(club.getCid());
		List<Club> list = clubAdmin1Service.findClubCid(club.getCid());
		ActionContext.getContext().getValueStack().set("list", list);
		return "success";
	}

	// 修改社团信息
	public String updateClub() throws IOException {
		Club tmpClub = clubAdmin1Service.findClub(club.getCid());
		tmpClub.setMembers(club.getMembers());
		tmpClub.setTname(club.getTname());
		tmpClub.setIntroduce(club.getIntroduce());
		tmpClub.setPlace(club.getPlace());
		if (upload != null) {
			// 将商品图片上传到服务器上.
			// 获得上传图片的服务器端路径.
			String path = ServletActionContext.getServletContext().getRealPath("/club");
			// 创建文件类型对象:
			File diskFile = new File(path + "//" + uploadFileName);
			// 文件上传:
			FileUtils.copyFile(upload, diskFile);
			club.setImage("club/" + uploadFileName);
		}
		clubAdmin1Service.update(tmpClub);
		return "updateSuccess";
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

	public Club getClub() {
		return club;
	}

	public void setClubAdmin1Service(ClubAdmin1Service clubAdmin1Service) {
		this.clubAdmin1Service = clubAdmin1Service;
	}

	public void setClub(Club club) {
		this.club = club;
	}

}
