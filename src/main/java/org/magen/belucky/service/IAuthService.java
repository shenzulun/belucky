package org.magen.belucky.service;

import org.magen.belucky.entity.User;

/**
 * 权限服务接口类
 * @date 2015年2月12日
 * @author shenzl
 */
public interface IAuthService {
	
	/**
	 * 管理台登陆
	 * @param user
	 * @return false:校验不通过
	 */
	public boolean login(User user);
}
