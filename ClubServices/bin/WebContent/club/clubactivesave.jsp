<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加活动信息</title>
</head>
<script  type="text/javascript" src="${pageContext.request.contextPath }/js/datepicker/WdatePicker.js"></script>
<body>
	<form action="clubactive_addActive" method="post"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td>活动名称:<input type="text"  name="active.aname" /></td>
			</tr>
			<tr>
				<td>活动描述:<input type="text"  name="active.des" /></td>
			</tr>
			<tr>
				<td class="tdBg" width="200px">活动时间：</td>
				<td><s:textfield name="active.time" readonly="true" onfocus="WdatePicker({'skin':'whyGreen','dateFmt':'yyyy-MM-dd HH:mm:ss'});" /></td>
			</tr>
			<tr>
				<td class="ta_01" bgColor="#ffffff" colspan="3">活动图片：<input
					type="file" name="upload" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" /></td>
				<!--   链接：http://pan.baidu.com/s/1eRUC1P4 密码：afkr -->
			</tr>
		</table>
	</form>
</body>
</html>