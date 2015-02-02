<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>update blog</title>
	<%@include file="../base/header.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="../base/headmenu.jsp"%>	
		<div class="content">
			<c:if test="${not empty message}">
				<div>${message}</div>
			</c:if>
			<a href="${ctx}/blog/m">返回上页</a>
			<form action="${ctx}/blog/m/${id}/update" method="post">
				<fieldset>
					<legend>修改文章</legend>
					<label>标题:</label><input type="text" name="title" value="${article.title}"/><br/>
					<label>内容:</label>
					<textarea name="content" class="content-show">${article.content}</textarea>
					<input type="hidden" name="author" value="${article.author}"/>
					<input type="submit" value="保存" />
				</fieldset>
			</form>
		</div>
	</div>
	
<%@include file="../base/footer.jsp"%>
</body>
</html>