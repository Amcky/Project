<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript"> 
function show(){
            var x=event.clientX;
            var y=event.clientY;
            document.getElementById("pic").style.top=y+50;
            document.getElementById("pic").style.left=x;
            document.getElementById("pic").style.visibility="visible";
            var formDiv="<form action='#'>";
            formDiv+="用户名: <input type='text' name='user' /><br>";
            formDiv+="密码:    <input type='password' name='pass' /><br><br>";     
               formDiv+="<input type='submit' value='提交' onclick='hide()' /></form>";     
            document.getElementById("pic").innerHTML=formDiv;
        }
         
        function hide(){
            document.getElementById("pic").style.visibility="hidden";
        }
</script>

<body>
<input type="button" value="登陆" onclick="show()"> 
<div id="pic" style="border: 1;position: absolute;width: 200;height: 200; background:#00FF99;visibility: hidden"></div>
</body>
</html>