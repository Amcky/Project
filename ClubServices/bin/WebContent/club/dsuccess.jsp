<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, td {
	border: 1px solid black;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>社团资源</title>
</head>
<body>
   <s:iterator var="l1" value="l1">
			<tr>
				<td>当前资源共享浏览量为:<s:property value="#l1.number" /></td>
			</tr>
		</s:iterator>
	<table>
		<tr>
			<td>上传的时间</td>
			<td>上传的作者id</td>
			<td>上传的主题</td>
			<td>上传的资源类型</td>
			<td>上传的资源链接地址</td>
			<td>上传的图片</td>
		</tr>
		<s:iterator var="list" value="list">
			<tr>
				<td><s:date name="#list.udate" format="yyyy-mm-dd  hh:mm:ss"></s:date></td>
				<td><s:property value="#list.uid" /></td>
				<td><s:property value="#list.title" /></td>
				<td><s:property value="#list.type" /></td>
				<td><s:property value="#list.source" /></td>
				<td><img src="<s:property value="#list.image"/>" width="320"
					height="50"></img></td>
			</tr>
		</s:iterator>

	</table>
</body>
</html>