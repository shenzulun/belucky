<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>陋室</title>
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
					<div class="article-content md-div" id="${article.id}"><pre>${article.content}</pre></div>
				</div>
				</c:forEach>
				<div>
				<p class="pages">Page ${page.currentPage} of ${page.totalPage} &nbsp;&nbsp;&nbsp; 
				<c:if test="${page.currentPage > 1}">
					<a href="${ctx}/blog/p/${page.currentPage - 1}">${page.currentPage - 1}</a>
				</c:if>
				<span>${page.currentPage}</span> 
				<c:if test="${page.totalPage > 1 && page.totalPage != page.currentPage}">
					<a href="${ctx}/blog/p/${page.currentPage + 1}">${page.currentPage + 1}</a>
				</c:if> 
				<a href="${ctx}/blog/p/${page.totalPage}">&raquo;</a></p>
				</div>
			</div>
		</div>
	</div>
	
<%@include file="../base/footer.jsp"%>
</body>
</html>