<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
<meta name="keywords" content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
<link rel="shortcut icon" type="image/x-icon" href="${ pageContext.request.contextPath }/images/school_l.ico">
<link href="${ pageContext.request.contextPath }/css/reset.css" rel="stylesheet" type="text/css">
<link href="${ pageContext.request.contextPath }/css/common.css" rel="stylesheet" type="text/css">
<link href="${ pageContext.request.contextPath }/css/page.css" rel="stylesheet" type="text/css">
<link href="${ pageContext.request.contextPath }/css/layout.css" rel="stylesheet" type="text/css">
<title>欢迎进入南阳理工学院软件学院创新基地社团服务平台</title>
    <style type="text/css">
        #ul li
        {
            list-style: disc;
            margin-left: 15px;
        }
    </style>
<link rel="stylesheet" href="${ pageContext.request.contextPath }/css/layer.css" id="layui_layer_skinlayercss" style="">
<link href="${ pageContext.request.contextPath }/css/bdsstyle.css" rel="stylesheet" type="text/css"></head>
<body>
<div class="header">
    <s></s>
    <div class="wrap">
       	<span style="font-size:30px;color:#FCC;height:90px;line-height:70px;margin-left:40px;">南阳理工学院软件学院</span>
        <div class="headerRt">
            <p class="link">
                欢迎进入软件学院创新基地社团服务平台 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                <a href="${ pageContext.request.contextPath }/menu.jsp">返回首页</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[
                <a href="${ pageContext.request.contextPath }/regist.jsp">注册</a> / 
                <a href="${ pageContext.request.contextPath }/goIndex.action">登录</a>] &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a>联系我们</a> |
                 <a href="http://www.worldkitchen.cn/Careers.aspx">人才招聘</a>
            </p>
        </div>
    </div>
</div>
<div class="nav">
    <s></s>
    <div class="wrap">
        <ul class="clearfix menutop">
            <li class="li_h "><a href="${ pageContext.request.contextPath }/menu.jsp">首页<i></i></a></li>
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
                            <a href="${ pageContext.request.contextPath }/club/clubsourceu.jsp">上传资料</a></dd>
                        <dd>
                            <a href="#">资料下载</a></dd>
                    </dl>
                </div>
            </li>
            <li class="li_h3"><a href="#">论坛<i></i></a>
                <div class="navHover3" style="display: none;">
                    <dl>
                        <dd>
                            <a href="#">####</a></dd>
                        <dd>
                            <a href="#">####</a></dd>
                        <dd>
                            <a href="#">####</a></dd>
                    </dl>
                </div>
            </li>
            <li class="li_h4"><a href="#">最新动态<i></i></a></li>
            <li class="li_h6"><a href="http://www.worldkitchen.cn/member/">关于我们<i></i></a></li>
        </ul>
    </div>
</div>

<div class="listbox"> 
<s:iterator var="list" value="#session.list">
  <dl class="tbox">
  
    <dt><strong><a href="${ pageContext.request.contextPath }/club_findAllClub.action"><s:property value="#list.subject" /></a></strong><span class="more"><a href="#">更多...</a></span></dt>
    <dd>
  
     <ul class="d1 ico3">
    	<%--  --%>
      	<li><span>03-09</span>
      	<s:iterator var="list" value="#session.list">
      	<a title="" href="${ pageContext.request.contextPath }/clubsource_downLoad.action">
      	<s:property value="#list.title" /><br /></a>
      	</s:iterator></li>
    	
     </ul>
    
    </dd>
   
   </dl>
   </s:iterator>
  </div>

 

 <div class="pright">
    <div id="rightAD1" >
      <div class="commend mt1">
       <dl class="tbox light">
        <dt class='light'><strong><a href="${ pageContext.request.contextPath }/clubsource_downLoad2.action">推荐资料</a></strong></dt>
        <dd class='light'>
         <ul class="c1 ico2">
          <div id='dedecms'>
            <li class='dotline'><s:iterator var="list" value="#session.list">
                  		<a href="${ pageContext.request.contextPath }/clubsource_downLoad.action">
                  			<s:property value="#list.title" /><br /></a>
                  	</s:iterator>
                </li>
  		  </div>
     </ul>
    </dd>
   </dl>
  </div>

  
  <div class="hot mt1">
   <dl class="tbox light">
    <dt class='light'><strong><a href="${ pageContext.request.contextPath }/clubsource_downLoad2.action">本月热门资料</a></strong></dt>
    <dd class='light'>
     <ul class="c1 ico2">
      <li class='dotline'><s:iterator var="list" value="#session.list">
                  		<a href="${ pageContext.request.contextPath }/clubsource_downLoad.action">
                  			<s:property value="#list.title" /><br /></a>
                  	</s:iterator></li>
     
     </ul>
    </dd>
   </dl>
  </div>
 </div>

