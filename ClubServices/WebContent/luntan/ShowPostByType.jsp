<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
		  			<a href="showAllPostsByTypes.action?currentPage=1">首页</a>
			<s:if test="#request.page.hasPrePage">
		
				<a href="showAllPostsByType?currentPage=${page.currentPage -1 }">上一页</a>
			</s:if>
			<s:else>
				首页
				上一页
			</s:else>
			
			<s:if test="#request.page.hasNextPage">
				<a href="showAllPostsByType.action?currentPage=${page.currentPage + 1 }">下一页</a>
				<a href="showAllPostsByType.action?currentPage=${page.totalPage }">尾页</a>			
			</s:if>
			<s:else>
				下一页
				尾页
			</s:else>
		<div>
		<div>
		<s:iterator value="#request.type" id="art" status="sta">
         
           <a href="showAllPostsByType?type=<s:property value='#art'/>"><s:property value='#art'/></a>
           <br>
           
		 </s:iterator>
		</div>
</body>
</html>