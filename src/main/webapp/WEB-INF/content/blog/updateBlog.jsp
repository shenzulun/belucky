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
<script type="text/javascript" src="${ctx}/static/js/tabIndent.js"></script>
<script type="text/javascript">
        (function () {
        	tabIndent.renderAll();
            var converter1 = Markdown.getSanitizingConverter();
            
            converter1.hooks.chain("preBlockGamut", function (text, rbg) {
                return text.replace(/^ {0,3}""" *\n((?:.*?\n)+?) {0,3}""" *$/gm, function (whole, inner) {
                    return "<blockquote>" + rbg(inner) + "</blockquote>\n";
                });
            });
            
            var editor1 = new Markdown.Editor(converter1);
            
            editor1.run();
            /**
            var converter2 = new Markdown.Converter();

            converter2.hooks.chain("preConversion", function (text) {
                return text.replace(/\b(a\w*)/gi, "*$1*");
            });

            converter2.hooks.chain("plainLinkText", function (url) {
                return "This is a link to " + url.replace(/^https?:\/\//, "");
            });
            
            var help = function () { alert("Do you need help?"); }
            var options = {
                helpButton: { handler: help },
                strings: { quoteexample: "whatever you're quoting, put it right here" }
            };
            var editor2 = new Markdown.Editor(converter2, "-second", options);
            
            editor2.run();
			*/
        })();
    </script>		
<%@include file="../base/footer.jsp"%>
</body>
</html>