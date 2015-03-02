package org.magen.belucky.entity;

/**
 * 文章标签
 * @date 2015年3月2日
 * @author shenzl
 */
public class ArticleTag implements java.io.Serializable{
	private static final long serialVersionUID = -6605650490905179956L;
	
	private Long id;
	/**
	 * 文章ID
	 */
	private Long articleId;
	/**
	 * 标签ID
	 */
	private Long tagId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getArticleId() {
		return articleId;
	}
	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}
	public Long getTagId() {
		return tagId;
	}
	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}
}
