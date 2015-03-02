<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>${article.shortTitle}</title>
	<%@include file="../base/header.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="../base/headmenu.jsp"%>	
		<div class="content">			
			<div class="page">			
				<div class="article">				
					<h2 class="article-title"><a href="#">${article.title}</a></h2>
					<div class="article-date">${article.createDtStr} &nbsp;&nbsp;&nbsp;&nbsp;Tag:&nbsp;
					<c:forEach items="${article.tagArr}" var="tag">
						<a href="${ctx}/blog/tag/${tag}">${tag}</a>&nbsp;&nbsp;
					</c:forEach>
					</div>
					<div class="article-content">${article.showContent}</div>
				</div>
			</div>
		</div>
	</div>
<%@include file="../base/footer.jsp"%>
</body>
</html>