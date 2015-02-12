package org.magen.belucky.common;

/**
 * 页面匹配常量类
 * @date 2015年2月12日
 * @author shenzl
 */
public final class UrlMapperConst {
	/**
	 * 管理台登录页面
	 */
	public static final String ADMIN_INDEX = "admin/adminIndex";
	/**
	 * 管理台主页面
	 */
	public static final String ADMIN_HOME= "admin/adminHome";
	/**
	 * 重定向到管理台首页
	 */
	public static final String REDIRECT_TO_ADMIN= "redirect:/admin";
	
	/**
	 * 博客首页
	 */
	public static final String BLOG_INDEX = "blog/blogMain";
	/**
	 * 单篇文章页面
	 */
	public static final String BLOG_DETAIL = "blog/blogDetail";
	/**
	 * 博客管理台页面
	 */
	public static final String BLOG_M = "blog/manageBlogMain";
	/**
	 * 增加博客页面
	 */
	public static final String BLOG_ADD = "blog/addBlog";
	/**
	 * 更新博客页面
	 */
	public static final String BLOG_UPDATE = "blog/updateBlog";
	/**
	 * 重定向到博客首页
	 */
	public static final String REDIRECT_TO_BLOG= "redirect:/blog";
	/**
	 * 重定向到博客管理台首页
	 */
	public static final String REDIRECT_TO_BLOG_M= "redirect:/blog/m";
}
