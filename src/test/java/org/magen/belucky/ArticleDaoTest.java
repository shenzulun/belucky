/**
 * 
 */
package org.magen.belucky;

import java.util.List;
import org.junit.Test;
import org.magen.belucky.base.BaseTest;
import org.magen.belucky.dao.IArticleDao;
import org.magen.belucky.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

/**
 * 文章DAO单元测试类
 * @date 2015年1月27日
 * @author shenzl
 */
public class ArticleDaoTest extends BaseTest{
	
	@Autowired
	private IArticleDao articleDao;

	@Test
	public void testQueryAllArticle() {
		List<Article> articles = articleDao.queryAllArticle();
		Assert.notNull(articles);
		for(Article article : articles){
			article.desc();
		}
	}

	@Test
	public void testQueryArticleById() {
		Article article = articleDao.queryArticleById(1);
		Assert.notNull(article);
		article.desc();
	}
	
	@Test
	public void testSaveArticle() {
		Article article = new Article("hello spring","spring4 + springjdbc + sqlite3","shenzl");
		articleDao.saveArticle(article);
		log.info("文章发布成功");
		List<Article> articles = articleDao.queryAllArticle();
		Assert.notNull(articles);
		for(Article a : articles){
			a.desc();
		}
	}

}
