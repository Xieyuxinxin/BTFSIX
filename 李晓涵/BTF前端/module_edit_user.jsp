<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="/BTF/css/module.css" type="text/css">

	<style type="text/css">
		table {
			width: 1300px;
			height: 300px;
		}

		td {
			text-align: center;
		}
	</style>
</head>
<body>
	<!-- 上方导航栏 -->
	<div class="topNav">
		<div class="regAndSign">
			<div class="register"><a href="">Register</a></div>
			<div class="split">&nbsp;|&nbsp;</div>
			<div class="login"><a href="">Sign in</a></div>
			<div class="search">
				<div class="searchInfo">search or jump to...</div>
				<img src="img/search.png" />
			</div>
		</div>
	</div>
	
	<!-- 除导航栏外全部内容 -->
	<div class="allPage">
		<!-- 左侧导航栏 -->
		<div class="leftNav">
			<div class="logo"><img src="img/logo.png"/></div>
			<div class="nav"><a href="home.html">HOME</a></div>
			<div class="nav"><a href="list2">INTERFACE TEST</a></div>
			<div class="nav"><a href="list">MANAGEMENT</a></div>
			<div class="nav"><a href="theTeam.html">THE TEAM</a></div>
		</div>
		<!-- 右侧区域内容 -->
		<div class="rightPage">
			<div class="searchM">
				<!-- 批量执行按钮 -->
				<input class="submit" type="submit" value="批量执行">
			</div>
			<!-- 数据库展示 -->
			<table border="1px">
				<tr>
					<th>id</th>
					<th>name</th>
					<th>module</th>
					<th>url</th>
					<th>method</th>
					<th>headers</th>
					<th>cookies</th>
					<th>requestBodyType</th>
					<th>param</th>
					<th>form</th>
					<th>body</th>
					<th>response</th>
				</tr>
				<c:forEach items="${manageTests }" var="data">
					<tr>
						<td>${data.id }</td>
						<td>${data.name }</td>
						<td>${data.module }</td>
						<td>${data.url }</td>
						<td>${data.method }</td>
						<td>${data.headers }</td>
						<td>${data.cookies }</td>
						<td>${data.requestBodyType }</td>
						<td>${data.param }</td>
						<td>${data.form }</td>
						<td>${data.body }</td>
						<td>${data.response }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>