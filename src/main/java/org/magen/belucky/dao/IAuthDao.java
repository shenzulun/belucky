package org.magen.belucky.dao;

import org.magen.belucky.dao.base.IBaseDao;
import org.magen.belucky.entity.User;

public interface IAuthDao extends IBaseDao{
	
	public User queryUserByUserNo(String userNo);

}
