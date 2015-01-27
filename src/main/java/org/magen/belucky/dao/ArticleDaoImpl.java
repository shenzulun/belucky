package org.magen.belucky.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.magen.belucky.dao.base.BaseDaoImpl;
import org.magen.belucky.entity.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("articleDao")
public class ArticleDaoImpl extends BaseDaoImpl implements IArticleDao {
	
	public List<Article> queryAllArticle() {
		return this.getJdbcTemplate().query( "select * from article", new ArticleMapper());
	}

	public Article queryArticleById(long id) {
		Article article = this.getJdbcTemplate().queryForObject("select * from article where id=?", 
						new Object[]{id},new ArticleMapper());
		return article;
	}

	public void saveArticle(Article article) {
		String sql = "insert into article(title,content,author,create_dt) values(?,?,?,datetime('now'))";
		this.getJdbcTemplate().update(sql, article.getTitle(),article.getContent(),article.getAuthor());
	}
	
	private static final class ArticleMapper implements RowMapper<Article> {
		protected Logger log = LoggerFactory.getLogger(this.getClass());

		public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
			Article article = new Article();
			article.setId(rs.getLong("id"));
			article.setTitle(rs.getString("title"));
			article.setContent(rs.getString("content"));
			article.setAuthor(rs.getString("author"));
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String createDt = rs.getString("create_dt");
			String updateDt = rs.getString("update_dt");
			try {
				if(createDt != null){
					article.setCreateDt(df.parse(createDt));
				}
				if(updateDt != null){
					article.setCreateDt(df.parse(updateDt));
				}
			} catch (ParseException e) {
				log.error("",e);
			}
			return article;
		}
	}

}
