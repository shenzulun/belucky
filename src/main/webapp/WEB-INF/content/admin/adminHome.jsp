<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>func list</title>
	<%@include file="../base/header.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="../base/headmenu.jsp"%>	
		<div class="content">
			<c:if test="${not empty message}">
				<div>${message}</div>
			</c:if>
			<a href="${ctx}/index">返回首页</a>
			<div class="page">
				<div class="module-show">
					<a href="${ctx}/blog/add">发布文章</a>
				</div>				
			</div>
		</div>
	</div>
	
<%@include file="../base/footer.jsp"%>
</body>
</html>