package org.magen.belucky.dao;

import org.magen.belucky.dao.base.IBaseDao;
import org.magen.belucky.entity.Article;
import org.magen.belucky.entity.Tag;

/**
 * 标签CRUD接口类
 * @date 2015年3月3日
 * @author shenzl
 */
public interface ITagDao extends IBaseDao{
	/**
	 * 保存tag
	 * @param tag
	 */
	public void saveTag(Tag tag);
	/**
	 * 更新tag
	 * @param tag
	 */
	public void updateTag(Tag tag);	
	/**
	 * 根据tag名字查询tag
	 * @param tagName
	 * @return
	 */
	public Tag queryTagByName(String tagName);
	
	public void saveArticleTag(Article article,Tag tag);
	
}
