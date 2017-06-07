package lty.clubServices.club.admin2action;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.club.admin2service.ClubAdmin2Service;
import lty.clubServices.club.entity.Club;

public class ClubAdmin2Action extends ActionSupport {

	private Club club;

	private ClubAdmin2Service clubAdmin2Service;

	// 文件上传需要的三个属性:
	private File upload;
	private String uploadFileName;
	private String uploadContentType;

	// action层查询所有社团信息
	public String findAllClub() {

		List<Club> list = clubAdmin2Service.findAllClub();
		ActionContext.getContext().getValueStack().set("list", list);
		return "success";
	}

	// 添加社团
	public String addClub() throws IOException {
		System.out.println(club);
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
		club.setIntroduce(club.getIntroduce());
		clubAdmin2Service.save(club);
		return "saveSuccess";
	}

	// 修改社团信息
	public String updateClub() throws IOException {
		Club tmpClub = clubAdmin2Service.findClub(club.getCid());
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
		clubAdmin2Service.update(tmpClub);
		return "updateSuccess";
	}

	// 删除社团
	public String deleteClub() {
		Club tmpClub = clubAdmin2Service.findClub(club.getCid());
		clubAdmin2Service.delete(tmpClub);
		return "deleteSuccess";

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

	public void setClubAdmin2Service(ClubAdmin2Service clubAdmin2Service) {
		this.clubAdmin2Service = clubAdmin2Service;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public File getUpload() {
		return upload;
	}

}
