package org.magen.belucky.dao;

import org.magen.belucky.dao.base.IBaseDao;
import org.magen.belucky.entity.User;

/**
 * 权限DAO
 * @date 2015年2月12日
 * @author shenzl
 */
public interface IAuthDao extends IBaseDao{
	/**
	 * 根据用户号查询用户
	 * @param userNo
	 * @return
	 */
	public User queryUserByUserNo(String userNo);

}
