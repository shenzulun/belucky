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
					<h2 class="article-title"><a href="#">${article.title}</a></h2>
					<div class="article-date">${article.createDtStr}</div>
					<div class="article-content">
						<p>${article.content}</p>
						<p><a href="#" class="more-link">read more...</a></p>
					</div>
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