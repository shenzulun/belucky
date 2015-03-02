<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>发布文章</title>
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
			<a href="${ctx}/index">返回首页</a>
			<form action="${ctx}/blog/m/add" method="post">
				<fieldset>
					<legend><input type="submit" value="发布文章" /></legend>
					<label>标题:</label><input type="text" name="title"/><br/>		
					<label>标签:</label><input type="text" name="tags"/><br/>				
				<div class="wmd-panel">
	            <div id="wmd-button-bar"></div>
	            <textarea name="content" class="wmd-input tabIndent" id="wmd-input">
	            </textarea>
		        </div>
		        <div id="wmd-preview" class="wmd-panel wmd-preview"></div>   
            		<!-- 
					<textarea name="content" class="content-show"></textarea>
					 -->
				<br />
					<input type="hidden" name="author" value="shenzl"/>
					
				</fieldset>
			</form>
		</div>
	</div>

<%@include file="../base/footer.jsp"%>
</body>
</html>