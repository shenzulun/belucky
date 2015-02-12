<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>更新文章</title>
	<%@include file="../base/header.jsp"%>
	<%@include file="../base/pagedown_depend.jsp"%>
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
					<legend><input type="submit" value="更新文章" /></legend>
					<label>标题:</label><input type="text" name="title" value="${article.title}"/><br/>			
				<div class="wmd-panel">
	            <div id="wmd-button-bar"></div>
	            <textarea name="content" class="wmd-input tabIndent" id="wmd-input">${article.content}
	            </textarea>            
		        </div>
		        <div id="wmd-preview" class="wmd-panel wmd-preview"></div>             		
				<br />
					<input type="hidden" name="author" value="${article.author}"/>					
				</fieldset>
			</form>
		</div>
	</div>
<%@include file="../base/footer.jsp"%>
</body>
</html>