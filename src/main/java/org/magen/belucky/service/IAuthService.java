package org.magen.belucky.service;

import org.magen.belucky.entity.User;

public interface IAuthService {
	
	/**
	 * 管理台登陆
	 * @param user
	 * @return false:校验不通过
	 */
	public boolean logon(User user);
}
