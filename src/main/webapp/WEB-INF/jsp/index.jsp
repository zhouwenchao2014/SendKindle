<%--
  Created by IntelliJ IDEA.
  User: zhouwenchao
  Date: 16/2/18
  Time: 上午10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport"
          content="width=device-width, initial-scale=1">

    <!-- Set render engine for 360 browser -->
    <meta name="renderer" content="webkit">

    <!-- No Baidu Siteapp-->
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

    <link rel="icon" type="image/png" href="i/favicon.png">

    <!-- Add to homescreen for Chrome on Android -->
    <meta name="mobile-web-app-capable" content="yes">
    <link rel="icon" sizes="192x192" href="i/app-icon72x72@2x.png">

    <script type="text/javascript" src="js/jquery.js"></script>
    <!-- Add to homescreen for Safari on iOS -->
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
    <link rel="apple-touch-icon-precomposed" href="i/app-icon72x72@2x.png">

    <!-- Tile icon for Win8 (144x144 + tile color) -->
    <meta name="msapplication-TileImage" content="i/app-icon72x72@2x.png">
    <meta name="msapplication-TileColor" content="#0e90d2">

    <!-- SEO: If your mobile URL is different from the desktop URL, add a canonical link to the desktop page https://developers.google.com/webmasters/smartphone-sites/feature-phones -->
    <!--
    <link rel="canonical" href="http://www.example.com/">
    -->

    <link rel="stylesheet" href="css/amazeui.min.css">
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/app.css">
    <script type="text/javascript" src="js/index.js"></script>
    <script type="text/javascript" src="js/amazeui.js"></script>
    <%--<script type="text/javascript" src="<%=basePath %>js/jquery.js"></script>--%>
    <%--<script type="text/javascript" src="<%=basePath %>js/home.js"></script>--%>
    <title>Home</title>
</head>
<body>
<form class="am-form am-form-horizontal">
    <div class="am-form-group">
        <label for="doc-ipt-3" class="am-u-sm-2 am-form-label ">账号</label>
        <div class="am-u-sm-10">
            <input type="email" id="doc-ipt-3" class="am-round am-form-success am-form-field" placeholder="输入您的账号">
        </div>
    </div>

    <div class="am-form-group">
        <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">密码</label>
        <div class="am-u-sm-10">
            <input type="password" id="doc-ipt-pwd-2" class="am-round am-form-success am-form-field" placeholder="输入您的密码">
        </div>
    </div>

    <div class="am-form-group">
        <div class="am-u-sm-offset-2 am-u-sm-10">
            <div class="checkbox">
                <label>
                    <input type="checkbox"> 记住密码
                </label>
            </div>
        </div>
    </div>

    <div class="am-form-group">
        <div class="am-u-sm-10 am-u-sm-offset-2">
            <button type="submit" class="am-btn am-btn-default">提交登入</button>
        </div>
    </div>
</form>
</body>
</html>

