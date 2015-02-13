package org.magen.belucky.common;

/**
 * 通用的一些常量
 * @date 2015年2月12日
 * @author shenzl
 */
public final class CodeConst {
	/**
	 * salt位数
	 */
	public static final int SALT_SIZE = 8;
	/**
	 * hash类型
	 */
	public static final String HASH_ALGORITHM = "SHA-1";
	/**
	 * hash次数
	 */
	public static final int HASH_INTERATIONS = 1024;
	/**
	 * 用户状态-锁定
	 */
	public static final String USER_LOCKED = "2";
	/**
	 * session检查标识
	 */
	public static final String SESSION_AUTH_ID = "userNo";
	
	//=======================jsp 参数  start
	/**
	 * 参数；分页
	 */
	public static final String PARAM_PAGE = "page";
	/**
	 * 参数；article集合
	 */
	public static final String PARAM_LIST_ARTICLE = "articles";
	
	/**
	 * 参数：单个article
	 */
	public static final String PARAM_ARTICLE = "article";
	/**
	 * 参数：返回信息
	 */
	public static final String PARAM_MESSAGE = "message";
	
	//=======================jsp 参数  end
	
}
