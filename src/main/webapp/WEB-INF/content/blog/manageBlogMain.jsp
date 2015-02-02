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
			<c:if test="${not empty message}">
				<div>${message}</div>
			</c:if>
			<div class="page">
				<table>
				<thead>
					<tr>
					<td>标题</td>
					<td>作者</td>
					<td>发布时间</td>
					<td>动作</td>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${articles}" var="article">
				<tr>
					<td>				
						<a href="${ctx}/blog/${article.id}">${article.title}</a>
					</td>
					<td>${article.author}</td>
					<td>${article.createDtStr}</td>
					<td>
						<a href="${ctx}/blog/m/${article.id}/update">修改</a>
						<a href="${ctx}/blog/m/${article.id}/delete">删除</a>
					</td>
				</tr>
				</c:forEach>
				</tbody>
				</table>
				<div>
				<p class="pages">Page 1 of 2 &nbsp;&nbsp;&nbsp; <span>1</span> <a href="#">2</a> <a href="#">&raquo;</a></p>
				</div>
			</div>
		</div>
	</div>
	
<%@include file="../base/footer.jsp"%>
</body>
</html>