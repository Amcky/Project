<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
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
            发表时间：<s:property value="#art.stime"/>  点击率:<s:property value='#art.critique'/> 
            <a href="deleteposts.action?id=<s:property value='#art.kid'/>">删除</a>
              </div>
           	
		 </s:iterator>
		  <div class="comment" align="center">
		  	当前第${page.currentPage}页，共${page.totalPage}页，每页显示${page.everyPage}条记录
		  			<a href="showuserallposts.action?currentPage=1">首页</a>
			<s:if test="#request.page.hasPrePage">
		
				<a href="showuserallposts.action?currentPage=${page.currentPage -1 }">上一页</a>
			</s:if>
			<s:else>
				首页
				上一页
			</s:else>
			
			<s:if test="#request.page.hasNextPage">
				<a href="showuserallposts.action?currentPage=${page.currentPage + 1 }">下一页</a>
				<a href="showuserallposts.action?currentPage=${page.totalPage }">尾页</a>			
			</s:if>
			<s:else>
				下一页
				尾页
			</s:else>
</body>
</html>