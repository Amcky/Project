package lty.clubServices.club.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import lty.clubServices.club.entity.Club;
import lty.clubServices.club.service.ClubService;

public class ClubAction extends ActionSupport {
	private Club club;
	private ClubService clubService;
	private String cid;

	// action层查询所有社团信息
	public String findAllClub() {

		List<Club> list = clubService.findAllClub();
		System.out.println(list);
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		return "findAllClub";
	}

	public String findClubByCid() {
		List<Club> list = clubService.findClubCid(Integer.parseInt(cid));
		System.out.println(list);
		/* ActionContext.getContext().getValueStack().set("list", list); */
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		return "success";
	}

	public String findClubByCid1() {
		List<Club> list = clubService.findClubCid(Integer.parseInt(cid));
		System.out.println(list);
		/* ActionContext.getContext().getValueStack().set("list", list); */
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		return "success1";
	}

	public void setClubService(ClubService clubService) {
		this.clubService = clubService;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

}