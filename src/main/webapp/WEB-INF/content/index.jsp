<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<meta content="text/html; charset=UTF-8" />
	<title>陋室</title>	
	<link rel="stylesheet" type="text/css" href="static/css/indexstyle.css" />
</head>
<body>	
	<div class="container">
		<div class="header">&nbsp;</div>	
		<div class="content">
			<div class="module-show">
				<a href="${ctx}/blog">博客</a>
			</div>
			<br />
			<div class="module-show">
				<a href="${ctx}/admin">管理台</a>
			</div>
		</div>
	</div>
	<div class="footer">
    	<p>Copyright &copy; belucky.me. All rights reserved. </p>         
	</div>
</body>
</html>