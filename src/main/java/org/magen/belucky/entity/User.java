package org.magen.belucky.entity;

import java.util.Date;

/**
 * 用户实体类
 * @date 2015年1月28日
 * @author shenzl
 */
public class User implements java.io.Serializable{
	private static final long serialVersionUID = 1508089208570316427L;
	
	private String userNo;
	
	private String password;
	
	private Date createDt;
	
	private String status;

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
