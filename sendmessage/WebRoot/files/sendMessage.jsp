<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>河南师范大学移动互联短信提醒系统</title>
<link rel="stylesheet" rev="stylesheet" href="../css/style.css" type="text/css" media="all" />


<script language="JavaScript" type="text/javascript">
function tishi()
{
  var a=confirm('数据库中保存有该人员基本信息，您可以修改或保留该信息。');
  if(a!=true)return false;
  window.open("冲突页.htm","","depended=0,alwaysRaised=1,width=800,height=400,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
}

function check()
{
document.getElementById("aa").style.display="";
}


function link(){

  //  document.getElementById("fom").action="xuqiumingxi.htm";
   document.getElementById("fom").submit();
   alert('发送短信成功！');
}


</script>
<style type="text/css">
<!--
.atten {font-size:12px;font-weight:normal;color:#F00;}
-->
</style>
</head>

<body class="ContentBody">
 
<div class="MainDiv">
<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
  <tr>
      <th class="tablestyle_title" >新建短信添加加页面</th>
  </tr>
  <tr>
    <td class="CPanel">
		
		<table border="0" cellpadding="0" cellspacing="0" style="width:100%">
		<tr><td align="left">
		</td></tr>

		<TR>
			<TD width="100%">
			
			<s:form action="saveMessage" id="fom" method="get" theme="simple" target="_parent">
			
				<fieldset style="height:100%;">
				<legend>新建短信</legend>
					  <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
					   <tr>
					    <td width="13%" align="right" nowrap>接收号码:</td>
					    <td>
					    <s:textfield name="message.jshm"></s:textfield>
					      选择接收方</td>
					    </tr>
					  <tr>
					    <td nowrap align="right" height="120px">短信内容:</td>
					    <td>
					    <s:textarea name="message.dxnr" rows="5" cols="80"></s:textarea>
					    </td>
					    </tr>
					  </table>
			 <br />
				</fieldset>		
				</s:form>
				
					</TD>
		</TR>
		
		</TABLE>
	
	
	 </td>
  </tr>
  

		
		
		
		
		<TR>
			<TD colspan="2" align="center" height="50px">
			<input type="button" name="Submit" value="保存" class="button" onClick="link();"/>　
			
			<input type="button" name="Submit2" value="返回" class="button" onClick="window.history.go(-1);"/></TD>
		</TR>
		</TABLE>
	
	
	 </td>
  </tr>
  
  
  
  
  </table>

</div>

</body>
</html>
