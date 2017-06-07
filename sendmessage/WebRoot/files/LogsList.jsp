<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
		<title>河南师范大学移动互联短信提醒系统</title>
	</head>

<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.tabfont01 {	
	font-family: "宋体";
	font-size: 9px;
	color: #555555;
	text-decoration: none;
	text-align: center;
}
.font051 {font-family: "宋体";
	font-size: 12px;
	color: #333333;
	text-decoration: none;
	line-height: 20px;
}
.font201 {font-family: "宋体";
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}
.button {
	font-family: "宋体";
	font-size: 14px;
	height: 37px;
}
html { overflow-x: auto; overflow-y: auto; border:0;} 
-->
</style>

<link href="../css/css.css" rel="stylesheet" type="text/css" />
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/xiangmu.js"></script>
	<SCRIPT type="text/javascript">
    function jump(input)
    {
      if(input.value==${p.currentPage})
      { 
      return;
      }
      var url="logList.action?page="+input.value;
      document.location=url;
    } 
</SCRIPT>

<SCRIPT language=JavaScript>
function sousuo(){
	window.open("gaojisousuo.htm","","depended=0,alwaysRaised=1,width=800,height=510,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
}
function selectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			obj[i].checked = true;
		}
	}
}

function unselectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			if (obj[i].checked==true) obj[i].checked = false;
			else obj[i].checked = true;
		}
	}
}

function link(){
    document.getElementById("fom").action="sendxiaoxi.htm";
   document.getElementById("fom").submit();
}

function on_load(){
	var loadingmsg=document.getElementById("loadingmsg");
	var mainpage=document.getElementById("mainpage");
	loadingmsg.style.display="";
	mainpage.style.display="none";
	
	loadingmsg.style.display="none";
	mainpage.style.display="";
}
</SCRIPT>



<body >
<form name="fom" id="fom" method="post" action="">
<table id="mainpage" width="100%" border="0" cellspacing="0" cellpadding="0">

  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="62" background="../images/nav04.gif">
          
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		  <tr>
			<td width="21"><img src="../images/ico07.gif" width="20" height="18" /></td>
			<td width="550">查看已发短信：按时间：
			  <input name="textfield" type="text" size="12" readonly="readonly"/><span class="newfont06">至</span>
			 <input name="textfield" type="text" size="12" readonly="readonly"/>	
			 <input name="Submit" type="button" class="right-button02" value="查 询" />
			 </td>
			 <td width="132" align="left"><a href="#" onclick="sousuo()">
			   <input name="Submit" type="button" class="right-button07" value="高级搜索" /></a></td>	
		  </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">

        <tr>
          <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">

          	 <tr>
               <td height="20"><span class="newfont07">选择：<a href="#" class="right-font08" onclick="selectAll();">全选</a>-<a href="#" class="right-font08" onclick="unselectAll();">反选</a></span>
	              <input name="Submit" type="button" class="right-button08" value="删除所选信息" />
	              <input name="Submit2" type="button" class="right-button08" value="新建信息" onclick="link();"/></td>
          	 </tr>
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					                  <tr>
                    <td height="20" colspan="5" align="center" bgcolor="#EEEEEE"class="tablestyle_title"><div align="center">操作日志列表&nbsp;</div></td>
                    </tr>
                  <tr>
				    <td width="4%" align="center" bgcolor="#EEEEEE">选择</td>
                    <td width="15%" height="20" align="center" bgcolor="#EEEEEE">操作内容</td>
                    <td width="10%" align="center" bgcolor="#EEEEEE">操作时间</td>
                    <td width="10%" align="center" bgcolor="#EEEEEE">操作者</td>
                  
                    <td width="12%" align="center" bgcolor="#EEEEEE">管理</td>
                  </tr>
                  <s:iterator value="#request.LogList" id="list">
                  <tr align="center">
				    <td bgcolor="#FFFFFF"><input type="checkbox" name="delid"/></td>
                    <td height="20" bgcolor="#FFFFFF"><s:property value="#list.content" /></td>
                    <td bgcolor="#FFFFFF"><s:property value="#list.createTime" /></td>
                    <td bgcolor="#FFFFFF"><s:property value="#list.user.usercode"/></td>                 
                    <td bgcolor="#FFFFFF"><a href="#">删除|</a><a href="sendxiaoximingxi.htm">查看</a></td>
                  </tr>
				</s:iterator>
				
                </table></td>
              </tr>
            </table></td>
        </tr>
      </table>
     <center>
     <a href="logList.action?page=1">首页</a>
	<c:if test="${p.currentPage>1}">
		<a href="logList.action?page=${p.currentPage-1}"> [前页]</a>
	</c:if>

	<c:if test="${p.currentPage<=1}">
[前页]
</c:if>

	<c:if test="${p.currentPage<p.totalpages}">
		<a href="logList.action?page=${p.currentPage+1}"> [后页]</a>
	</c:if>

	<c:if test="${p.currentPage>=p.totalpages}">
[后页]
</c:if>

	<a href="logList.action?page=${p.totalpages }">尾页</a>第<font color="red">${p.currentPage }</font>页/共
<font color="red">${p.totalpages }</font>页 转到<SELECT onchange="jump(this)">
    <c:forEach var="i" begin="1" end="${p.totalpages}">
    <option value="${i}" 
     <c:if test="${p.currentPage==i}">
        selected
     </c:if>
     
    >第${i}页</option>
    </c:forEach>
</SELECT>
输入页码:<input type="text" size="4" value="${p.currentPage}" id="jumpbox"><input type="button" value="GO"
onclick="jump(document.getElementById('jumpbox'))"
>

     </center>
     </td>
  </tr>
</table>
</form>

<div id="loadingmsg" style="width:100px; height:18px; top:0px; display:none;">
	<img src="images/loadon.gif" />
</div>
