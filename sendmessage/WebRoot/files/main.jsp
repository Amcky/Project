<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ page language="java" pageEncoding="GBK" %>
<%@ page import="java.util.*"%> <!--��ȡϵͳʱ����뵼��� -->
<%@ page import="java.text.*"%> <!--//��ȡϵͳʱ����뵼���--> 

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
    <TD background=../images/title_bg1.jpg>&nbsp;&nbsp;<img src="../images/5.gif " style="vertical-align:middle">&nbsp;&nbsp;��ǰλ��: ��ҳ</TD></TR>
  <TR>
    <TD bgColor=#b1ceef height=1></TD></TR>
  <TR height=20>
    <TD background=../images/shadow_bg.jpg></TD></TR></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width="90%" align=center border=0>
	<tr>
        <td colspan="2" valign="top"><span class="left_bt STYLE3">��л��ʹ�� �ƶ�������������ϵͳ</span><span class="STYLE3"><br>
              <br>
            &nbsp;<img src="../images/ts.gif" width="16" height="16"> ��ʾ��<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;������ʹ�õ����������Ŀ���С�鿪����һ�������豸�����רҵϵͳ����������κ�����������½��</span><span class="left_ts STYLE3">���߿ͷ�</span><span class="left_txt STYLE3">������ѯ��<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;������Ŀ�������ϣ�����ѧУ���豸�Ĺ���ʹ�ã�����ǿ�󣬲����򵥣���̨�������練�ƣ�ֻ��򵥲������ͻ�ʹ��ϵͳ��<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;��ϵͳ���豸�������ѡ�������� </span><span class="left_txt"><br>
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
    align=middle background=../images/title_bg2.jpg>���������Ϣ</TD></TR>
  <TR bgColor=#ecf4fc height=12>
    <TD></TD></TR>
  <TR height=20>
    <TD></TD></TR></TABLE>
<TABLE cellSpacing=0 cellPadding=2 width="45%" align=left  style="border-right:dashed 1px #0066FF;">
  <TR>
      <TD align=right width=100>��ǰʱ�䣺</TD>
	  <td style="COLOR: #880000"><% 
String datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()); //��ȡϵͳʱ�� 
%> <%=datetime%></TD></TR>
  
  <TR>
    <TD align=right width=100>��½�ʺţ�</TD>
    <TD style="COLOR: #880000"><%=session.getAttribute("username")%></TD></TR>
    <TD align=right width=100>IP��&nbsp;ַ&nbsp;��</TD>
    <TD style="COLOR: #880000">222.240.172.117</TD></TR>
    <TD align=right>��վ������</TD>
    <TD style="COLOR: #880000">��������</TD></TR></TABLE>
	
	
	<div class="state">��̨��Ϣ:</div></BODY></HTML>