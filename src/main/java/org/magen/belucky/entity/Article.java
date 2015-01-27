package org.magen.belucky.entity;

import java.util.Date;

public class Article implements java.io.Serializable{
	private static final long serialVersionUID = -6455522246943805543L;
	
	private long id;
	
	private String title;
	
	private String content;
	
	private String author;
	
	private Date createDt;
	
	private Date updateDt;
	
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

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}
}
