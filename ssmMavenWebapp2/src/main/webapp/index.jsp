<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	hello,welcome to learn integration SSM。<br>
  	<form action="user/add" method="post">
  		id:<input type="text" name="id"><br>
  		name:<input type="text" name="name"><br>
  		age:<input type="text" name="age"><br>
  		<input type="submit" value="添加用户"><br>
  	</form>
  	<br>
  	<form action="user/update" method="post">
  		id:<input type="text" name="id"><br>
  		name:<input type="text" name="name"><br>
  		age:<input type="text" name="age"><br>
  		<input type="submit" value="更新用户"><br>
  	</form>
  	<br>
  	<form action="user/delete" method="post">
  		id:<input type="text" name="id"><br>
  		<input type="submit" value="删除用户"><br>
  	</form>
  	<br>
  	<form action="user/get" method="get">
  		id:<input type="text" name="id"><br>
  		<input type="submit" value="获取用户"><br>
  	</form>
  	<br>
  </body>
</html>
