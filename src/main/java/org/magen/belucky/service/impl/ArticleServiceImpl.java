package org.magen.belucky.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.magen.belucky.common.Page;
import org.magen.belucky.dao.IArticleDao;
import org.magen.belucky.dao.ITagDao;
import org.magen.belucky.entity.Article;
import org.magen.belucky.entity.Tag;
import org.magen.belucky.service.IArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文章服务实现类
 * @date 2015年2月12日
 * @author shenzl
 */
@Service("articleService")
public class ArticleServiceImpl implements IArticleService{
	protected Logger log = LoggerFactory.getLogger(getClass());	
	@Autowired
	private IArticleDao articleDao;

	public List<Article> queryAllArticle() {
		return articleDao.queryAllArticle();
	}

	public Article queryArticleById(long id) {
		return articleDao.queryArticleById(id);
	}

	public void saveArticle(Article article) {
		articleDao.saveArticle(article);
		//保存tag
//		if(StringUtils.isNotBlank(article.getTags())){
//			String[] tagArr = article.getTagArr();
//			for(String tagName : tagArr){
//				Tag tag = tagDao.queryTagByName(tagName);
//				if(tag == null){
//					tag = new Tag();
//					tag.setTagName(tagName);
//					tagDao.saveTag(tag);
//					
//				}
//			}
//		}
	}

	public void deleteArticle(long id) {
		articleDao.deleteById("t_article", id);
	}

	public void updateArticle(Article article) {
		articleDao.updateArticle(article);
	}

	public List<Article> queryArticleByPage(Page page) {		
		return articleDao.queryArticleByPage(page);
	}

}
