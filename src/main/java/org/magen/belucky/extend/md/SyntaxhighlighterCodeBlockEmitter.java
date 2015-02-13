package org.magen.belucky.extend.md;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.github.rjeschke.txtmark.BlockEmitter;

/**
 * markdown code模块解析，适配Syntaxhighlighter
 * @date 2015年2月13日
 * @author shenzl
 */
public class SyntaxhighlighterCodeBlockEmitter implements BlockEmitter{

	public void emitBlock(StringBuilder out, List<String> lines, String meta) {
		String lang = meta;   	
		if(meta.endsWith("`") && StringUtils.countMatches(meta, "`") == 3){
			//类似 ```java```
			lang = meta.substring(0, meta.length() - 3);
		}
		out.append("<pre class=\"brush: ").append(lang).append("\"");
//		if(meta.length() > 0) {
//			out.append(" class=\""+meta+"\"");	 
//		}
		out.append(">");
		for(String s : lines){
			for(int i = 0; i < s.length(); i++){
				char c = s.charAt(i);
				switch(c){
					case '&':
						out.append("&amp;");
						break;
					case '<':
						out.append("&lt;");
						break;
					case '>':
						out.append("&gt;");
						break;
					default:
						out.append(c);
						break;
				}
			}	
			out.append('\n');
		}
		out.append("</pre>\n");	
	}
}
