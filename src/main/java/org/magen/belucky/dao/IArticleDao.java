package org.magen.belucky.dao;

import java.util.List;

import org.magen.belucky.common.Page;
import org.magen.belucky.dao.base.IBaseDao;
import org.magen.belucky.entity.Article;

/**
 * 文章CRUD接口
 * @date 2015年1月27日
 * @author shenzl
 */
public interface IArticleDao extends IBaseDao{
	/**
	 * 查询所有文章，没有分页
	 * @return
	 */
	public List<Article> queryAllArticle();
	/**
	 * 根据id查询文章
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
