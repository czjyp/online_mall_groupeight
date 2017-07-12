<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="js/jquery-1.11.0.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 登陆框 -->
<div class='content'>
    <div class='logo'><i style='font-size:90px;' class="iconfont icon-denglu"></i></div>
    <div class='inputBox mt50 ml32'>
        <input type="text" id="username" autofocus="autofocus" autocomplete="off" maxlength="60" placeholder="请输入账号/邮箱/手机号">
        <i style='font-size:20px;margin-left:-32px;opacity:0.8;' class='iconfont icon-yonghuming'></i>
    </div>
    <div class='inputBox mt50 ml32'>
        <input type="password" id="password" autofocus="autofocus" autocomplete="off" maxlength="60" placeholder="请输入密码">
        <i style='font-size:20px;margin-left:-32px;opacity:0.8;' class='iconfont icon-mima'></i>
    </div>
    
    <div class='mt50 ml32'>
        <button class="login_btn" onclick="login()">登陆</button>
    </div>
</div>
<script>
function login(){
    var username = document.getElementById("username").value; 
    var password = document.getElementById("password").value; 
    $.ajax({
        type:"post",//请求方式
        url:"controller/loginController.jsp",//请求地址
        data:{"username":username,"password":password},//传递给controller的json数据
        error:function(){
            alert("登陆出错！");
        },
        success:function(data){ //返回成功执行回调函数。
            
        }
    });
    
}

</script>
</body>
</html>