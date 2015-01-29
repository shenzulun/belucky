package org.magen.belucky.dao.base;

import java.util.List;
import java.util.Map;

/**
 * 基本抽象DAO
 * @date 2015年1月27日
 * @author shenzl
 */
public interface IBaseDao {
	
	public <T> T save(T t);
	
	public <T> void update(T t);
	
	public <T,PK extends java.io.Serializable> T queryById(String tableName,PK id);
	
	public <PK extends java.io.Serializable> void deleteById(String tableName,PK id);
	
	public <T> List<T> queryBySql(String sql, Class<T> cls);
	
	public List<Map<String, Object>> queryBySql(String sql);
}
