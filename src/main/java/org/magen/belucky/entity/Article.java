package org.magen.belucky.entity;

import java.io.IOException;
import java.util.Date;
import org.magen.belucky.extend.md.MarkdownFactory;
import org.magen.belucky.util.CustomDateSerializer;
import org.magen.belucky.util.DateTimeUtil;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 文章实体类
 * @date 2015年1月28日
 * @author shenzl
 */
public class Article implements java.io.Serializable{
	private static final long serialVersionUID = -6455522246943805543L;
	/**
	 * 主键id
	 */
	private long id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 作者
	 */
	private String author;
	/**
	 * 创建日期
	 */
	private Date createDt;
	/**
	 * 更新日期
	 */
	private Date updateDt;
	
	/**
	 * 创建日期，非json请求界面展示用
	 */
	private String createDtStr;
	/**
	 * 标题缩写  展示到浏览器的标签页上
	 */
	private String shortTitle;
	/**
	 * 文章内容 界面展示用
	 */
	private String showContent;
	
	public Article(){
		
	}

	public Article( String title, String content, String author) {
		super();
		this.title = title;
		this.content = content;
		this.author = author;		
	}
	
	public void desc(){
		System.out.println("====================");
		System.out.println("文章id:[" + id + "]");
		System.out.println("标题:[" + title + "]");
		System.out.println("作者:[" + author + "]");
		System.out.println("发布时间:[" + createDt + "]");
		System.out.println("====================");
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@JsonSerialize(using=CustomDateSerializer.class)
	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	
	@JsonSerialize(using=CustomDateSerializer.class)
	public Date getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

	public String getCreateDtStr() {
		if(createDt != null){
			return DateTimeUtil.format(createDt);
		}
		return createDtStr;
	}

	public String getShortTitle() {
		if(title != null){
			if(title.length() >= 20){
				return title.substring(0,10);
			}else{
				return title;
			}
		}
		return shortTitle;
	}

	public String getShowContent() {
		if(content != null){
			try {
				showContent = MarkdownFactory.getMarkdownProcessor().process(content);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return showContent;
		}
		return content;
	}
	
	
	
}
