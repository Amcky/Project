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
<link href="${ pageContext.request.contextPath }/css/src.css" rel="stylesheet" type="text/css">
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
                            <a href="#">资料下载</a>
                        </dd>
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
	<div class="w960 center clear mt1">
		<div class="pleft">
 			<div class="viewbox">
 			
  				<div class="title">
   					<h2>仿QQ的聊天界面HTML5源码 下载</h2><br>
 				</div>
 				
 			 	<div class="info"> 
 			 	<s:iterator var="list" value="#session.list">
 			 	<small>时间:</small><s:date name="#list.udate" format="yyyy-mm-dd  hh:mm:ss"></s:date><small>来源:</small><s:property value="#list.source" /><small>作者ID:</small><s:property value="#list.uid" /></div>
  				<div class="intro">标题</div> 
 			 	<div class="content">
   					<table width="100%">
    					<tbody>
                        <tr>
     				 		<td><font color="red">提醒：假如百度云分享链接失效，请联系站长，我会补上的。</font></td>
    					</tr>
    					<tr>
     						<td><span style="font-size:16px;"><strong>仿QQ的聊天界面HTML5源码 下载<br /><br />
								下载地址：链接：<a href="http://pan.baidu.com/s/1c2A5Xk" target="_blank">http://pan.baidu.com/s/1c2A5Xk</a> 
                                密码：<span style="color:#ff0000;">wcol</span><br /><br />
							<%-- 	相关图片：</strong></span><br />
						<img src="<s:property value="#list.image"/>"data-bd-imgshare-binded="1"></img> --%>									                        <br /><br /><br />
    				       </td>
    					</tr>
   						</tbody>
                      </table>
                      </s:iterator> 
  				</div> 
  				
  				    
            </div>
 		</div>
        <div class="pright"> 
 		 <div class="commend mt1">
   			<dl class="tbox light">
   			 <dt class="light"><strong><a href="${ pageContext.request.contextPath }/clubsource_downLoad.action">推荐资料</a></strong></dt>
    			<dd class="light">
    			 <ul class="d4">
                     <li>
                     <s:iterator var="list" value="#session.list">
                     <a title="" href="${ pageContext.request.contextPath }/clubsource_downLoad.action"><font color="#FF0000"><s:property value="#list.title" /></font><br /></a>
                     	
                     	</s:iterator>
      				 </li>
                    
                 </ul>
                </dd>
               </dl>
              </div>
  		<div class="hot mt1">
   			<dl class="tbox light">
    			<dt class="light"><strong><a href="${ pageContext.request.contextPath }/clubsource_downLoad.action">热门资料</a></strong></dt>
    				<dd class="light">
    					 <ul class="c1 ico2">
                              <li><s:iterator var="list" value="#session.list">
                    		 <a title="" href="${ pageContext.request.contextPath }/clubsource_downLoad.action"><font color="#FF0000"><s:property value="#list.title" /></font><br /></a>
                     	
                     	</s:iterator></li>
    				 	</ul>
    				</dd>
   			</dl>
		</div>
		</div>
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