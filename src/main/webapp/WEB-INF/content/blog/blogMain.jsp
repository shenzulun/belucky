<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>list</title>
	<%@include file="../base/header.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="../base/headmenu.jsp"%>	
		<div class="content">			
			<div class="page">
				<c:forEach items="${articles}" var="article">
				<div class="article">				
					<h2 class="article-title"><a href="${ctx}/blog/${article.id}">${article.title}</a></h2>
					<div class="article-date">${article.createDtStr}</div>
					<div class="article-content md-div" id="${article.id}">${article.content}</div>
				</div>
				</c:forEach>
				<div>
				<p class="pages">Page 1 of 2 &nbsp;&nbsp;&nbsp; <span>1</span> <a href="#">2</a> <a href="#">&raquo;</a></p>
				</div>
			</div>
		</div>
	</div>
	
<%@include file="../base/footer.jsp"%>
</body>
</html>