<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="favicon.ico">
<link rel="stylesheet" type="text/css" href="css/main.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script src="js/main.js"></script>

    <title>S-Hand</title>

    <!-- Bootstrap core CSS -->
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="navbar-static-top.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
 <body>
    <!-- Static navbar -->
    <nav class="navbar navbar-default navbar-static-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">S-Hand</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li><a href="#">首页</a></li>
            <li><a href="#">我的订单</a></li>
            <li><a href="#">我的收藏</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li class="main_nav"><a href="#0">未登录，请登录或注册</a></li>
            <li><a href="#">注销</a></li>
          </ul>
           <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="Search...">
          </form>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="cd-user-modal"> 
    <div class="cd-user-modal-container">
      <ul class="cd-switcher">
        <li><a href="#0">登录</a></li>
        <li><a href="#0">注册新用户</a></li>
      </ul>

      <div id="cd-login"> <!-- 登录表单 -->
        <form class="cd-form" action="login">
          <p class="fieldset">
            <label class="image-replace cd-username" for="signin-username">用户名</label>
            <input class="full-width has-padding has-border" id="signin-username" type="text" placeholder="输入用户名">
          </p>

          <p class="fieldset">
            <label class="image-replace cd-password" for="signin-password">密码</label>
            <input class="full-width has-padding has-border" id="signin-password" type="text"  placeholder="输入密码">
          </p>
          
          <p class="fieldset">
            <label>验证码:</label>
             <input type = "text" class="loginform_input_validationCode" name = "validationCode" placeholder="输入验证码">
             <img class = "validationCode_img" src="/validationCode">
          </p>

          <p class="fieldset">
            <input type="checkbox" id="remember-me" checked>
            <label for="remember-me">记住登录状态</label>
            <input type="checkbox" id="remember-me" checked>
            <label for="remember-me">是否管理员</label>
          </p>


          <p class="fieldset">
            <input class="full-width2" type="submit" value="登 录">
          </p>
        </form>
      </div>

      <div id="cd-signup"> <!-- 注册表单 -->
        <form class="cd-form">
          <p class="fieldset">
            <label class="image-replace cd-username" for="signup-username">用户名</label>
            <input class="full-width has-padding has-border" id="signup-username" type="text" placeholder="输入用户名">
          </p>

          <p class="fieldset">
            <label class="image-replace cd-email" for="signup-email">邮箱</label>
            <input class="full-width has-padding has-border" id="signup-email" type="email" placeholder="输入mail">
          </p>

          <p class="fieldset">
            <label class="image-replace cd-password" for="signup-password">密码</label>
            <input class="full-width has-padding has-border" id="signup-password" type="text"  placeholder="输入密码">
          </p>

          <p class="fieldset">
            <input type="checkbox" id="accept-terms">
            <label for="accept-terms">我已阅读并同意 <a href="#0">用户协议</a></label>
          </p>

          <p class="fieldset">
            <input class="full-width2" type="submit" value="注册新用户">
          </p>
        </form>
      </div>

      <a href="#0" class="cd-close-form">关闭</a>
    </div>
  </div>


   <div class="container-fluid">
      <div class="row">
        <div class="col-sm-12 col-sm-offset-0 col-md-12 col-md-offset-0 main">
          <h1 class="page-header">商品展示</h1>

          <div class="row placeholders">
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>Label</h4>
              <span class="text-muted">Something else</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>Label</h4>
              <span class="text-muted">Something else</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>Label</h4>
              <span class="text-muted">Something else</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>Label</h4>
              <span class="text-muted">Something else</span>
            </div>
          </div>
        </div>
      </div>
    </div>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>