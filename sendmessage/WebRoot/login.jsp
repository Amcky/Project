<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>����ʦ����ѧ�ƶ�������������ϵͳ</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link href="images/login.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
		<script type="text/javascript">

 function go(){
   document.login.submit();
 }
 
 function res(){
	   document.login.reset();
 }
</script>
		<center>
			<div id="login">

				<div id="top">
					<div id="top_left">
						<img src="images/login_03.gif" />
					</div>
					<div id="top_center"></div>

				</div>

				<s:form action="checkLogin" name="login" method="post"
					theme="simple" onKeyDown="if(event.keyCode==13)this.submit()"
					target="_parent">
					<div id="center">
						<div id="center_left"></div>
						<div id="center_middle">
							<div id="user">
								�� ��
								<s:textfield name="user.usercode" maxLength="10"></s:textfield>
							</div>
							<div id="password">
								�� ��
								<s:password name="user.userpass"></s:password>
							</div>

							<div id="checkcode">
								��֤��
								<s:textfield name="input" style="width:50px"></s:textfield>
								<img id="code" border=0 src="page/image.jsp"></img>
								<a href="#"
									onclick="javascript:var dt=new Date();document.getElementById('code').src='page/image.jsp?dt='+dt;">������</a>
							</div>
							<div id="btn">
								<a href="#" onClick="javascript:go()">��¼</a><a href="#"
									onclick="javascript:res()">���</a>
							</div>

						</div>
						<div id="center_right"></div>
					</div>
				</s:form>

				<div id="down">
					<div id="down_left">
						<div id="inf">
							<span class="inf_text">�汾��Ϣ</span>
							<span class="copyright">����ʦ����ѧ�ƶ�������������ϵͳ 2012 v1.0</span>
						</div>
					</div>
					<div id="down_center">
						<br />
						<s:fielderror />
						<%
							String tip = (String) request.getSession().getAttribute("tip");

							if (tip != null) {
								if ("NoUser".equals(tip))
									out.print("�û���������");
								else if ("PWD".equals(tip))
									out.print("�������");
							}
						%>
					</div>
				</div>
			</div>
		</center>
	</body>
</html>