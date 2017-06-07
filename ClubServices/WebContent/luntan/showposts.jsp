<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 	 <META HTTP-EQUIV="pragma" CONTENT="no-cache"> 
	<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache, must-revalidate"> 
	<META HTTP-EQUIV="expires" CONTENT="Wed, 26 Feb 1997 08:21:57 GMT">
    <base href="<%=basePath%>">
    
    <title>My JSP 'showposts.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script language="javascript"> 
var isCommitted = false;//表单是否已经提交标识，默认为false
function dosubmit(){
    if(isCommitted==false){
        isCommitted = true;//提交表单后，将表单是否已经提交标识设置为true
        return true;//返回true让表单正常提交
    }else{
        return false;//返回false那么表单将不提交
    }
}
</script> 

<script type="text/javascript"> 
uniqid = '';
function show(obj){
            var x=event.clientX;
            var y=event.clientY;
            document.getElementById("pic").style.top=y+50;
            document.getElementById("pic").style.left=x;
            document.getElementById("pic").style.visibility="visible";
            
           //	var uid = obj.parentNode.getElementsByClassName('uid')[0].innerText;
            var pid = obj.parentNode.getElementsByClassName('pid')[0].value; 
            var kid = obj.parentNode.getElementsByClassName('kid')[0].value; 
         	 var hid = obj.parentNode.getElementsByClassName('hid')[0].value; 
         	 var uid = obj.parentNode.getElementsByClassName('uid')[0].value; 
            var formDiv="<form action='reply.action' method='get'>";
            formDiv+="回复内容: <input type='text' name='panswer' /><br>";
           // formDiv+="<input type='hidden' name='uid' value='"+uid+"'>";
            formDiv+="<input type='hidden' name='pid' value='"+pid+"'>";
            formDiv+="<input type='hidden' name='hid' value='"+hid+"'>";
            formDiv+="<input type='hidden' name='kid' value='"+kid+"'>";
            formDiv+="<input type='hidden' name='uid' value='"+uid+"'>";
            formDiv+="<input type='submit' value='提交' onclick='hide()' /></form>";     
            document.getElementById("pic").innerHTML=formDiv;
        }
         
        function hide(){
            document.getElementById("pic").style.visibility="hidden";
        }
</script>
  </head>
  
  <body>
   <div>    
  	<a href="ShowAllPosts.action">显示所有帖子</a>
    <a href="showuserallposts.action">显示用户的所有帖子</a>
     <a href="writePosts.action">写帖子</a>
   </div>
   主题： <s:property value="#request.posts.theme"/>
    正文：<s:property value="#request.posts.text"/><br>
    <form action="addcomment" method="get" onsubmit="return dosubmit()">
    	输入评论 <input type="text" name="comment" />
    	<input type="hidden" name="kid" value="<s:property value='#request.posts.kid'/>"/>
    	<input type="submit" value="提交">
    </form>
    	评论：<br><s:iterator value="#request.comment" id="com" status="sta">
  	  	<div class="comment">
    	评论内容：<s:property value='#com.panswer'/>&nbsp; &nbsp; &nbsp;&nbsp;
    	User:<input type="hidden" class="uid" value="<s:property value='#com.uid'/>"/>
    	<s:iterator value="#request.user" id="user">
           		<s:if test="#com.uid==#user[0]">
           			 <s:property value="#user[1]"/> 
           		</s:if>
         </s:iterator>
    	<input class="pid" type="hidden"  value="<s:property value='#com.pid'/>"/>
    	<input class="kid" type="hidden"  value="<s:property value='#com.kid'/>"/>
    	<input class="hid" type="hidden"  value="0"/>
    	<input type="button" onclick="show(this)" value="回复"/>
    	<div id="pic" style="border: 1;position: absolute;width: 200;height: 200; background:#00FF99;visibility: hidden"></div><br>
    	</div>
    	
    	<s:iterator value="#request.two" id="two" status="sta">
    	<s:if test="#two.hid==#com.pid">
    		<div class="comment">
    		回复内容：<s:property value='#two.panswer'/>  
    		User:<s:iterator value="#request.user" id="user">
           			 			<s:if test="#two.uid==#user[0]">
           			 				<s:property value="#user[1]"/> 
           			 			</s:if>
           		</s:iterator>
			<input type="button" onclick="show(this)" value="回复"/>
			<input class="hid" type="hidden"  value="<s:property value='#two.hid'/>"/>
			<input class="pid" type="hidden"  value="<s:property value='#two.pid'/>"/>
    		<input class="kid" type="hidden"  value="<s:property value='#two.kid'/>"/>
    		<%-- <input class="uid" type="hidden"  value="<s:property value='#two.uid'/>"/> --%><br>
    		</div>
    	</s:if>
    	</s:iterator>
    </s:iterator>
  </body>
</html>
