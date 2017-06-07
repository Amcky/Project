<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<style type="text/css">
  @import url("css/zhece.css");
</style>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/main.js"></script> 
<script type="text/javascript" src="js/jquery.min.js" ></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
var a=0;
var b=0;
var c=0;
var d=0;
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
	$("#returnan").click(function(){
		$("#RETURNAN").append('<div >ip<input type="text" name="returnan['+d+'].ip">domain<input type="text" name="returnan['+d+'].domain"></div>');
		d++;
		})
}

  

</script>
</head>
<body>
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
</div>

<s:iterator value="#request.named" id="art" status="sta">
	Domain Name :<s:property value="#art.name"/><br>
	Description:<s:property value="#art.description"/><br>
	
<s:iterator value="#request.zone" id="zone" status="sta">
	Default Record TTL:<s:property value="#zone.ttl"/><br>
	Serial:<s:property value="#zone.serial"/><br>
	refresh:<s:property value="#zone.refresh"/><br>
	retry:<s:property value="#zone.retry"/><br>
	expire:<s:property value="#zone.expire"/><br>
	minimum:<s:property value="#zone.minimum"/><br>
	<s:if test="#zone.pid==0">
<form action="adddomain.action" method="get">
 <strong>A</strong>
 <div id="A">
 <s:iterator value="#request.addre" id="addre" status="sta">
 	<div>
	 	ip<input type="text" value="<s:property value="#addre.ip"/>">
	 	标识<input type="text" value="<s:property value="#addre.domain"/>">
	 	<a href='deletezone.action?cid=<s:property value="#addre.id"/>&name=addre'>delete</a>
 	</div>
 </s:iterator>

 </div>
 
  <a id="a" >添加</a>
 
 
 
  <br><br><br><strong>MX</strong>
  <div id="MX">
	<s:iterator value="#request.mail" id="mail" status="sta">
		<div>
			优先级<input type="text" value="<s:property value="#mail.priority"/>" >
			标识<input type="text" value="<s:property value="#mail.logo"/>" >
			主机名<input type="text" value="<s:property value="#mail.server"/>" >
			<a href="deletezone.action?cid=<s:property value="#mail.id"/>&name=mail">delete</a>
		</div>
	</s:iterator>
 </div>
  <a id="mx" >添加</a>
  
  
  
 		 <br><br><br><strong>CNAME</strong>
	  <div id="CNAME">
	  <s:iterator value="#request.cname" id="cname" status="sta">
			<div>
				辅助域名<input type="text" value="<s:property value="#cname.cname"/>">
				主域名<input type="text" value="<s:property value="#cname.name"/>">
				<a href='deletezone.action?cid=<s:property value="#cname.id"/>&name=cname'>delete</a>
			</div>
		</s:iterator>
	 	</div>
  <a id="cname" >添加</a><br>
  <input name="id" type="hidden" value='<s:property value="#art.id"/>'>
   <input name="name" type="hidden" value='<s:property value="#art.name"/>'>
  <input type="submit" value="保存">
  </form>
  </s:if>
  
  
  	<s:if test="#zone.pid==1">
  		<form action="adddomain.action" method="get">
  			<br><br><strong>RETURNAN</strong>
  				<div id="RETURNAN"></div>
  				 <s:iterator value="#request.returnan" id="returnan" status="sta">
					
					<div>
						ip<input type="text"  value="<s:property value="#returnan.ip"/>" >
						domain<input type="text" value="<s:property value="#returnan.domain"/>">
						<a href='deletezone.action?cid=<s:property value="#returnan.id"/>&name=returnan'>delete</a>
					</div>
					
					</s:iterator>
  				
  				<a id="returnan" >添加</a><br>
  				<input name="id" type="hidden" value='<s:property value="#art.id"/>'>
  				   <input name="name" type="hidden" value='<s:property value="#art.name"/>'>
  			  <input type="submit" value="保存">
  		</form>
	</s:if>
  
  
  </s:iterator>
</s:iterator>

</body>
</html>