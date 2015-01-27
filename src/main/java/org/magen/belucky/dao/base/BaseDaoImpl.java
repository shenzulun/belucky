package org.magen.belucky.dao.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDaoImpl implements IBaseDao{
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
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

}
