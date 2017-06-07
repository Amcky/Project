<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="javascript" type="text/javascript">
window.onload=function(){
			var url=document.getElementById('url').value;
           window.location.href=url;
           var reply=document.getElementById('reply').value;
           if(reply!=null)
        	   alert(reply);
        	   	
}
</script>
</head>
<body>
<input id="url" type="hidden" value="<s:property value='#request.url'/>"/>
<input id="reply" type="hidden" value="<s:property value='#request.reply'/>"/>
</body>
</html>