package org.magen.belucky.extend.md;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.markdown4j.ExtDecorator;
import org.markdown4j.IncludePlugin;
import org.markdown4j.Plugin;
import org.markdown4j.WebSequencePlugin;
import org.markdown4j.YumlPlugin;

import com.github.rjeschke.txtmark.BlockEmitter;
import com.github.rjeschke.txtmark.Configuration;
import com.github.rjeschke.txtmark.Processor;
import com.github.rjeschke.txtmark.Configuration.Builder;

/**
 * markdown4j加强 
 * <p>支持自定义代码格式</p>
 * @date 2015年2月13日
 * @author shenzl
 */
public class ExtraMarkdown4jProcessor{
	private Builder builder;
	
	private ExtDecorator decorator;
	
	private Map<Integer,String> mdCache = new ConcurrentHashMap<Integer,String>();
	
	public ExtraMarkdown4jProcessor() {
		this.builder = builder();
	}
	
	private Builder builder() {
		decorator = new ExtDecorator();
		return Configuration.builder().forceExtentedProfile().registerPlugins(new YumlPlugin(), new WebSequencePlugin(), new IncludePlugin()).convertNewline2Br().setDecorator(decorator).setCodeBlockEmitter(new SyntaxhighlighterCodeBlockEmitter());
	}
	public ExtraMarkdown4jProcessor registerPlugins(Plugin ... plugins) {
		builder.registerPlugins(plugins);
		return this;
	}
	public ExtraMarkdown4jProcessor setDecorator(ExtDecorator decorator) {
		this.decorator = decorator;
		builder.setDecorator(decorator);
		return this;
	}
	public ExtraMarkdown4jProcessor addHtmlAttribute(String name, String value, String ...tags) {
		decorator.addHtmlAttribute(name, value, tags);
		return this;
	}
	public ExtraMarkdown4jProcessor addStyleClass(String styleClass, String ...tags) {
		decorator.addStyleClass(styleClass, tags);
		return this;
	}
	
	public void setCodeBlockEmitter(BlockEmitter emitter){
		this.builder.setCodeBlockEmitter(emitter);
	}
	
	public String process(File file) throws IOException {
		return Processor.process(file, builder.build());
	}
	public String process(InputStream input) throws IOException {
		return Processor.process(input);
	}
	public String process(Reader reader) throws IOException {
		return Processor.process(reader, builder.build());
	}
	public String process(String input) throws IOException {
		return Processor.process(input, builder.build());
	}
	
	/**
	 * 输出html
	 * @param input	markdown格式
	 * @param fromCache	true:优先从缓存中取
	 * @return
	 * @throws IOException
	 */
	public String process(String input,boolean fromCache) throws IOException{
		if(input == null){
			return null;
		}
		if(!fromCache){
			return process(input);
		}
		String result = null;
		int key = input.hashCode();
		if((result = mdCache.get(key)) == null){
			result = process(input);
			mdCache.put(key, result);
		}
		return result;
	}

}
