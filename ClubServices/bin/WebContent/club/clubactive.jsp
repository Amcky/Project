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
<title>社团活动</title>
</head>
<body>
	<table>
		<tr>
			<td>活动名称</td>
			<td>活动描述</td>
			<td>活动时间</td>
			<td>活动图片</td>
			<td>修改活动信息</td>
			<td>删除活动信息</td>
		</tr>
		<s:iterator var="list" value="list">
			<tr>

				<td><s:property value="#list.aname" /></td>
				<td><s:property value="#list.des" /></td>
				<td><s:date name="#list.time" format="yyyy-mm-dd  hh:mm:ss"></s:date></td>
				<td><img src="<s:property value="#list.image"/>" width="320"
					height="50"></img></td>
					<td><a href="clubactiveupdate.jsp">修改</a></td>
					<td><a href="clubactivedelete.jsp">删除</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>