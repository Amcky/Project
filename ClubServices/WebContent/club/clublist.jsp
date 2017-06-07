<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description"content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
<meta name="keywords"content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
<link rel="shortcut icon" type="image/x-icon"href="${ pageContext.request.contextPath }/images/school_l.ico">
<link href="${ pageContext.request.contextPath }/css/reset.css"rel="stylesheet" type="text/css">
<link href="${ pageContext.request.contextPath }/css/common.css"rel="stylesheet" type="text/css">
<link href="${ pageContext.request.contextPath }/css/page.css"rel="stylesheet" type="text/css">
<title>欢迎进入南阳理工学院软件学院创新基地社团服务平台</title>
<style type="text/css">
#ul li {
	list-style: disc;
	margin-left: 15px;
}
table, td{
		border:10px solid black;
		}
</style>

<link rel="stylesheet" href="${ pageContext.request.contextPath }/css/layer.css"id="layui_layer_skinlayercss" style="">
<link href="${ pageContext.request.contextPath }/css/bdsstyle.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="header">
		<s></s>
		<div class="wrap">
			<span
				style="font-size: 30px; color: #FCC; height: 90px; line-height: 70px; margin-left: 40px;">南阳理工学院软件学院</span>
			<div class="headerRt">
				<p class="link">
					欢迎进入软件学院创新基地社团服务平台 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="${ pageContext.request.contextPath }/menu.jsp">返回首页</a>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[ <a
						href="${ pageContext.request.contextPath }/regist.jsp">注册</a> /
					<a href="${ pageContext.request.contextPath }/goIndex.action">登录</a>]
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a>联系我们</a> | <a
						href="http://www.worldkitchen.cn/Careers.aspx">人才招聘</a>
				</p>
			</div>
		</div>
	</div>
	<div class="nav">
		<s></s>
		<div class="wrap">
			<ul class="clearfix menutop">
				<li class="li_h "><a
					href="${ pageContext.request.contextPath }/menu.jsp">首页<i></i></a></li>
				<li class="li_h1"><a
					href="${pageContext.request.contextPath }/club_findAllClub.action">社团类别<i></i></a>
					<div class="navHover1" style="display: none;">
						<s:iterator var="list" value="#session.list">
							<dl>

								<dd class="dl_d1">
									<a
										href="${pageContext.request.contextPath }/club_findClubByCid.action?cid=<s:property value="#list.cid"/>"><s:property
											value="#list.subject" /><b></b></a>
									<div class="erNav1" style="display: none;">
										<s:iterator var="list" value="#session.list">
											<dl>
												<dd>

													<a
														href="${pageContext.request.contextPath }/club_findClubByCid1.action?cid=<s:property value="#list.cid"/>"><s:property
															value="#list.cname" /><b></b></a>
												</dd>
											</dl>
										</s:iterator>
									</div>
								</dd>

							</dl>
						</s:iterator>
					</div></li>
				<li class="li_h2"><a href="${ pageContext.request.contextPath }/ziyuangongxiang.jsp">资料共享<i></i></a>
					<div class="navHover2" style="display: none;">
						<dl>
							<dd>
								<a href="${ pageContext.request.contextPath }/club/clubsourceu.jsp">上传资料</a>
							</dd>
							<dd>
								<a href="#">资料下载</a>
							</dd>
						</dl>
					</div></li>
				<li class="li_h3"><a href="#">论坛<i></i></a>
					<div class="navHover3" style="display: none;">
						<dl>
							<dd>
								<a href="#">####</a>
							</dd>
							<dd>
								<a href="#">####</a>
							</dd>
							<dd>
								<a href="#">####</a>
							</dd>
						</dl>
					</div></li>
				<li class="li_h4"><a href="#">最新动态<i></i></a></li>
				<li class="li_h6"><a href="http://www.worldkitchen.cn/member/">关于我们<i></i></a></li>
			</ul>
		</div>
	</div>

	<div class="navInner" style="top: 124px;">
		<div class="wrap">
			<a href="#" class="current">社团简介<i></i></a><a
				href="${ pageContext.request.contextPath }/xueshuchengguo.jsp"
				class="">学术成果<i></i></a>
		</div>
	</div>
