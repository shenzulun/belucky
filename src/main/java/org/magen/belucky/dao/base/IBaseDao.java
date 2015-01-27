package org.magen.belucky.dao.base;

import java.util.List;
import java.util.Map;

public interface IBaseDao {
	
	public <T> T save(T t);
	
	public <T> void update(T t);
	
	public <T,PK extends java.io.Serializable> T queryById(Class<T> cls,PK id);
	
	public <PK extends java.io.Serializable> void deleteById(Class<?> cls,PK id);
	
	public <T> List<T> queryBySql(String sql, Class<T> cls);
	
	public List<Map<String, Object>> queryBySql(String sql);
}
