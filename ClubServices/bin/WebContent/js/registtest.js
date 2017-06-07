/**
 * Created by Miao-pc on 2017/3/17.
 */

//检查用户名
function checknames(){
    var pass=document.getElementById("passport");
    document.getElementById("passname").innerHTML="设置后不可更改 以字母开头，4-20位字母或数字";
}

function checkname(){
    var pass=document.getElementById("passport");
    if(pass.value==''||pass.value==null){
        document.getElementById("passname").innerHTML="<font color='red'>此项为必填项</font>";
    }else if(pass.value.length<4){
        document.getElementById("passname").innerHTML="<font color='red'>登录名太短，至少4位</font>";
    }else if(pass.value.length>=4){
        var patrn=/^[a-zA-Z][a-zA-Z0-9]*$/;

        if(!patrn.exec(pass.value)){
            document.getElementById("passname").innerHTML="<font color='red'>登录名错误，以字母开头，4-20位字母或数字</font>";
        }else{
            $.ajax({
                url:'/ajax/checkname?passportid='+pass.value,
                dataType:'text',
                success:function(data){
                    var user =eval('('+data+')');
                    document.getElementById("passname").innerHTML=user.msg;
                }
            });
        }
    }
}

//检查密码
function checkpasswords(){
    document.getElementById("passwname").innerHTML="请输入6-20位英文字母、数字或符号，区分大小写";
}

function checkpasswordss(pwd){
    if(pwd==null||pwd==''){
        document.getElementById("passwname").innerHTML="";
    }else if(pwd.length<6){
        document.getElementById("passwname").innerHTML="请输入至少6位以字母开头，数字或符号";
    }else{
        document.getElementById("passwname").innerHTML="<img src='images/right.gif'>";
    }
}

//检查再次输入的密码
function checkpasswords2(){
    document.getElementById("passname2").innerHTML="请再次输入密码";
}

function checkpassword2(pwd2){
    if(pwd2==null||pwd2==''){
        document.getElementById("passname2").innerHTML="";
    }else if(pwd2.length<6){
        document.getElementById("passname2").innerHTML="<font color='red'>密码输入不一致，请重新输入</font>";
    }else{
        var pwd=document.getElementById("pwd").value;

        if(pwd!=pwd2){
            document.getElementById("passname2").innerHTML="<font color='red'>密码输入不一致，请重新输入</font>";
        }else{
            document.getElementById("passname2").innerHTML="<img src='images/right.gif'>";
        }
    }
}

//检查密保问题
function checkpasswordquestions(){
    document.getElementById("squestion").innerHTML="请设置密保问题，以便日后找回密码";
}


//检查密保答案
function checkpasswordanswers(){
    document.getElementById("passwordan").innerHTML="请设置密保答案，以便日后找回密码";
}

function checkpasswordanswer(an){
    var an=document.getElementById("passwordanswer");
    if(an.value==''||an.value==null){
        document.getElementById("passwordanswer").innerHTML="<font color='red'>此项为必填项</font>";
    }else{
        document.getElementById("passwordanswer").innerHTML="<img src='images/right.gif'>";
    }
}

//检查姓名
function checkuname(){
    document.getElementById("unames").innerHTML="请输入中文或英文";
}

function checkuser(user){
    if(user==''){
        document.getElementById("unames").innerHTML="<font color='red'>此项为必填项</font>";
    }else{
        var yd=/^[A-Za-z\u4E00-\u9fa5]*$/;

        if(!yd.exec(user)){
            document.getElementById("unames").innerHTML="请输入中文或英文";
        }else{
            document.getElementById("unames").innerHTML="<img src='images/right.gif'>";
        }
    }
}

