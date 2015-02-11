package org.magen.belucky.extend.md;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import org.markdown4j.ExtDecorator;
import org.markdown4j.IncludePlugin;
import org.markdown4j.Plugin;
import org.markdown4j.WebSequencePlugin;
import org.markdown4j.YumlPlugin;
import com.github.rjeschke.txtmark.BlockEmitter;
import com.github.rjeschke.txtmark.Configuration;
import com.github.rjeschke.txtmark.Processor;
import com.github.rjeschke.txtmark.Configuration.Builder;


public class ExtraMarkdown4jProcessor{
	private Builder builder;
	
	private ExtDecorator decorator;
	
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

}
