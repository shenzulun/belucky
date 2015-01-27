package org.magen.belucky.entity;

import java.util.Date;

public class Article implements java.io.Serializable{
	private static final long serialVersionUID = -6455522246943805543L;
	
	private long id;
	
	private String title;
	
	private String content;
	
	private String author;
	
	private Date createDt;
	
	public Article(){
		
	}

	public Article(long id, String title, String content, String author,
			Date createDt) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.author = author;
		this.createDt = createDt;
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
}
