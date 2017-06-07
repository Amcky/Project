<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<base href="<%=basePath%>"></base>
    <script src="files/js/jquery.js"></script>
    <script src="files/js/demo.js"></script>
    <script src="files/js/jquery.cookie.js"></script>
    <script src="files/js/jquery.treeview.js"></script>
    <%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"></script>--%>
    <link href="css/jquery.treeview.css" type="text/css">
    <link href="css/screen.css" type="text/css">
<script>
    function onClick(e) {
        var a = $(e).find('input').val();
        $.ajax({
            type: "post",
            url: "ajax.action",//需要用来处理ajax请求的action,excuteAjax为处理的方法名，JsonAction为action名
            data: {//设置数据源
                id: a
            },
            dataType: "json",//设置需要返回的数据类型
            success: function (data) {
                var d = eval("(" + data + ")");//将数据转换成json类型，可以把data用alert()输出出来看看到底是什么样的结构
                //得到的d是一个形如{"key":"value","key1":"value1"}的数据类型，然后取值出来
                $("#user").text("")
                for (var t=0;t<d.length;t++){

                    $("#user").append("" + d[t].name + " " + d[t].age+"<br>")
                }
                $("#adduser").append('<input type="button"  onclick="adduser()" value="添加用户信息"/><br>')

            },
            error: function () {
                alert("系统异常，请稍后重试！");
            }//这里不要加","
        });
    }
    function adduser() {
        $("#adduser").append('姓名<input type="text" name="name"/><br>年龄<input type="text" name="age"/>')
    }
    window.onload = function () {

    }


</script>
</head>
  
  <body>
  <a href="files/js/demo.js">Pagecode</a>
 
  
  	<div id="main">

    <ul id="red" class="treeview-red">
        <s:iterator value="#request.zhuzhi" id="art" status="sta">
            <s:if test="#art.fid==0&&#art.grade==1">
                <li><span><s:property value="#art.name"/></span>
                    <s:iterator value="#request.zhuzhi2" id="art2" status="sta">
                        <s:if test="#art2.fid==#art.id&&#art2.grade==2">
                            <ul>
                                <li><span><s:property value="#art2.name"/></span>
                                    <s:iterator value="#request.zhuzhi3" id="art3" status="sta">
                                        <s:if test="#art3.fid==#art2.id&&#art3.grade==3">
                                            <ul>
                                                <li>
                                                    <span onclick="onClick(this)"><s:property value="#art3.name"/>
                                                        <input type="hidden" value="<s:property value="#art3.id"/>"/>
                                                    </span>
                                                </li>
                                            </ul>
                                        </s:if>
                                    </s:iterator>
                                </li>
                            </ul>
                        </s:if>
                    </s:iterator>
                </li>
            </s:if>
        </s:iterator>
    </ul>
</div>
  </body>
</html>
