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
					<div class="article-date">${article.createDtStr}</div>
					<div class="article-content md-div"><pre>${article.content}</pre></div>
				</div>
			</div>
		</div>
	</div>
<%@include file="../base/footer.jsp"%>
</body>
</html>