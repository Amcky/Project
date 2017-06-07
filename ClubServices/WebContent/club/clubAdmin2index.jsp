<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, td {
	border: 1px solid black;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>社团名称</td>
			<td>社团创建时间</td>
			<td>社团专攻方向</td>
			<td>社团成员人数</td>
			<td>社团地点</td>
			<td>社团老师</td>
			<td>社团图片</td>
			<td>社团介绍</td>
			<td>修改社团信息</td>
			<td>删除此社团</td>
		</tr>
		<s:iterator var="list" value="list">
			<tr>
				<td><s:property value="#list.cname" /></td>
				<td><s:date name="#list.buildtime"
						format="yyyy-mm-dd  hh:mm:ss"></s:date></td>
				<td><s:property value="#list.subject" /></td>
				<td><s:property value="#list.members" /></td>
				<td><s:property value="#list.place" /></td>
				<td><s:property value="#list.tname" /></td>
				<td><img src="<s:property value="#list.image"/>" width="320"
					height="50"></img></td>
				<td><s:property value="#list.introduce" /></td>
				<td><a href="clubadmin2update.jsp">修改</a></td>
				<td><a href="clubadmin2delete.jsp">删除</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>