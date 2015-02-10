package org.magen.belucky.service;

import java.util.List;

import org.magen.belucky.common.Page;
import org.magen.belucky.entity.Article;

public interface IArticleService {
	
	public List<Article> queryAllArticle();
	
	public Article queryArticleById(long id);

	public void saveArticle(Article article);
	
	public void deleteArticle(long id);
	
	public void updateArticle(Article article);
	
	/**
	 * 分页查询
	 * @param page
	 * @return
	 */
	public List<Article> queryArticleByPage(Page page);
}
