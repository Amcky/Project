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
    
    <title>My JSP 'ShowAllPosts.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <div>    
  	<a href="ShowAllPosts.action">显示所有帖子</a>
    <a href="showuserallposts.action">显示用户的所有帖子</a>
    <a href="writePosts.action">写帖子</a>
   </div>
    <s:iterator value="#request.all" id="art" status="sta">
         
              <div> 主题：<span><a href="showposts.action?kid=<s:property value='#art.kid'/>"><s:property value="#art.theme"/></a> <small>:</small></span>
           			 发表时间：<s:property value="#art.stime"/> 
           			 发表人： <s:iterator value="#request.user" id="user">
           			 			<s:if test="#art.uid==#user[0]">
           			 				<s:property value="#user[1]"/> 
           			 			</s:if>
           			 		</s:iterator>
           			 点击率:<s:property value='#art.critique'/> 
              </div>
           
		 </s:iterator>
		  <div class="comment" align="center">
		  		当前第${page.currentPage}页，共${page.totalPage}页，每页显示${page.everyPage}条记录
		  		<a href="ShowAllPosts.action?currentPage=1">首页</a>
			<s:if test="#request.page.hasPrePage"><a href="ShowAllPosts.action?currentPage=${page.currentPage -1 }">上一页</a>
			</s:if>
			<s:else>
				首页
				上一页
			</s:else>
			
			<s:if test="#request.page.hasNextPage">
				<a href="ShowAllPosts.action?currentPage=${page.currentPage + 1 }">下一页</a>
				<a href="ShowAllPosts.action?currentPage=${page.totalPage }">尾页</a>			
			</s:if>
			<s:else>
				下一页
				尾页
			</s:else>
			
		<div>
		<s:iterator value="#request.type" id="art" status="sta">
         
           <a href="showAllPostsByType?type=<s:property value='#art'/>"><s:property value='#art'/></a>
           <br>
           
		 </s:iterator>
		</div>
  </body>
</html>