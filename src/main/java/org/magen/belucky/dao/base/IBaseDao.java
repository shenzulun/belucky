package org.magen.belucky.dao.base;

import java.util.List;
import java.util.Map;

/**
 * 基本抽象DAO
 * @date 2015年1月27日
 * @author shenzl
 */
public interface IBaseDao {
	/**
	 * 根据主键id删除一条记录		
	 * @param tableName	表名
	 * @param id	主键
	 */
	public <PK extends java.io.Serializable> void deleteById(String tableName,PK id);
	/**
	 * 只能查询一个字段
	 * @param sql
	 * @param cls
	 * @return
	 */
	public <T> List<T> queryBySql(String sql, Class<T> cls);
	/**
	 * 查询，返回所有记录
	 * <p>json利器
	 * @param sql
	 * @return
	 */
	public List<Map<String, Object>> queryBySql(String sql);
}
