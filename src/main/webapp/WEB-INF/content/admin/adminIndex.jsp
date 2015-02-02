<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>后台登录</title>
<%@include file="../base/header.jsp"%>
</head>
<body>
	<div class="container">
		<div class="header">&nbsp;</div>	
		<div class="content">
			<form action="${ctx}/admin/login" method="post">
				<fieldset>
					<input type="text" name="userNo"/>
					<input type="password" name="password"/>
					<input type="submit" value="登录" />
					<c:if test="${not empty message}">
						<div>${message}</div>
					</c:if>
				</fieldset>
			</form>
		</div>
	</div>

	<div class="footer">
    	<p>Copyright &copy; belucky.me. All rights reserved. </p>         
	</div>
</body>
</html>