<div class="mainContent">
		<div class="brand01">
			<div class="wrap">
          <s:iterator var="list"  value="#session.list">
          <p id="block1" class="tit">社团简介</p>
        	<p><s:property value="#list.introduce"/></p>
        	<p>&nbsp;</p>
			<p>社团主攻方向:<s:property value="#list.subject"/></p>
             <td><s:property value="#list.cname"/></td>
             <td><s:date name="#list.buildtime"  format="yyyy-mm-dd  hh:mm:ss"></s:date></td>
           <%--   <td><s:property value="#list.buildtime" /></td> --%>
           <p>&nbsp;</p>
				<p>现有成员<s:property value="#list.members"/>余人</p>
				<p>&nbsp;</p>
				<p>社团地点:<s:property value="#list.place"/></p>
				<p>&nbsp;</p>
			</div>
             <img src="<s:property value="#list.image"/>"   class="img" alt="社团图片"></img>
         </s:iterator>
</div>
	</div>
<div class="footerInfo">
		<div class="wrap" style="position: relative;">
			<p>© 2017 蓝天云工作室,版权所有</p>
			<p>南阳理工学院软件学院创新基地蓝天云工作室</p>
		</div>
	</div>

	<script src="${ pageContext.request.contextPath }/js/jquery-1.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/kangning.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/jquery_003.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/jquery.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/getPageSize.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/jquery_005.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/jquery_002.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/jquery_004.js"
		type="text/javascript"></script>
	<script
		src="${ pageContext.request.contextPath }/js/scrolltopcontrol.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/layer.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/registtest.js"
		type="text/javascript"></script>

	<script type="text/javascript">
		$(function() {
			if ($(window).width() < 1500) {
				$('.history .img01').css({
					'left' : '50%',
					'margin-left' : '730px'
				});
				$('.history .img02').css({
					'right' : '50%',
					'margin-right' : '950px'
				});
			} else {
				$('.history .img02').css({
					'right' : '0',
					'margin-right' : '0'
				});
				$('.history .img01').css({
					'left' : '0',
					'margin-left' : '0'
				});
			}
			kangning.login();
			kangning.memberIndex();
			kangning.memberEventDetail();
			kangning.memberPromo();
			kangning.memberPromoDetail();
			kangning.newsIndex();
			kangning.productIndex();
			kangning.product();
			kangning.star();
			kangning.brandReal();
		});
	</script>


	<!-- Baidu Button BEGIN -->
	<script type="text/javascript" id="bdshare_js"
		data="type=tools&amp;uid=6558222"
		src="${ pageContext.request.contextPath }/js/bds_s_v2.js"></script>

	<script type="text/javascript">
		document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion="
				+ Math.ceil(new Date() / 3600000)
	</script>
	<!-- Baidu Button END -->

	<script src="${ pageContext.request.contextPath }/js/jquery-1.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/getPageSize.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/jquery_002.js"
		type="text/javascript"></script>
	<script
		src="${ pageContext.request.contextPath }/js/kxbdSuperMarquee.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/jquery_005.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/kangning.js"
		type="text/javascript"></script>
	<script
		src="${ pageContext.request.contextPath }/js/scrolltopcontrol.js"
		type="text/javascript"></script>
	<script src="${ pageContext.request.contextPath }/js/registtest.js"
		type="text/javascript"></script>


	<script type="text/javascript">
		$(function() {
			kangning.index();
		});
	</script>


	<div id="topcontrol"
		style="position: fixed; bottom: 80px; right: 30px; opacity: 0; cursor: pointer;"
		title="返回顶部">
		<img src="images/goToTop.png"
			style="width: 51px; height: 40px; border: 0; z-index: 999;">
	</div>
</body>
</html>