<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="description" content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
	<meta name="keywords" content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
	 <link rel="shortcut icon" type="image/x-icon" href="${ pageContext.request.contextPath }/js/school_l.ico">
	<link href="${ pageContext.request.contextPath }/css/reset.css" rel="stylesheet" type="text/css">
	<link href="${ pageContext.request.contextPath }/css/common.css" rel="stylesheet" type="text/css">
	<link href="${ pageContext.request.contextPath }/css/page.css" rel="stylesheet" type="text/css">
	<link href="${ pageContext.request.contextPath }/css/login.css" rel="stylesheet" type="text/css">
	<title>会员登录</title>
    <style type="text/css">
        #ul li
        {
            list-style: disc;
            margin-left: 15px;
        }
    </style>
<link rel="stylesheet" href="${ pageContext.request.contextPath }/css/layer.css" id="layui_layer_skinlayercss" style="">
<link href="${ pageContext.request.contextPath }/css/bdsstyle.css" rel="stylesheet" type="text/css">
<body>
<%-- <div class="header">
    <s></s>
    <div class="wrap">
        <span style="font-size:30px;color:#FCC;height:90px;line-height:70px;margin-left:40px;">南阳理工学院软件学院</span>
        <div class="headerRt">
            <p class="link">
                欢迎进入软件学院创新基地社团服务平台 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="${ pageContext.request.contextPath }/menu.jsp">返回首页</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="${ pageContext.request.contextPath }/regist.jsp">注册</a> 
                <a href="${ pageContext.request.contextPath }/goIndex.action">登录</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a>联系我们</a> |
                <a href="http://www.worldkitchen.cn/Careers.aspx">人才招聘</a>
            </p>
            <div class="headerSearch">
                <form onsubmit="return onSearch();" method="get" action="/Search.aspx">
                    <input class="text" id="keyWord" name="keyWord" value="请输入搜索关键字" onfocus="if(this.value=='请输入搜索关键字') this.value='';" onblur="if(this.value=='') this.value='请输入搜索关键字';" type="text">
                    <input class="submit" onclick="return check()" value="" type="submit">
                </form>
                <script type="text/javascript">
                    function check() {
                        if ($("#keyWord").val() == "请输入搜索关键字") {
                            return false;
                        }
                        return true;
                    }
                </script>
                <script src="${ pageContext.request.contextPath }/js/logger.js"></script></div>
        </div>
    </div>
</div>
<div class="nav">
    <s></s>
    <div class="wrap">
        <ul class="clearfix menutop">
            <li class="li_h "><a href="${ pageContext.request.contextPath }/menu.jsp">首页<i></i></a></li>
            <li class="li_h1"><a href="#">社团类别<i></i></a>
                <div class="navHover1" style="display: none;">
                    <dl>
                        <dd class="dl_d1">
                            <a href="#">大数据<b></b></a>
                            <div class="erNav1" style="display:none;">
                                <dl>
                                    <dd>
                                        <a href="${ pageContext.request.contextPath }/ltyshetuan.jsp">蓝天云</a></dd>
                                </dl>
                            </div>
                        </dd>
                        <dd class="dl_d2">
                            <a href="#">Java<b></b></a>
                            <div class="erNav2" style="display:none;">
                                <dl>
                                    <dd>
                                        <a href="#">前言</a></dd>
                                </dl>
                            </div>
                        </dd>
                        <dd class="dl_d3">
                            <a href="#">云计算<b></b></a>
                            <div class="erNav3" style="display:none;">
                                <dl>
                                    <dd>
                                        <a href="#">###</a></dd>
                                </dl>
                            </div>
                        </dd>
                    </dl>
                </div>
            </li>
            <li class="li_h2"><a href="#">资料共享<i></i></a>
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
</div> --%>



<div class="login">
    <div class="span12 last">
        <div class="wrap">
            <div class="main">
                <div class="title">
                    <span style="font-size:25px;"> <strong>会员登录</strong>USER LOGIN</span>
                </div>
                <div><s:actionerror /></div>
                <form action="user_login.action"  method="post" novalidate="novalidate">
                    <table>
                        <tbody>
                        <tr>
                            <th width="90px" align="left">
                                	用户名:
                            </th>
                            <td width="300px" height="40px">
                        
                            <input name="user.userName" type="text" maxlength="20"/>
                            </td>
                        </tr>
                        <tr>
                            <th width="90px" align="left">
                                	密&nbsp;&nbsp;码:
                            </th>
                            <td  width="300px" height="40px">
                     		 
                            <input name="user.password" type="password" maxlength="20" autocomplete="off"/>
                            </td>
                        </tr>

                        <tr>
                            <th>&nbsp;
                            </th>
                            <td  width="300px" height=40px">
                                <label>
                                    <input type="checkbox" id="isRememberUsername" name="isRememberUsername" value="true">记住用户名
                                </label>
                                <label>
                                    &nbsp;&nbsp;<a href="${ pageContext.request.contextPath }/findPassword.jsp">找回密码</a>
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <th>&nbsp;
                            </th>
                            <td  width="300px" height="60px">
                                <input type="submit" class="submit" value="登 录">
                            </td>
                        </tr>
                        <tr class="regist">
                            <th>&nbsp;

                            </th>
                            <td>
                                <dl>
                                    <dt>还没有注册账号？</dt>
                                    <dd>
                                        立即注册即可体验会员待遇！
                                        <a href="${ pageContext.request.contextPath }/regist.jsp">立即注册</a>
                                    </dd>
                                </dl>
                            </td>
                        </tr>
                        </tbody></table>
                </form>
            </div>
        </div>
    </div>
</div>

<div class="footerInfo" >
    <div class="wrap"  style="position:relative;" align="center">
        <p>
            © 2017 蓝天云工作室 版权所有
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
    <img src="${ pageContext.request.contextPath }/images/goToTop.png" style="width:51px; height:40px; border:0;z-index:999;">
</div>

</body>
</html>