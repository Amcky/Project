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
	<form action="addreverse.action" method="get">
	<b>反向解析</b> <br><br>
	网段:<input type="text" name="ip"><br>
	域名：<input type="text" name="dmain"><br>
	描述:<input type="text" name="description"><br><br>
	<b>参数设置</b><br><br>
	TTL:<input type="text" name="ttl"><br>
	serial:<input type="text" name="serial"><br>
	refresh:<input type="text" name="refresh"><br>
	retry:<input type="text" name="retry"><br>
	expiry:<input type="text" name="expire"><br>
	minimum<input type="text" name="minimum"><br><br>

<input type="submit" value="提交">
</div>

</form>
</body>
</html>