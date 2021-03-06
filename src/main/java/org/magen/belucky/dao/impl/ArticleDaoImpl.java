package org.magen.belucky.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.magen.belucky.common.Page;
import org.magen.belucky.dao.IArticleDao;
import org.magen.belucky.dao.base.BaseDaoImpl;
import org.magen.belucky.entity.Article;
import org.magen.belucky.util.DateTimeUtil;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * 文章CRUD实现类
 * @date 2015年2月12日
 * @author shenzl
 */
@Repository("articleDao")
public class ArticleDaoImpl extends BaseDaoImpl implements IArticleDao {
	
	public List<Article> queryAllArticle() {
		return this.getJdbcTemplate().query( "select * from t_article order by id desc", new ArticleMapper());
	}

	public Article queryArticleById(long id) {
		List<Article> articles =  this.getJdbcTemplate().query("select * from t_article where id=?", 
						new Object[]{id},new ArticleMapper());
		if(articles == null || articles.size() == 0){
			return null;
		}
		return articles.get(0);
	}

	public void saveArticle(Article article) {
		String sql = "insert into t_article(title,content,author,create_dt,tags) values(?,?,?,datetime('now'),?)";
		this.getJdbcTemplate().update(sql, article.getTitle(),article.getContent(),article.getAuthor(),article.getTags());
	}
	/**
	 * 文章model包装类
	 * @date 2015年2月12日
	 * @author shenzl
	 */
	private static final class ArticleMapper implements RowMapper<Article> {

		public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
			Article article = new Article();
			article.setId(rs.getLong("id"));
			article.setTitle(rs.getString("title"));
			//转换换行符为<br/>
			String dbContent = rs.getString("content");
//			if(dbContent != null){
//				dbContent = dbContent.replace("\r\n", "<br/>").replace("\n", "<br/>");
//			}
			article.setContent(dbContent);
			article.setAuthor(rs.getString("author"));
			String createDt = rs.getString("create_dt");
			String updateDt = rs.getString("update_dt");
			if(createDt != null){
				article.setCreateDt(DateTimeUtil.parse(createDt));
			}
			if(updateDt != null){
				article.setCreateDt(DateTimeUtil.parse(updateDt));
			}		
			article.setTags(rs.getString("tags"));
			return article;
		}
	}

	public void updateArticle(Article article) {
		String sql = "update t_article set title=?,content=?,author=?,update_dt=datetime('now'),tags=? where id=?";
		this.getJdbcTemplate().update(sql, article.getTitle(),article.getContent(),article.getAuthor(),article.getTags(),article.getId());
	}

	public List<Article> queryArticleByPage(Page page) {
		if(page == null){
			page = new Page();
		}
		int totalSize = this.getJdbcTemplate().queryForObject("select count(1) from t_article",Integer.class);
		int pageSize = page.getPageSize();
		page.setTotalSize(totalSize);
		if(totalSize % pageSize == 0){
			page.setTotalPage(totalSize / pageSize);
		}else{
			page.setTotalPage(totalSize / pageSize + 1);
		}
		StringBuilder sqlBuilder = new StringBuilder("select * from t_article order by id desc limit ");
		int startRow = (page.getCurrentPage() - 1) * page.getPageSize();
		sqlBuilder.append(startRow).append(",").append(page.getPageSize());
		return this.getJdbcTemplate().query(sqlBuilder.toString(), new ArticleMapper());
	}

}
