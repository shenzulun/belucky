package org.magen.belucky.entity;

import java.util.Date;

/**
 * 文章TAG
 * @date 2015年3月2日
 * @author shenzl
 */
public class Tag implements java.io.Serializable{
	private static final long serialVersionUID = 3611556009672291846L;
	
	private Long id;
	/**
	 * 标签名
	 */
	private String tagName;
	/**
	 * 创建日期
	 */
	private Date createDt;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

}
