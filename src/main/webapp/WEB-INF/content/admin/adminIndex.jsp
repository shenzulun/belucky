<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>list</title>
<%@include file="../base/header.jsp"%>
</head>
<body>
	<div class="container">
		<div class="header">&nbsp;</div>	
		<div class="content">
			<form action="${ctx}/admin" method="post">
				<fieldset>
					<input type="text" name="userNo"/>
					<input type="password" name="password"/>
					<input type="submit" value="登录" />
					<input type="hidden" name="method" value="logon"/>
				</fieldset>
			</form>
		</div>
	</div>

	<div class="footer">
    	<p>Copyright &copy; belucky.me. All rights reserved. </p>         
	</div>
</body>
</html>