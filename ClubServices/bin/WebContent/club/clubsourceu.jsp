<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
<meta name="keywords" content="南阳理工学院,南阳理工学院软件学院,南阳理工学院软件学院创新基地,南阳理工学院创新基地">
<link rel="shortcut icon" type="image/x-icon" href="南阳理工学院软件学院创新基地社团服务平台/school_l.ico">
<link href="南阳理工学院软件学院创新基地社团服务平台/reset.css" rel="stylesheet" type="text/css">
<link href="南阳理工学院软件学院创新基地社团服务平台/common.css" rel="stylesheet" type="text/css">
<link href="南阳理工学院软件学院创新基地社团服务平台/page.css" rel="stylesheet" type="text/css">

<title>
	欢迎进入南阳理工学院软件学院创新基地社团服务平台
</title>
<link rel="stylesheet" href="南阳理工学院软件学院创新基地社团服务平台/layer.css" id="layui_layer_skinlayercss" style="">
<link href="南阳理工学院软件学院创新基地社团服务平台/bdsstyle.css" rel="stylesheet" type="text/css"></head>
<body>
<body>
<div class="header">
    <s></s>
    <div class="wrap">
       	<span style="font-size:30px;color:#FCC;height:90px;line-height:70px;margin-left:40px;">南阳理工学院软件学院</span>
        <div class="headerRt">
            <p class="link">
                欢迎进入软件学院创新基地社团服务平台 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                <a href="#">返回首页</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[
                <a href="#">注册</a> / 
                <a href="#">登录</a>] &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a>联系我们</a> |
                 <a href="#">人才招聘</a>
            </p>
            <div class="headerSearch">               
                <form onsubmit="return onSearch();" method="get" action="/Search.aspx">
                <input class="text" id="keyWord" name="keyWord" value="请输入搜索关键字" onfocus="if(this.value=='请输入搜索关键字') this.value='';" onblur="if(this.value=='') this.value='请输入搜索关键字';" type="text">
                <input class="submit" onclick="return check()" value="" type="submit">
                </form>        
                <script type="text/javascript">
                    function check() {
                        if ($("#keyWord").val() == "请输入搜索关键字") {
                            return false;
                        }
                        return true;
                    }
                </script>
            <script src="南阳理工学院软件学院创新基地社团服务平台/logger.js"></script></div>
        </div>
    </div>
</div>
<div class="nav">
    <s></s>
    <div class="wrap">
        <ul class="clearfix menutop">
            <li class="li_h "><a href="#">首页<i></i></a></li>
             <li class="li_h1"><a href="#">社团类别<i></i></a>
                <div class="navHover1" style="display: none;">
                    <dl>                    
                        <dd class="dl_d1">
                            <a href="#">大数据<b></b></a>
                            	 <div class="erNav1" style="display:none;">
                                    <dl>                    
                                        <dd>
                                            <a href="#">蓝天云</a></dd>
                                    	</dl>
               					 </div>
                            </dd>                    
                        <dd class="dl_d2">
                            <a href="#">Java<b></b></a>
                            	<div class="erNav2" style="display:none;">
                                    <dl>                    
                                        <dd>
                                            <a href="#">前言</a></dd>                                            
                                    </dl>
               					 </div>
                            </dd>                    
                        <dd class="dl_d3">
                            <a href="#">云计算<b></b></a>
                            <div class="erNav3" style="display:none;">
                                    <dl>                    
                                        <dd>
                                            <a href="#">###</a></dd>                                            
                                    </dl>
               				</div>
                        </dd>                          
                    </dl>
                </div>
            </li>
           <li class="li_h2"><a href="#">资料共享<i></i></a>
            	 <div class="navHover2" style="display: none;">
                    <dl>
                        <dd>
                            <a href="#">上传资料</a></dd>
                        <dd>
                            <a href="#">资料下载</a></dd>
                    </dl>
                </div>
            </li>
            <li class="li_h3"><a href="#">论坛<i></i></a>
                <div class="navHover3" style="display: none;">
                    <dl>
                        <dd>
                            <a href="#">####</a></dd>
                        <dd>
                            <a href="#">####</a></dd>
                        <dd>
                            <a href="#">####</a></dd>
                    </dl>
                </div>
            </li>
            <li class="li_h4"><a href="#">最新动态<i></i></a></li>
            <li class="li_h6"><a href="#/">关于我们<i></i></a></li>
        </ul>
    </div>
</div>
</div>
</div>

<body>
	<form action="clubsource_upLoad"  method="post"  enctype="multipart/form-data">
		<table>
			<tr>
				<td>用户uid: <input type="text" name="s.uid" /></td>
			</tr>
			<tr>
				<td>共享资源标题： <input type="text"  name="s.title" /></td>
			</tr>
			<tr>
				<td>共享资源类别： <input type="text"  name="s.type" /></td>
			</tr>
			<tr>
				<td>共享资源链接： <input type="text"  name="s.source" /></td>
			</tr>
			<tr>
				<!-- <td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
					图片：</td> -->
				<td class="ta_01" bgColor="#ffffff" colspan="3">图片：<input
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