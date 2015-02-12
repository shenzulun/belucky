package org.magen.belucky.service;

import java.util.List;

import org.magen.belucky.common.Page;
import org.magen.belucky.entity.Article;

/**
 * 文章服务接口类
 * @date 2015年2月12日
 * @author shenzl
 */
public interface IArticleService {
	
	/**
	 * 查询所有文章，没有分页
	 * @return
	 */
	public List<Article> queryAllArticle();
	/**
	 * 根据id查询一篇文章
	 * @param id
	 * @return
	 */
	public Article queryArticleById(long id);
	/**
	 * 保存文章
	 * @param article
	 */
	public void saveArticle(Article article);
	/**
	 * 删除文章
	 * @param id
	 */
	public void deleteArticle(long id);
	/**
	 * 更新文章
	 * @param article
	 */
	public void updateArticle(Article article);
	
	/**
	 * 分页查询文章
	 * @param page
	 * @return
	 */
	public List<Article> queryArticleByPage(Page page);
}
