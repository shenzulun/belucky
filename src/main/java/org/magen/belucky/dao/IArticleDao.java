package org.magen.belucky.dao;

import java.util.List;

import org.magen.belucky.dao.base.IBaseDao;
import org.magen.belucky.entity.Article;

/**
 * 文章CRUD接口
 * @date 2015年1月27日
 * @author shenzl
 */
public interface IArticleDao extends IBaseDao{
	
	public List<Article> queryAllArticle();
	
	public Article queryArticleById(long id);
	
	public void saveArticle(Article article);
}
