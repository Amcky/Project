<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ page language="java" pageEncoding="GBK" %>
<%@ page import="java.util.*"%> <!--获取系统时间必须导入的 -->
<%@ page import="java.text.*"%> <!--//获取系统时间必须导入的--> 

<HTML><HEAD>
<META http-equiv=Content-Type content="text/html; charset=gb2312">
<LINK href="../css/admin.css" type="text/css" rel="stylesheet">
<style type="text/css">
<!--
.STYLE3 {font-size: 14px}
-->
</style>
</HEAD>
<BODY>
<TABLE cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
  <TR height=28>
    <TD background=../images/title_bg1.jpg>&nbsp;&nbsp;<img src="../images/5.gif " style="vertical-align:middle">&nbsp;&nbsp;当前位置: 首页</TD></TR>
  <TR>
    <TD bgColor=#b1ceef height=1></TD></TR>
  <TR height=20>
    <TD background=../images/shadow_bg.jpg></TD></TR></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width="90%" align=center border=0>
	<tr>
        <td colspan="2" valign="top"><span class="left_bt STYLE3">感谢您使用 移动互联短信提醒系统</span><span class="STYLE3"><br>
              <br>
            &nbsp;<img src="../images/ts.gif" width="16" height="16"> 提示：<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;您现在使用的是网络中心开发小组开发的一套用于设备管理的专业系统！如果您有任何疑问请点左下解的</span><span class="left_ts STYLE3">在线客服</span><span class="left_txt STYLE3">进行咨询！<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;各大栏目完美整合，方便学校对设备的管理使用，功能强大，操作简单，后台操作易如反掌，只需简单操作，就会使用系统！<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;此系统是设备管理的首选方案！　 </span><span class="left_txt"><br>
</span></td>
       
        
  <TR height=100>  
   </TR>
  <TR>
    <TD colSpan=3 height=10></TD></TR></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border="0">
  <TR height=20>
    <TD></TD></TR>
  <TR height=22>
    <TD style="PADDING-LEFT: 20px; FONT-WEIGHT: bold; COLOR: #ffffff" 
    align=middle background=../images/title_bg2.jpg>您的相关信息</TD></TR>
  <TR bgColor=#ecf4fc height=12>
    <TD></TD></TR>
  <TR height=20>
    <TD></TD></TR></TABLE>
<TABLE cellSpacing=0 cellPadding=2 width="45%" align=left  style="border-right:dashed 1px #0066FF;">
  <TR>
      <TD align=right width=100>当前时间：</TD>
	  <td style="COLOR: #880000"><% 
String datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()); //获取系统时间 
%> <%=datetime%></TD></TR>
  
  <TR>
    <TD align=right width=100>登陆帐号：</TD>
    <TD style="COLOR: #880000"><%=session.getAttribute("username")%></TD></TR>
    <TD align=right width=100>IP地&nbsp;址&nbsp;：</TD>
    <TD style="COLOR: #880000">222.240.172.117</TD></TR>
    <TD align=right>网站开发：</TD>
    <TD style="COLOR: #880000">网络中心</TD></TR></TABLE>
	
	
	<div class="state">后台信息:</div></BODY></HTML>