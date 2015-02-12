package org.magen.belucky.dao.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

/**
 * 基本dao实现类
 * @date 2015年2月12日
 * @author shenzl
 */
@Repository("baseDao")
public class BaseDaoImpl implements IBaseDao{
	protected Logger log = LoggerFactory.getLogger(this.getClass());
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcInsert insertActor;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.insertActor = new SimpleJdbcInsert(dataSource)
				.usingGeneratedKeyColumns("id");
	}

	public <PK extends Serializable> void deleteById(String tableName, PK id) {
		String sql = "delete from " + tableName + " where id=?";
		this.jdbcTemplate.update(sql,id);
	}

	public <T> List<T> queryBySql(String sql, Class<T> cls) {
		return this.jdbcTemplate.queryForList(sql, cls);
	}

	public List<Map<String, Object>> queryBySql(String sql) {
		return this.jdbcTemplate.queryForList(sql);		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public SimpleJdbcInsert getInsertActor() {
		return insertActor;
	}
}
