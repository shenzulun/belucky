package org.magen.belucky;

import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.magen.belucky.dao.base.IBaseDao;
import org.magen.belucky.base.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseDaoTest extends BaseTest{
	
	@Autowired
	@Qualifier("baseDao")
	private IBaseDao baseDao;
	
	@Test
	public void testQueryBySql1(){
		List<String> lists = baseDao.queryBySql("select title from article", String.class);
		if(lists != null){
			for(String str : lists){
				System.out.println(str);
			}
		}
	}
	
	
	public void testQueryBySql2(){
		List<Map<String, Object>> lists = baseDao.queryBySql("select * from article");
		if(lists != null){
			for(Map<String, Object> map : lists){
				System.out.println(map.get("title"));
				System.out.println(map.get("content"));
			}
		}
	}

}
