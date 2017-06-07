<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="description" content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
		<meta name="keywords" content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
		<link rel="shortcut icon" type="image/x-icon" href="${ pageContext.request.contextPath }/js/school_l.ico">
		<link href="${ pageContext.request.contextPath }/css/reset.css" rel="stylesheet" type="text/css">
		<link href="${ pageContext.request.contextPath }/css/common.css" rel="stylesheet" type="text/css">
		<link href="${ pageContext.request.contextPath }/css/page.css" rel="stylesheet" type="text/css">
		 <link href="${ pageContext.request.contextPath }/css/findpassword.css" rel="stylesheet" type="text/css">
		<title>找回密码</title>
		
		  <style type="text/css">
        #ul li
        {
            list-style: disc;
            margin-left: 15px;
        }
    </style>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/css/layer.css" id="layui_layer_skinlayercss" style="">
    <link href="${ pageContext.request.contextPath }/css/bdsstyle.css" rel="stylesheet" type="text/css">
	<script>
	function checkUsername(){
			// 获得文件框值:
			var sresult = document.getElementById("sresult").value;
			// 1.创建异步交互对象
			var xhr = createXmlHttp();
			// 2.设置监听
			xhr.onreadystatechange = function(){
				if(xhr.readyState == 4){
					if(xhr.status == 200){
						document.getElementById("span1").innerHTML = xhr.responseText;
					}
				}
			}
			// 3.打开连接
			xhr.open("GET","${pageContext.request.contextPath}/user_findByPassword.action?user.sresult="+sresult,true);
			// 4.发送
			xhr.send(null);
		}
		
	
	
	function step1()
    {
        document.getElementById('step_1').style.display='none';
        document.getElementById('step_2').style.display='block';
    }
    function step2()
    {
        document.getElementById('step_2').style.display='none';
        document.getElementById('step_3').style.display='block';
    }
    function up2()
    {
        document.getElementById('step_1').style.display='block';
        document.getElementById('step_2').style.display='none';
    }
    function up3()
    {
        document.getElementById('step_2').style.display='block';
        document.getElementById('step_3').style.display='none';
    }
	
	</script>
</head>
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
                <script src="${pageContext.request.contextPath}/js/logger.js"></script></div>
        </div>
    </div>
</div>
<div class="nav">
    <s></s>
    <div class="wrap">
        <ul class="clearfix menutop">
            <li class="li_h "><a href="#">首页<i></i></a></li>
            <li class="li_h1"><a href="#">社团类别<i></i></a>
                <div class="navHover1" style="display: none;">
                    <dl>
                        <dd class="dl_d1">
                            <a href="#">大数据<b></b></a>
                            <div class="erNav1" style="display:none;">
                                <dl>
                                    <dd>
                                        <a href="#">蓝天云</a></dd>
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
</div>
<div class="zhaohuimima">
	<div class="title">
    	<span style="font-size:25px;"><strong>找回密码</strong></span>
	</div>
	<div>
   	 	<s:actionerror />
	</div>
	<div class="demo">
	<form id="sno" action="user_findByPassword.action" method="post">
	 <table  id="step_1">
            <tr>
                <th  width="90px" height="40px"><span class="font_red">*</span>学&nbsp;&nbsp;&nbsp;&nbsp;号：</th>
                <td colspan="2"><input id="sno" name="user.sno" type="text"  maxlength="20" style="width:268px;height:20px;" /><br></td>
            </tr>
            <tr>
                <th   height="40px">验证密码类型：</th>
                <td >
                    <input type="radio" name="user.squestion"  value="密保问题" id="squestion"/><label>密保问题</label>
                </td>
            </tr>
            <tr>
                <th>&nbsp;</th>
                <td  align="center">
                 <input type="submit" class="submit" value="下一步" onclick="javascript:step1()">
                </td>
            </tr>
        </table>
       
        <table  id="step_2" style="display:none;">
            <tr>
                <th align="left" width="90px">密保问题：</th>
                <td colspan="2"><input type="text" name="user.squestion" maxlength="20" value="" id="user.squestion" style="width:268px;height:20px;" /></td>
            </tr>
            <tr>
                <th  align="left"><span class="font_red">*</span>密保答案：</th>
                <td width="300px" height="30px">
                   <input id="sresult" name="user.sresult" type="text" style="width:268px;height:20px;"/><br>
                </td>
            </tr>
            <tr>
                <th>&nbsp;</th>
                <td  align="center">
                  <input type="submit" class="submit" value="上一步" onclick="javascript:up2()">
                    <input type="submit" class="submit" value="查看密码" onclick="javascript:step2()">
                </td>
            </tr>
        </table>

        <table  id="step_3" style="display:none;">
            <tr>
                <th align="left" width="90px">您的密码是：<%=request.getAttribute("password")%>
            </tr>
            <tr align="center" text-color="red">
                <th>请妥善保管您的密码！</th>
            </tr>
            <tr>
                <th>&nbsp;</th>
                <td align="center">
                    <input type="submit" class="submit" value="暂不登录" >
                    <input type="submit" class="submit" value="立即登录" >
                </td>
            </tr>
        </table>
    </form>
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