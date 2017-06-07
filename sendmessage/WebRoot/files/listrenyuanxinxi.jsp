<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<base href="<%=basePath%>"></base>
<script src="files/js/jquery.js"></script>
<script src="files/js/demo.js"></script>
<script src="files/js/jquery.cookie.js"></script>
<script src="files/js/jquery.treeview.js"></script>

<link href="files/css/jquery.treeview.css" type=" text/css">
<link href="files/css/screen.css" type="text/css">
<link href="css/css.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<!--<script type="text/javascript" src="../js/xiangmu.js"></script>
 <SCRIPT type="text/javascript">
    function jump(input)
    {
      if(input.value==${p.currentPage})
      { 
      return;
      }
      var url="toPageList.action?page="+input.value;
      document.location=url;
    } 
</SCRIPT>

<SCRIPT language=JavaScript>
	function sousuo() {
		window.open("gaojisousuo.htm", "", "depended=0,alwaysRaised=1,width=800,height=510,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
	}
	function selectAll() {
		var obj = document.fom.elements;
		for (var i = 0; i < obj.length; i++) {
			if (obj[i].name == "delid") {
				obj[i].checked = true;
			}
		}
	}

	function unselectAll() {
		var obj = document.fom.elements;
		for (var i = 0; i < obj.length; i++) {
			if (obj[i].name == "delid") {
				if (obj[i].checked == true)
					obj[i].checked = false;
				else
					obj[i].checked = true;
			}
		}
	}

	function link() {
		document.getElementById("fom").action = "sendxiaoxi.htm";
		document.getElementById("fom").submit();
	}

	function on_load() {
		var loadingmsg = document.getElementById("loadingmsg");
		var mainpage = document.getElementById("mainpage");
		loadingmsg.style.display = "";
		mainpage.style.display = "none";

		loadingmsg.style.display = "none";
		mainpage.style.display = "";
	}
</SCRIPT> -->

<script>
	function onClick(e) {
		var a = $(e).find('input').val();
		//此操作获取父级页面的元素
		$("#mainFrame",window.parent.document).attr('src','ajax.action?id='+a+'');
  	/* 	$.ajax({
            type: "post",
            url: "../ajax.action",//需要用来处理ajax请求的action,excuteAjax为处理的方法名，JsonAction为action名
            data: {//设置数据源
                id: a
            },
            dataType: "json",//设置需要返回的数据类型
            success: function (data) {
                var list = eval("(" + data + ")");//将数据转换成json类型，可以把data用alert()输出出来看看到底是什么样的结构
                //得到的d是一个形如{"key":"value","key1":"value1"}的数据类型，然后取值出来
               $("#xinxi").text("");
				for (var t = 0; t < list.length; t++) {
					var html = '<tr align="center"><td bgcolor="#FFFFFF"><input type="checkbox" name="delid" /></td> <td height="20" bgcolor="#FFFFFF"><s:property value="#list.dxnr" /></td> <td bgcolor="#FFFFFF"><s:property value="list[t].name" /></td> <td bgcolor="#FFFFFF"><s:property value="list[t].tel" /></td> <td bgcolor="#FFFFFF"><s:property value="#list.fssj" /></td> <td bgcolor="#FFFFFF"><s:property value="#list.fee" />元</td> <td bgcolor="#FFFFFF"><s:property value="#list.sp" /></td> <td bgcolor="#FFFFFF"><s:property value="#list.status" /></td> <td bgcolor="#FFFFFF"><s:property value="#list.partner.corpid" /></td> <td bgcolor="#FFFFFF"><a href="deletemessage?id=<s:property value="#list.id"/>">删除|</a><a href="showxiaoximingxi?id=<s:property value="#list.id"/>">查看</a></td> </tr>'
					$("#xinxi").append(html);
				}
            },
            error: function () {
                alert("系统异常，请稍后重试！");
            }//这里不要加","
        });  */
	
	}
	function adduser() {
		$("#adduser").append('姓名<input type="text" name="name"/><br>年龄<input type="text" name="age"/>')
	}
	window.onload = function() {}
</script>
</head>

<body>

	<form name="fom" id="fom" method="post" action="">

		<div>
			<a href="demo.js">Pagecode</a>



			<div id="main">

				<ul id="red" class="treeview-red">
					<s:iterator value="#request.zhuzhi" id="art" status="sta">
						<s:if test="#art.fid==0&&#art.grade==1">
							<li><span><s:property value="#art.name" /></span> <s:iterator
									value="#request.zhuzhi2" id="art2" status="sta">
									<s:if test="#art2.fid==#art.id&&#art2.grade==2">
										<ul>
											<li><span><s:property value="#art2.name" /></span> <s:iterator
													value="#request.zhuzhi3" id="art3" status="sta">
													<s:if test="#art3.fid==#art2.id&&#art3.grade==3">
														<ul>
															<li><span onclick="onClick(this)"><s:property
																		value="#art3.name" /> <input type="hidden"
																	value="<s:property value="#art3.id"/>" /> </span></li>
														</ul>
													</s:if>
												</s:iterator></li>
										</ul>
									</s:if>
								</s:iterator></li>
						</s:if>
					</s:iterator>
				</ul>
			</div>
		</div>

		<table id="mainpage" width="100%" border="0" cellspacing="0"
			cellpadding="0">


			<tr>
				<td><table id="subtree1" style="DISPLAY: " width="100%"
						border="0" cellspacing="0" cellpadding="0">

						<tr>
							<td><table width="95%" border="0" align="center"
									cellpadding="0" cellspacing="0">

									<%-- <tr>
               <td height="20"><span class="newfont07">选择：<a href="#" class="right-font08" onclick="selectAll();">全选</a>-<a href="#" class="right-font08" onclick="unselectAll();">反选</a></span>
	              <input name="Submit" type="button" class="right-button08" value="删除所选信息" />
	              <input name="Submit2" type="button" class="right-button08" value="新建信息" onclick="link();"/></td>
          	 </tr> --%>
									<tr>
										<td height="40" class="font42"><table width="100%"
												border="0" cellpadding="4" cellspacing="1" bgcolor="#464646"
												class="newfont03">

												<tr>
													<td height="20" colspan="10" align="center"
														bgcolor="#EEEEEE" class="tablestyle_title"><div
															align="center">已发短信列表&nbsp;</div></td>
												</tr>
												<tr>
													<td width="4%" align="center" bgcolor="#EEEEEE">选择</td>
													<td width="15%" height="20" align="center"
														bgcolor="#EEEEEE">id</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">姓名</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">手机号码</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">发送时间</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">费用</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">服务商</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">发送状态</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">归属集团ID</td>

													<td width="12%" align="center" bgcolor="#EEEEEE">操作</td>
												</tr>
												<s:iterator value="#request.user" id="list">
													<div id="xinxi">
													<tr align="center">
														<td bgcolor="#FFFFFF"><input type="checkbox"
															name="delid" /></td>
														<td height="20" bgcolor="#FFFFFF"><s:property
																value="#list.dxnr" /></td>
														<td bgcolor="#FFFFFF"><s:property value="#list.name" /></td>
														<td bgcolor="#FFFFFF"><s:property value="#list.tel" /></td>
														<td bgcolor="#FFFFFF"><s:property value="#list.fssj" /></td>
														<td bgcolor="#FFFFFF"><s:property value="#list.fee" />元</td>
														<td bgcolor="#FFFFFF"><s:property value="#list.sp" /></td>
														<td bgcolor="#FFFFFF"><s:property
																value="#list.status" /></td>
														<td bgcolor="#FFFFFF"><s:property
																value="#list.partner.corpid" /></td>
														<td bgcolor="#FFFFFF"><a
															href="deletemessage?id=<s:property value="#list.id"/>">删除|</a><a
															href="showxiaoximingxi?id=<s:property value="#list.id"/>">查看</a></td>
													</tr>
													</div>
												</s:iterator>

											</table></td>
									</tr>
								</table></td>
						</tr>
					</table>
					<center>
						<a href="toPageList.action?page=1">首页</a>
						<c:if test="${p.currentPage>1}">
							<a href="toPageList.action?page=${p.currentPage-1}"> [前页]</a>
						</c:if>

						<c:if test="${p.currentPage<=1}">
[前页]
</c:if>

						<c:if test="${p.currentPage<p.totalpages}">
							<a href="toPageList.action?page=${p.currentPage+1}"> [后页]</a>
						</c:if>

						<c:if test="${p.currentPage>=p.totalpages}">
[后页]
</c:if>

						<a href="toPageList.action?page=${p.totalpages }">尾页</a>第<font
							color="red">${p.currentPage }</font>页/共 <font color="red">${p.totalpages }</font>页
						转到<SELECT onchange="jump(this)">
							<c:forEach var="i" begin="1" end="${p.totalpages}">
								<option value="${i}"
									<c:if test="${p.currentPage==i}">
        selected
     </c:if>>第${i}页</option>
							</c:forEach>
						</SELECT> 输入页码:<input type="text" size="4" value="${p.currentPage}"
							id="jumpbox"><input type="button" value="GO"
							onclick="jump(document.getElementById('jumpbox'))">

					</center></td>
			</tr>
		</table>
	</form>


</body>
</html>
