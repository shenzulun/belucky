<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>404</title>
<link rel="stylesheet" type="text/css" href="${ctx}/static/css/error.css" media="screen" />
</head>
<body>
<div id="container"><img class="png" src="${ctx}/static/images/404/404.png" /> <img class="png msg" src="static/images/404/404_msg.png" />
  <p>
  <a href="/blog"><img class="png" src="${ctx}/static/images/404/404_to_index.png" /></a> 
  </p>
</div>
<div id="cloud" class="png"></div>
<pre style="DISPLAY: none"></pre>
</body>
</html>