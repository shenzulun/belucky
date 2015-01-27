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

	public <T> T save(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> void update(T t) {
		
	}

	public <PK extends Serializable> void deleteById(Class<?> cls, PK id) {
		// TODO Auto-generated method stub
		
	}

	public <T, PK extends Serializable> T queryById(Class<T> cls, PK id) {
		// TODO Auto-generated method stub
		return null;
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