//密码设置提示
function chkpwd(obj){

    var t=obj.value;
    var id=getResult(t);

    //定义对应的消息提示
    var msg=new Array(4);;
    msg[0]="密码过短。";
    msg[1]="密码强度差。";
    msg[2]="密码强度良好。";
    msg[3]="密码强度高。";

    var sty=new Array(4);
    sty[0]=-45;
    sty[1]=-30;;
    sty[2]=-15;
    sty[3]=0;

    var col = new Array(4);
    col[0] = "gray";
    col[1] = "#50AEDD";
    col[2] = "#FF8213";
    col[3] = "green";

    //设置显示效果
    var sWidth=300;
    var sHeight=15;
    var Bobj=document.getElementById("chkResult");
    Bobj.style.fontSize="12px";
    Bobj.style.color=col[id];
    Bobj.style.width=sWidth + "px";;
    Bobj.style.height=sHeight + "px";
    Bobj.style.lineHeight=sHeight + "px";
    /*	Bobj.style.background="url no-repeat left " + sty[id] + "px";*/
    Bobj.innerHTML="检测提示：" + msg[id];
}

//定义检测函数,返回0/1/2/3分别代表无效/差/一般/强
function getResult(s){
    if(s.length < 4){
        return 0;
    }
    var ls = 0;
    if (s.match(/[a-z]/ig)){
        ls++;
    }
    if(s.match(/[0-9]/ig)){
        ls++;
    }
    if(s.match(/(.[^a-z0-9])/ig)){
        ls++;
    }
    if(s.length < 6 && ls > 0){
        ls--;
    }
    return ls;
}

//检查
function check(){

    var name=document.getElementById("passport").value;
    var an=document.getElementById("passwordanswer").value;
    var pwd=document.getElementById("pwd").value;
    var pwd2=document.getElementById("pwd2").value;
    //var captcha=document.getElementById("captcha").value;
    var username=document.getElementById("username").value;
    var m=/^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,4}$/;
    var patrn=/^[a-zA-Z][a-zA-Z0-9]*$/;
    var user=/^[A-Za-z\u4E00-\u9fa5]*$/;

    if(name==''){
        document.getElementById("passname").innerHTML="<img src='images/wrong.gif'><font color='red'>此项为必填项</font>";
        return false;
    }else if(name.length<2){
        document.getElementById("passname").innerHTML="<img src='images/wrong.gif'><font color='red'>登录名太短了，至少4位</font>";
        return false;
    }else if(!patrn.exec(name)){
        document.getElementById("passname").innerHTML="<img src='images/wrong.gif'><font color='red'>以字母开头，4-20位字母或数字</font>";
        return false;
    } else if(an==''){
        document.getElementById("passwordan").innerHTML="<img src='images/wrong.gif'><font color='red'>此项为必填项</font>";
        return false;
    }

    else if(pwd==''){
        document.getElementById("passwname").innerHTML="<img src='images/wrong.gif'><font color='red'>此项为必填项</font>";
        return false;
    }else if(pwd.length<6){
        document.getElementById("passwname").innerHTML="<img src='images/wrong.gif'><font color='red'>请输入6-20位英文字母、数字或符号，区分大小写</font>";
        return false;
    }else if(pwd2==''){
        document.getElementById("passname2").innerHTML="<img src='images/wrong.gif'><font color='red'>此项为必填项</font>";
        return false;
    }else if(pwd2.length<6){
        document.getElementById("passname2").innerHTML="<img src='images/wrong.gif'><font color='red'>密码输入不一致，请重新输入</font>";
        return false;
    }else if(pwd!=pwd2){
        document.getElementById("passname2").innerHTML="<img src='images/wrong.gif'><font color='red'>密码输入不一致，请重新输入</font>";
        return false;
    }else if(username==''){
        document.getElementById("unames").innerHTML="<img src='images/wrong.gif'><font color='red'>此项为必填项</font>";
        return false;
    }else if(!user.exec(username)){
        document.getElementById("unames").innerHTML="<img src='images/wrong.gif'><font color='red'>请输入中文或英文</font>";
        return false;
    }
    else{
        return true;
    }

}

//个人简介字数限制
maxLen = 100;//定义用户可以输入的最多字数
function checkMaxInput(obj) {

    if (obj.value.length > maxLen){ //如果输入的字数超过了限制
        obj.value = obj.value.substring(0, maxLen); //就去掉多余的字
        remLen.innerText = '您输入的内容超出了字数限制'
    }
    else{
        remLen.innerText = (maxLen - obj.value.length) + '/100';//计算并显示剩余字数
    }
}


