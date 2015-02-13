package org.magen.belucky.extend.md;

/**
 * markdown解析工厂
 * @date 2015年2月13日
 * @author shenzl
 */
public class MarkdownFactory {
	
	private MarkdownFactory(){}
	
	public static ExtraMarkdown4jProcessor getMarkdownProcessor(){
		return MarkdownFactoryInstance.processor;
	}
	
	private static class MarkdownFactoryInstance{
		static ExtraMarkdown4jProcessor processor = new ExtraMarkdown4jProcessor();		
	}

}
