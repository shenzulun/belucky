<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link rel="stylesheet" type="text/css" href="${ctx}/static/css/basestyle.css" />
<script type="text/javascript" src="${ctx}/static/js/common.js"></script>
<script type="text/javascript" src="${ctx}/static/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="${ctx}/static/js/highlight/shCore.min.js"></script>
<script type="text/javascript" src="${ctx}/static/js/highlight/shBrushJava.js"></script>
<link rel="stylesheet" type="text/css" href="${ctx}/static/css/highlight/shCoreDefault.css">

<script>
$(document).ready(function(){
	$(".md-div").each(function(){
		var mdVal = $(this).text();
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
    
    //SyntaxHighlighter.config.clipboardSwf = 'static/js/highlight/clipboard.swf';
	//SyntaxHighlighter.config.strings = {
		//expandSource : '展开代码',
		//viewSource : '查看代码',
		//copyToClipboard : '复制代码',
		//copyToClipboardConfirmation : '复制成功',
		//print : '打印',
		//noBrush: '不能找到刷子: ',
		//brushNotHtmlScript: '刷子没有配置html-script选项'
	//};
	//SyntaxHighlighter.config.tagName = 'code';	
    SyntaxHighlighter.all();
});
</script>
