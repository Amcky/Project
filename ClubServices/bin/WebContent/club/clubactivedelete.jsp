<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除社团信息</title>
</head>
<body>
	<form action="clubactive_deleteActive" method="post"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td>输入当前活动的aid:<input type="text"  name="active.aid" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>
</html>