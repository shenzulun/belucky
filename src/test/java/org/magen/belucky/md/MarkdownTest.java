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
	public static final int RUN_TIMES = 10;
	
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
	
	/**
	 * 测试markdown解析效率
	 * @throws IOException 
	 */
	@Test
	public void testProcess1() throws IOException{
		long start = System.currentTimeMillis();
		Article article = articleDao.queryArticleById(7L);
		for(int i=0;i<RUN_TIMES;i++){
			String sNewText = MarkdownFactory.getMarkdownProcessor().process(article.getContent());
		}
		long end = System.currentTimeMillis();
		System.out.println("process1 耗时:" + (end - start));
	}
	
	/**
	 * 测试markdown解析效率
	 * @throws IOException 
	 */
	@Test
	public void testProcess2() throws IOException{
		long start = System.currentTimeMillis();
		Article article = articleDao.queryArticleById(7L);
		for(int i=0;i<RUN_TIMES;i++){
			String sNewText = MarkdownFactory.getMarkdownProcessor().process(article.getContent(),true);
			System.out.println("after->" + sNewText);
		}
		long end = System.currentTimeMillis();
		System.out.println("process2 耗时:" + (end - start));
	}
}
