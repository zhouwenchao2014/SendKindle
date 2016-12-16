<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
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
	<script type="text/javascript" src="js/send.js"></script>
	<script type="text/javascript" src="js/amazeui.js"></script>
	<title>大盘</title>
</head>
<body>
 
 <form class="am-form-inline" role="form">
  <div class="am-form-group">
    <input id="kindleEmail" type="email" class="am-form-field" placeholder="kindle邮箱">
  </div>

  <div class="am-form-group">
    <input id="bookName" type="text" class="am-form-field" placeholder="书籍">
  </div>

     <div class="am-form-group am-form-file">
         <button type="button" class="am-btn am-btn-danger am-btn-sm">
             <i class="am-icon-cloud-upload"></i> 选择要上传的文件</button>
         <input id="doc-form-file" type="file" multiple>
     </div>
     <div id="file-list"></div>


  <button type="submit" class="am-btn am-btn-default">发送</button>
</form>



</body>
</html>
