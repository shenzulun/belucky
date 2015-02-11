package org.magen.belucky.extend.md;

public class MarkdownFactory {
	
	private MarkdownFactory(){}
	
	public static ExtraMarkdown4jProcessor getMarkdownProcessor(){
		return MarkdownFactoryInstance.processor;
	}
	
	private static class MarkdownFactoryInstance{
		static ExtraMarkdown4jProcessor processor = new ExtraMarkdown4jProcessor();		
	}

}
