<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
          <link href="js/jquery-editable-select.css"  type="text/css"/>
<script type="text/javascript" src="js/jquery-editable-select.js"></script>
<script type="text/javascript" src="js/Jquery.js"></script>
<script>
var Select = {
del : function(obj,e){
if((e.keyCode||e.which||e.charCode) == 8){
var opt = obj.options[0];
opt.text = opt.value = opt.value.substring(0, opt.value.length>0?opt.value.length-1:0);
}
},
write : function(obj,e){
if((e.keyCode||e.which||e.charCode) == 8)return ;
var opt = obj.options[0];
opt.selected = "type";
opt.text = opt.value += String.fromCharCode(e.charCode||e.which||e.keyCode);
}
}
</script>  
  </head>
  
  <body>
    <form action="addposts.action" method="get">
    	主题：<input name="theme"  type="text"/>
    	正文：<input name="text"  type="text" /><br>
    	类型：<select name="type" onkeydown="Select.del(this,event)" onkeypress="Select.write(this,event)">
		<option value=""></option>
		<s:iterator value="#request.type" id="art" status="sta">
				<option value="<s:property value='#art'/>"><s:property value='#art'/></option>    
		</s:iterator>
		</select>
    	<br><input type="submit" value="提交">
    </form>
    <a href="ShowAllPosts.action">显示所有帖子</a>
    <a href="showuserallposts.action">显示用户的所有帖子</a>
  </body>
</html>
