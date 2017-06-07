<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>找回密码</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="description" content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
		<meta name="keywords" content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
		<link rel="shortcut icon" type="image/x-icon" href="${ pageContext.request.contextPath }/js/school_l.ico">
		<link href="${ pageContext.request.contextPath }/css/reset.css" rel="stylesheet" type="text/css">
		<link href="${ pageContext.request.contextPath }/css/common.css" rel="stylesheet" type="text/css">
		<link href="${ pageContext.request.contextPath }/css/page.css" rel="stylesheet" type="text/css">
		 <link href="${ pageContext.request.contextPath }/css/找回密码.css" rel="stylesheet" type="text/css">
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
		
	function checkSno() {
		var sno = document.getElementById("sno").value;
		var sno1 = request.getAttribute("sno");
		var squestion=request.getAttribute()
		if(sno != sno1) {
			alter("没有该学号");
			return false;
		} else {
			
		}
	}
	
	function checkForm() {
	// 获得密保问题框的值:
	var squestion = document.getElementById("squestion").value;
	if(squestion == null || squestion == ''){
		alert("密保问题不能为空!");
		return false;
	}
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
                <a href="1.主页.html">返回首页</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[
                <a href="2.注册.html">注册</a> /
                <a href="3.登录.html">登录</a>] &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
                <script src="样式效果/js/logger.js"></script></div>
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
	<form id="password" action="user_findByPassword.action" method="post">
	 <table  id="step_1">
            <tr>
                <th  width="90px" height="40px"><span class="font_red">*</span>学&nbsp;&nbsp;&nbsp;&nbsp;号：</th>
                <td colspan="2"><input type="text" id="sno" name="sno" maxlength="20" onblur="checkSno()" style="width:268px;height:20px;" /></td>
            </tr>
            <tr>
                <th   height="40px">验证密码类型：</th>
                <td >
                    <input type="radio" name="passwordquestion"  value="密保问题" id="passwordquestion"/><label>密保问题</label>
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
                <td width="300px" height="30px">
                        <select id="squestion"  name="squestion" class="text" actype="text" name="squestion" onblur="checkForm()" style="width:268px;height:20px;"/>
                            <option value="无">无</option>
                            <option value="你父亲的生日是？">你父亲的生日是？</option>
                            <option value="你母亲的生日是？">你母亲的生日是？</option>
                            <option value="你高中班主任是？">你高中班主任是？</option>
                        </select>
                    </td>
                    <td id="squestion"></td>
            </tr>
            <tr>
                <th  align="left"><span class="font_red">*</span>密保答案：</th>
                <td width="300px" height="30px">
                   <input id="sresult" name="user.sresult" type="text"/><br> style="width:268px;height:20px;"/>
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
</body>
</html>