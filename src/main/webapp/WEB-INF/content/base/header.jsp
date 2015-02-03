<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link rel="stylesheet" type="text/css" href="${ctx}/static/css/basestyle.css" />
<script type="text/javascript" src="${ctx}/static/js/common.js"></script>
<script type="text/javascript" src="${ctx}/static/js/jquery-2.1.1.min.js"></script>
<!-- pagedown start -->
<link rel="stylesheet" type="text/css" href="${ctx}/static/css/md/mdstyle.css" />
<script type="text/javascript" src="${ctx}/static/js/md/Markdown.Converter.js"></script>
<script type="text/javascript" src="${ctx}/static/js/md/Markdown.Sanitizer.js"></script>
<script type="text/javascript" src="${ctx}/static/js/md/Markdown.Editor.js"></script>
<script>
$(document).ready(function(){
	$(".md-div").each(function(){
		var mdVal =  $(this).text();
		var _id = $(this).attr('id');   //id不为空，则判断是否要截断文章
		if(_id != null && mdVal.length > CommonConst.ARTICLE_READ_MORE){			
		//add read-more flag
		mdVal = mdVal.substring(0,CommonConst.ARTICLE_READ_MORE) + "...";
		mdVal += "<p><a href=\"${ctx}/blog/"+_id+"\" class=\"more-link\">read more...</a></p>";
		}
		var converter = new Markdown.Converter();
        var htmlVal = converter.makeHtml(mdVal);	     
        $(this).empty();
        $(this).append(htmlVal);    
	});
	
    $(window).scroll(function() {
        if ($(window).scrollTop() > 0)
            $('div.go-top').show();
        else
            $('div.go-top').hide();
    });
    $('div.go-top').click(function() {
        $('html, body').animate({scrollTop: 0}, 500);
    });
});
</script>
<!-- pagedown end -->