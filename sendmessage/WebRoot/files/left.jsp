<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>河南师范大学移动互联短信提醒系统</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(../images/left.gif);
}
-->
</style>
<link href="../css/css.css" rel="stylesheet" type="text/css" />
</head>
<SCRIPT language=JavaScript>
	function tupian(idt) {
		var nametu = "xiaotu" + idt;
		var tp = document.getElementById(nametu);
		tp.src = "../images/ico05.gif"; //图片ico04为白色的正方形

		for (var i = 1; i < 30; i++) {

			var nametu2 = "xiaotu" + i;
			if (i != idt * 1) {
				var tp2 = document.getElementById('xiaotu' + i);
				if (tp2 != undefined) {
					tp2.src = "../images/ico06.gif";
				} //图片ico06为蓝色的正方形
			}
		}
	}

	function list(idstr) {
		var name1 = "subtree" + idstr;
		var name2 = "img" + idstr;
		var objectobj = document.all(name1);
		var imgobj = document.all(name2);


		//alert(imgobj);

		if (objectobj.style.display == "none") {
			for (i = 1; i < 10; i++) {
				var name3 = "img" + i;
				var name = "subtree" + i;
				var o = document.all(name);
				if (o != undefined) {
					o.style.display = "none";
					var image = document.all(name3);
					//alert(image);
					image.src = "../images/ico04.gif";
				}
			}
			objectobj.style.display = "";
			imgobj.src = "../images/ico03.gif";
		} else {
			objectobj.style.display = "none";
			imgobj.src = "../images/ico04.gif";
		}
	}
</SCRIPT>

