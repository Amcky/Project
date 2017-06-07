<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="description" content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
    <meta name="keywords" content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
    <link rel="shortcut icon" type="image/x-icon" href="${ pageContext.request.contextPath }/js/school_l.ico">
	<link href="${ pageContext.request.contextPath }/css/reset.css" rel="stylesheet" type="text/css">
	<link href="${ pageContext.request.contextPath }/css/common.css" rel="stylesheet" type="text/css">
	<link href="${ pageContext.request.contextPath }/css/page.css" rel="stylesheet" type="text/css">
    <link href="${ pageContext.request.contextPath }/css/regist.css" rel="stylesheet" type="text/css">
    <title>会员注册</title>

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
function change(){
	var img1 = document.getElementById("checkImg");
	img1.src="${pageContext.request.contextPath}/checkImg.action?"+new Date().getTime();
}
function checkForm()
{
	// 校验用户名:
	// 获得用户名文本框的值:
	var username = document.getElementById("userName").value;
	if(username == null || username == ''){
		alert("用户名不能为空!");
		return false;
	}
	// 校验密码:
	// 获得密码框的值:
	var password = document.getElementById("password").value;
	if(password == null || password == ''){
		alert("密码不能为空!");
		return false;
	}
	// 校验性别:
	// 获得性别文本框的值:
	var username = document.getElementById("sex").value;
	if(sex == null || sex == ''){
		alert("性别不能为空!");
		return false;
	}
	// 校验电话:
	// 获得电话框的值:
	var phone = document.getElementById("phone").value;
	if(phone == null || phone == ''){
		alert("电话不能为空!");
		return false;
	}
	// 校验简介:
	// 获得简介框的值:
	var descp = document.getElementById("descp").value;
	if(descp == null || descp == ''){
		alert("简介不能为空!");
		return false;
	}
	// 校验密保问题:
	// 获得密保问题框的值:
	var squestion = document.getElementById("squestion").value;
	if(squestion == null || squestion == ''){
		alert("密保问题不能为空!");
		return false;
	}
	// 校验密保答案:
	// 获得密保问题框的答案:
	var sresult = document.getElementById("sresult").value;
	if(sresult == null || sresult == ''){
		alert("密保答案不能为空!");
		return false;
	}
	// 校验学号:
	// 获得学号的答案:
	var sno = document.getElementById("sno").value;
	if(sno == null || sno == ''){
		alert("学号不能为空!");
		return false;
	}
}
	function checkUsername(){
		// 获得文件框值:
		var username = document.getElementById("userName").value;
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
		xhr.open("GET","${pageContext.request.contextPath}/user_findByName.action?user.userName="+username,true);
		// 4.发送
		xhr.send(null);
	}
	
	function createXmlHttp(){
		   var xmlHttp;
		   try{ // Firefox, Opera 8.0+, Safari
		        xmlHttp=new XMLHttpRequest();
		    }
		    catch (e){
			   try{// Internet Explorer
			         xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
			      }
			    catch (e){
			      try{
			         xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
			      }
			      catch (e){}
			      }
		    }

			return xmlHttp;
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
                <a href="${ pageContext.request.contextPath }/register.jsp">注册</a> / 
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


<div class="zhuce">
    <div class="title">
        <span style="font-size:25px;"><strong>会员注册</strong>USER REGISTER</span>
    </div>
    <div>
        <s:actionerror />
    </div>
    <div class="login">
        <tr>
        <span style="font-size:16px;"><strong>已经拥有账号了？ <a href="3.登录.html">立即登录</a><strong></span>
        </tr>
    </div>
    <div class="demo" >
    <form id="register" name="user_register_form" action="user_regist" method="post"  enctype="multipart/form-data" onSubmit="return checkForm();">
        <table  >
            <div class="register_1">
                <tr>
                    <th width="90px" align="right"><span class="font_red">*</span>用户名：</th>
                    <td width="300px" height="30px">
                        <input type="text" id="userName" name="user.userName" maxlength="20" value=""  onfocus="javascript:checknames();" onkeyup="javascript:checkname();" style="width:268px;height:20px;"/>
                    </td>
                    <td id="passname"></td>
                </tr>
                <tr>
                    <th align="left"><span class="font_red">*</span>密&nbsp;&nbsp;&nbsp;&nbsp;码：</th>
                    <td width="300px" height="30px">
                        <input type="password" name="user.password" maxlength="20" id="password" onfocus="javascript:checkpasswords();" onblur="javascript:checkpasswordss(this.value);" onkeyup="chkpwd(this)" style="width:268px;height:20px;"/>
                    </td>
                    <td id="passwname"></td>
                </tr>
                <tr>
                    <th align="left" ><span class="font_red">*</span>密保问题：</th>
                    <td width="300px" height="30px">
                        <input id="squestion"  name="squestion" class="text" type="text"   value="" id="wq" onfocus="checkpasswordquestions();" onblur="javascript:checkpasswordquestion();"style="width:268px;height:20px;"/>
                       
                    </td>
                    <td id="squestion"></td>
                </tr>
                <tr>
                    <th align="left"><span class="font_red">*</span>密保答案：</th>
                    <td width="300px" height=30px">
                        <input type="text" name="user.sresult" value="" id="sresult" onfocus="javascript:checkpasswordanswers();" onblur="javascript:checkpasswordanswer(this.value);"style="width:268px;height:20px;"/>
                    </td>
                    <td id="passwordan"></td>
                </tr>
                </div>
            <div class="register_2">
            <tr>
                <th align="left"><span class="font_red">*</span>您的姓名：</th>
                <td width="300px" height="30px">
                    <input type="text" name="user.trueName" value="" id="trueName" onfocus="javascript:checkuname();" onblur="javascript:checkuser(this.value);"/>
      				
                </td>
                <td id="unames"></td>
            </tr>
            <tr>
                    <th align="left">性别：</th>
                    <td width="300px" height=30px">
                        <input id="sex" name="user.sex" type="text" style="width:268px;height:20px;"/>
                    </td>
                    <td id="passwordan"></td>
                </tr>
            <tr>
                <th align="left">&nbsp;&nbsp;手机号码：</th>
                <td width="300px" height="30px" colspan="2"><input type="text" name="user.phone" maxlength="20" value="" id="phone" style="width:268px;height:20px;" onKeyUp="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"/></td>
            </tr>
            <tr>
                <th align="left">&nbsp;&nbsp;学&nbsp;&nbsp;&nbsp;&nbsp;号：</th>
                <td width="300px" height="30px" colspan="2"><input type="text" name="user.sno" maxlength="20" value="" id="sno" style="width:268px;height:20px;" onKeyUp="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"/></td>
            </tr>
                </div>
            <div class="register_3">
            <tr>
                <th align="left">&nbsp;&nbsp;个人简介：</th>
                <td width="300px" height="30px">
                    <textarea id="descp" name="user.descp" rows="5" cols="20" style="width:268px;height:100px;" placeholder="&nbsp;&nbsp;&nbsp;&nbsp;这个人很懒，什么都没留下~" onKeyDown="checkMaxInput(this)" onKeyUp="checkMaxInput(this)"></textarea>
                    <br>
                    <font align="left" id=remLen><b></b></font>
                </td>
            </tr>

            <tr>
                <th align="left">&nbsp;&nbsp;所属社团：</th>
                <td width="300px" height="30px">
                    <select id="cid"  name="user.cid" class="text" actype="text" name="社团"  value="" id="register_社团" style="width:268px;height:20px;" onKeyUp="this.value=this.value.reple(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
                        <option value="无">无</option>

                        <option value="1">1</option>

                        <option value="2">2</option>

                        <option value="3">3</option>

                        <option value="4">4</option>
                    </select>
                </td>
            </tr>

             <tr>
                <th  align="left">&nbsp;&nbsp;用户头像：  </th>
                <td width="300px" height="30px" class="liulananniu"><input type="file" name="upload" style="width:252px;"></td>
             </tr>

              <tr>
                <th align="left"><span class="font_red">*</span>验证码：</th>
                <td width="300px" height="60px">
                <input type="text" id="checkcode" name="checkcode" class="text captcha" maxlength="4" autocomplete="off">
                <img id="checkImg" class="captchaImage" src="${pageContext.request.contextPath}/checkImg.action" onclick="change()" title="点击更换验证码">
      			<s:actionerror/><br>
                 <td id="resets"></td>
             </tr>
            </div>
            <div class="register_4">
            <tr>
                <th>
                </th>
                <td align="center" class="anniu">
                    <input type="submit"  value="注册" >
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="button"  value="重置" >
                </td>
            </tr>
                </div>
        </table>
    </form>
</div>
</div>
        <div class="footerInfo">
    <div class="wrap" style="position:relative;"  align="center">
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
    <img src="images/goToTop.png" style="width:51px; height:40px; border:0;z-index:999;">
</div>
</body>
 </html>
