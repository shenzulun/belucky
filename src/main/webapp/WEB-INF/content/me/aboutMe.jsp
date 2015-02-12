<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>about me</title>
	<%@include file="../base/header.jsp"%>
</head>
<body>
	<div class="container">
		<div class="header">
			<div class="nav">
	      		<ul class="navlist">
	            <li><a href="${ctx}/blog">新生</a></li>
	            <li><a href="#">留存</a></li>
	            <li><a href="#">分类</a></li>
				<li class="active"><a href="${ctx}/about">关于我</a></li>			
	      		</ul>
	  		</div>
		</div>
		<div class="content">${content}</div>
	</div>
<%@include file="../base/footer.jsp"%>
</body>
</html>