<body>
	<table width="198" border="0" cellpadding="0" cellspacing="0"
		class="left-table01">
		<tr>
			<TD>
				<table width="100%" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td width="207" height="55" background="../images/nav01.gif">
							<table width="90%" border="0" align="center" cellpadding="0"
								cellspacing="0">
								<tr>
									<td width="25%" rowspan="2"><br></td>
									<td width="75%" height="22" class="left-font01">您好，<span
										class="left-font02">Geng</span></td>
								</tr>
								<tr>
									<td height="22" class="left-font01">[&nbsp;<a
										href="LogoutAction.action" target="_top" class="left-font01">退出</a>&nbsp;]
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table> <!--  任务系统开始    -->
				<TABLE width="100%" border="0" cellpadding="0" cellspacing="0"
					class="left-table03">
					<tr>
						<td height="29">
							<table width="85%" border="0" align="center" cellpadding="0"
								cellspacing="0">
								<tr>
									<td width="8%"><img name="img8" id="img8"
										src="../images/ico04.gif" width="8" height="11" /></td>
									<td width="92%"><a href="javascript:" target="mainFrame"
										class="left-font03" onClick="list('8');">新建短信</a></td>
								</tr>
							</table>
						</td>
					</tr>
				</TABLE>
				<table id="subtree8" style="DISPLAY: none" width="80%" border="0"
					align="center" cellpadding="0" cellspacing="0" class="left-table02">
					<tr>
						<td width="9%" height="20"><img id="xiaotu20"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="sendMessage.jsp" target="mainFrame"
							class="left-font03" onClick="tupian('20');">发送短信</a></td>
					</tr>
					<tr>
						<td width="9%" height="21"><img id="xiaotu21"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listrenwu.htm" target="mainFrame"
							class="left-font03" onClick="tupian('21');">任务信息查看</a></td>
					</tr>
				</table> <!--  任务系统结束    --> <!--  消息系统开始    -->
				<TABLE width="100%" border="0" cellpadding="0" cellspacing="0"
					class="left-table03">
					<tr>
						<td height="29">
							<table width="85%" border="0" align="center" cellpadding="0"
								cellspacing="0">
								<tr>
									<td width="8%"><img name="img7" id="img7"
										src="../images/ico04.gif" width="8" height="11" /></td>
									<td width="92%"><a href="javascript:" target="mainFrame"
										class="left-font03" onClick="list('7');">个人信息</a></td>
								</tr>
							</table>
						</td>
					</tr>
				</TABLE>
				<table id="subtree7" style="DISPLAY: none" width="80%" border="0"
					align="center" cellpadding="0" cellspacing="0" class="left-table02">
					<tr>
						<td width="9%" height="20"><img id="xiaotu17"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="toPageList.action"
							target="mainFrame" class="left-font03" onClick="tupian('17');">已发短信</a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu18"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listtakexiaoxi.htm"
							target="mainFrame" class="left-font03" onClick="tupian('18');">短信费用查询</a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu19"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a
							href="<s:url namespace="/admin" action="toPageList1.action"/>"
							target="mainFrame" class="left-font03" onClick="tupian('19');">平台已发短信
						</a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu24"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listxiaoxi.htm" target="mainFrame"
							class="left-font03" onClick="tupian('24');">消息信息列表 </a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu25"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a
							href="showrenyuanxinxi.action"
							target="mainFrame" class="left-font03" onClick="tupian('25');">人员信息
						</a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu26"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a
							href="showbumenxinxi.action"
							target="mainFrame" class="left-font03" onClick="tupian('26');">部门管理
						</a></td>
					</tr>
				</table> <!--  消息系统结束    -->



				<TABLE width="100%" border="0" cellpadding="0" cellspacing="0"
					class="left-table03">
					<tr>
						<td height="29">
							<table width="85%" border="0" align="center" cellpadding="0"
								cellspacing="0">
								<tr>
									<td width="8%"><img name="img1" id="img1"
										src="../images/ico04.gif" width="8" height="11" /></td>
									<td width="92%"><a href="javascript:" target="mainFrame"
										class="left-font03" onClick="list('1');">集团信息</a></td>
								</tr>
							</table>
						</td>
					</tr>
				</TABLE>
				<table id="subtree1" style="DISPLAY: none" width="80%" border="0"
					align="center" cellpadding="0" cellspacing="0" class="left-table02">
					<tr>
						<td width="9%" height="20"><img id="xiaotu1"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listxiangmuxinxi.htm"
							target="mainFrame" class="left-font03" onClick="tupian('1');">开通集团业务</a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu4"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listjihua.htm" target="mainFrame"
							class="left-font03" onClick="tupian('4');">集团管理</a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu2"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listxuqiu.htm" target="mainFrame"
							class="left-font03" onClick="tupian('2');">集团信息查询</a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu5"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listmokuai.htm" target="mainFrame"
							class="left-font03" onClick="tupian('5');">集团已发短信</a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu3"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listgongneng.htm" target="mainFrame"
							class="left-font03" onClick="tupian('3');">项目功能信息查看</a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu6"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listshangchuan.htm"
							target="mainFrame" class="left-font03" onClick="tupian('6');">项目上传信息查看</a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu7"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listchengbenxinxi.htm"
							target="mainFrame" class="left-font03" onClick="tupian('7');">项目成本信息查看</a></td>
					</tr>
				</table> <!--  项目系统结束    --> <!--  客户系统开始    -->
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					class="left-table03">
					<tr>
						<td height="29"><table width="85%" border="0" align="center"
								cellpadding="0" cellspacing="0">
								<tr>
									<td width="8%" height="12"><img name="img2" id="img2"
										src="../images/ico04.gif" width="8" height="11" /></td>
									<td width="92%"><a href="javascript:" target="mainFrame"
										class="left-font03" onClick="list('2');">统计查询</a></td>
								</tr>
							</table></td>
					</tr>
				</table>

				<table id="subtree2" style="DISPLAY: none" width="80%" border="0"
					align="center" cellpadding="0" cellspacing="0" class="left-table02">

					<tr>
						<td width="9%" height="20"><img id="xiaotu7"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="logList.action" target="mainFrame"
							class="left-font03" onClick="tupian('7');">操作日志查询</a></td>
					</tr>
				</table> <!--  客户系统结束    --> <!--  人员系统开始    -->
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					class="left-table03">
					<tr>
						<td height="29"><table width="85%" border="0" align="center"
								cellpadding="0" cellspacing="0">
								<tr>
									<td width="8%" height="12"><img name="img3" id="img3"
										src="../images/ico04.gif" width="8" height="11" /></td>
									<td width="92%"><a href="javascript:" target="mainFrame"
										class="left-font03" onClick="list('3');">权限管理</a></td>
								</tr>
							</table></td>
					</tr>
				</table>

				<table id="subtree3" style="DISPLAY: none" width="80%" border="0"
					align="center" cellpadding="0" cellspacing="0" class="left-table02">
					<tr>
						<td width="9%" height="20"><img id="xiaotu8"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listyuangong.html"
							target="mainFrame" class="left-font03" onClick="tupian('8');">人员信息查看</a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu9"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listzhiwu.htm" target="mainFrame"
							class="left-font03" onClick="tupian('9');">职务信息查看</a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu10"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listMonthYuanGongGongZi.htm"
							target="mainFrame" class="left-font03" onClick="tupian('10');">员工工作情况查看</a></td>
					</tr>
				</table> <!--  人员系统结束    --> <!--  考勤系统开始    -->
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					class="left-table03">
					<tr>
						<td height="29"><table width="85%" border="0" align="center"
								cellpadding="0" cellspacing="0">
								<tr>
									<td width="8%" height="12"><img name="img4" id="img4"
										src="../images/ico04.gif" width="8" height="11" /></td>
									<td width="92%"><a href="javascript:" target="mainFrame"
										class="left-font03" onClick="list('4');">系统帮助</a></td>
								</tr>
							</table></td>
					</tr>
				</table>

				<table id="subtree4" style="DISPLAY: none" width="80%" border="0"
					align="center" cellpadding="0" cellspacing="0" class="left-table02">
					<tr>
						<td width="9%" height="20"><img id="xiaotu11"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listGongZiType.htm"
							target="mainFrame" class="left-font03" onClick="tupian('11');">考勤类型查看</a></td>
					</tr>
					<tr>
						<td width="9%" height="20"><img id="xiaotu12"
							src="../images/ico06.gif" width="8" height="12" /></td>
						<td width="91%"><a href="listMonthYuanGongGongZi.htm"
							target="mainFrame" class="left-font03" onClick="tupian('12');">员工考勤信息查看</a></td>
					</tr>
				</table> <!--  考勤系统结束    -->



			</TD>
		</tr>

	</table>
</body>
</html>
