package org.magen.belucky.entity;

import java.util.Date;

/**
 * 用户实体类
 * @date 2015年1月28日
 * @author shenzl
 */
public class User implements java.io.Serializable{
	private static final long serialVersionUID = 1508089208570316427L;
	/**
	 * 主键id
	 */
	private Long id;
	/**
	 * 用户号，对应登录框的用户名
	 */
	private String userNo;
	/**
	 * 用户昵称
	 */
	private String userName;
	
	private transient String inputPassword;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 创建日期
	 */
	private Date createDt;
	/**
	 * 状态 1-正常 2-已锁定
	 */
	private String status;
	/**
	 *  盐
	 */
	private String salt;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(String inputPassword) {
		this.inputPassword = inputPassword;
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

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
}
