package org.magen.belucky.md;

import java.io.IOException;

import org.junit.Test;
import org.magen.belucky.base.BaseTest;
import org.magen.belucky.dao.IArticleDao;
import org.magen.belucky.entity.Article;
import org.magen.belucky.extend.md.MarkdownFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * markdown4j测试
 * @date 2015年2月12日
 * @author shenzl
 */
public class MarkdownTest extends BaseTest{
	
	@Autowired
	private IArticleDao articleDao;
	
	@Test
	public void test0(){
		Article article = articleDao.queryArticleById(7L);
		System.out.println("old->" + article.getContent());
		try {
			String sNewText = MarkdownFactory.getMarkdownProcessor().process(article.getContent());
			System.out.println("after->" + sNewText);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