</div>
<div class="flink w960 center clear">
 <dl class="tbox" >
  <dt> <strong>友情链接</strong>
	<span class="linklabel">	
			<a href="#" _for="flink_1">IT网站</a> 
	</span>
	 </dt>
  <dd id="flink_1">
    <ul class="f5" style="height: 100px;">
		<li><a href='http://www.bjsxt.com/' target='_blank'>尚学堂</a> </li><li><a href='http://www.open1111.com' target='_blank'>Java爬虫建站网</a> </li><li><a href='http://pan.open1111.com' target='_blank'>百度云搜索</a> </li><li><a href='https://www.mysubmail.com/' target='_blank'>云通信</a> </li><li><a href='http://bj.kezhanwang.cn/' target='_blank'>北京培训网</a> </li><li><a href='http://www.wanho.net/' target='_blank'>南京Java培训</a> </li><li><a href='http://www.idcs.cn' target='_blank'>西安云服务器</a> </li><li><a href='http://c.itcast.cn/' target='_blank'>传智播客C++</a> </li><li><a href='http://www.elsyy.com' target='_blank'>在线学习平台</a> </li><li><a href='http://pan.java1234.com/' target='_blank'>网盘搜索</a> </li><li><a href='http://www.jeecg.org' target='_blank'>jeecg微云开发</a> </li><li><a href='http://www.itjiaocheng.com' target='_blank'>java视频教程</a> </li><li><a href='http://www.jsshare.com' target='_blank'>js网页特效分享网</a> </li><li><a href='http://www.maiziedu.com' target='_blank'>IT在线教育</a> </li><li><a href='http://www.laomaotao.org' target='_blank'>老毛桃winpe</a> </li><li><a href='http://weixin.itokit.com' target='_blank'>微管家</a> </li><li><a href='http://www.banshier.com' target='_blank'>办事儿网</a> </li><li><a href='http://bbs.it-home.org/' target='_blank'>IT论坛</a> </li><li><a href='http://www.itheima.com/' target='_blank'>java教程</a> </li><li><a href='http://www.zuidaima.com/' target='_blank'>最代码</a> </li><li><a href='http://www.proginn.com/' target='_blank'>程序员客栈</a> </li><li><a href='http://www.javaxxz.com' target='_blank'>Java学习者论坛</a> </li><li><a href='http://mos.meituan.com' target='_blank'>美团云</a> </li><li><a href='http://www.shiyanlou.com' target='_blank'>实验楼IT在线教育</a> </li><li><a href='http://www.polyv.net' target='_blank'>保利威视云视频</a> </li><li><a href='http://www.mobiletrain.org' target='_blank'>iOS培训</a> </li><li><a href='http://www.rupeng.com' target='_blank'>如鹏网</a> </li><li><a href='http://blog.java1234.com/' target='_blank'>Java开源博客系统</a> </li><li><a href='http://www.dajiangtai.com/course/list.do' target='_blank'>Spark培训课程</a> </li><li><a href='http://jar.open1111.com/' target='_blank'>Jar包下载网</a> </li><li><a href='http://www.ysfybj.com/' target='_blank'>迷失传奇</a> </li><li><a href='http://java.ixueyun.com/' target='_blank'>成都java学习</a> </li><li><a href='http://blog.open1111.com/' target='_blank'>博客采集</a> </li><li><a href='http://www.ibeifeng.com/' target='_blank'>北风网</a> </li><li><a href='http://www.xwcms.net' target='_blank'>xw素材网</a> </li><li><a href='http://www.bjpowernode.com' target='_blank'>java培训</a> </li><li><a href='http://www.itcast.cn' target='_blank'>传智播客</a> </li><li><a href='http://www.itheima.com' target='_blank'>黑马程序员</a> </li><li><a href='http://www.500d.me' target='_blank'>简历模板</a> </li><li><a href='http://soft.job1001.com/' target='_blank'>软件工程师招聘</a> </li><li><a href='http://365bet.cd/' target='_blank'>365bet体育在线</a> </li><li><a href='http://www.yztcedu.com/' target='_blank'>java培训</a> </li><li><a href='http://www.kgc.cn/' target='_blank'>IT培训</a> </li>
    </ul>
  </dd>
 </dl>
</div>
    
<div class="footerInfo">
    <div class="wrap" style="position:relative;">
        <p>
           © 2017 蓝天云工作室,版权所有
		</p>
        <p>
          南阳理工学院软件学院创新基地蓝天云工作室</p>       
    </div>
</div>

<script src="${ pageContext.request.contextPath }/js/jquery-1.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/kangning.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/jquery_003.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/jquery.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/getPageSize.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/jquery_005.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/jquery_002.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/jquery_004.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/scrolltopcontrol.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/layer.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/registtest.js" type="text/javascript"></script>

<script type="text/javascript">
    $(function () {
        if ($(window).width() < 1500) {
            $('.history .img01').css({ 'left': '50%', 'margin-left': '730px' });
            $('.history .img02').css({ 'right': '50%', 'margin-right': '950px' });
        } else {
            $('.history .img02').css({ 'right': '0', 'margin-right': '0' });
            $('.history .img01').css({ 'left': '0', 'margin-left': '0' });
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
<script type="text/javascript" id="bdshare_js" data="type=tools&amp;uid=6558222" src="${ pageContext.request.contextPath }/js/bds_s_v2.js"></script>

<script type="text/javascript">
    document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date() / 3600000)
</script>
<!-- Baidu Button END -->

<script src="${ pageContext.request.contextPath }/js/jquery-1.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/getPageSize.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/jquery_002.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/kxbdSuperMarquee.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/jquery_005.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/kangning.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/scrolltopcontrol.js" type="text/javascript"></script>
<script src="${ pageContext.request.contextPath }/js/registtest.js" type="text/javascript"></script>


<script type="text/javascript">
    $(function () {
        kangning.index();
    });
</script>


<div id="topcontrol" style="position: fixed; bottom: 80px; right: 30px; opacity: 0; cursor: pointer;" title="返回顶部">
    <img src="images/goToTop.png" style="width:51px; height:40px; border:0;z-index:999;">
</div>
</body>
</html>