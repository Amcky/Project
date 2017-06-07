<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/main.js"></script> 
<script type="text/javascript" src="js/jquery.min.js" ></script>
<script type="text/javascript">
var a=0;
var b=0;
var c=0;
window.onload=function(){
	$("#a").click(function(){
		$("#A").append('<div>ip<input type="text" name="addre['+a+'].ip">标识<input type="text" name="addre['+a+'].domain"></div>');
		a++;
	})
	$("#mx").click(function(){
		$("#MX").append('<div>优先级<input type="text" name="mail['+b+'].priority">标识<input type="text" name="mail['+b+'].logo">主机名<input type="text" name="mail['+b+'].server"></div>');
		b++;
		})
	$("#cname").click(function(){
		$("#CNAME").append('<div >辅助域名<input type="text" name="cname['+c+'].cname">主域名<input type="text" name="cname['+c+'].name"></div>');
		c++;
		})
}

  

function a(){
	alert('1');
}
</script>
<style type="text/css">
  @import url("css/zhece.css");
</style>
</head>
<body>
<!--头部开始 -->
<div class="head ">
  <div class="cont">
    <div class="head-left"><a href="#"><img src="images/logo.png" alt="" /></a></div>
    <div class="nav"> 
      <!--导航条-->
      <ul class="nav-main">
        <li>网站首页</li>
        <li id="li-1">域管理<span></span></li>
        <li id="li-2">服务器管理<span></span></li>
        <li id="li-3">配置<span></span></li>
        <li id="li-4">用户管理<span></span></li>
      </ul>
      <!--隐藏盒子-->
      <div id="box-1" class="hidden-box hidden-loc-index">
        <ul>
          <li><a href="showdns.action">域管理服务器列表</a></li>
          <li><a href="add.jsp">添加域</a></li>
           <li><a href="Reverse.jsp">反向解析</a></li>
		  <li>导入域</li>
        </ul>
      </div>
      <div id="box-2" class="hidden-box hidden-loc-us">
        <ul>
          <li>名称服务器列表</li>
          <li>添加名称服务器</li>
          <li>管理服务器组</li>
          <li>添加组</li>
        </ul>
      </div>
      <div id="box-3" class="hidden-box hidden-loc-info">
        <ul>
          <li>调整配置</li>
        </ul>
      </div>
      <div id="box-4" class="hidden-box hidden-loc-info box04">
        <ul>
		  <li>用户列表</li>
          <li>添加用户</li>
          <li>联系我们</li>
          <li>加入我们</li>
        </ul>
      </div>
    </div>
    <script type="text/javascript" src="js/main.js"></script> 
  </div>
  <div class="yanse"></div>
</div>


<div>
	<form action="adddomain.action" method="get">
 <strong>A</strong>
 <div id="A">

 </div>
  <a id="a" >tianjia</a>
 
 
 
  <br><br><br><strong>MX</strong>
  <div id="MX">

 </div>
  <a id="mx" >tianjia</a>
  
  
  
  <br><br><br><strong>CNAME</strong>
	  <div id="CNAME">
	
	 	</div>
  <a id="cname" >tianjia</a><br>
  <input type="submit" value="tijiao">
  </form>
</div>

</body>
</html>