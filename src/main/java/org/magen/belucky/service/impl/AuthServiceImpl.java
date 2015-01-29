package org.magen.belucky.service.impl;

import org.apache.commons.lang.StringUtils;
import org.magen.belucky.dao.IAuthDao;
import org.magen.belucky.entity.User;
import org.magen.belucky.service.IAuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authService")
public class AuthServiceImpl implements IAuthService{
	protected Logger log = LoggerFactory.getLogger(getClass());	
	
	@Autowired
	private IAuthDao authDao;

	public boolean logon(User user) {
		//校验用户号长度
		String userNo = user.getUserNo();
		if(StringUtils.isBlank(userNo)){
			return false;
		}
		if(userNo.length() > 30){
			return false;
		}
		//校验密码长度
		String passwordInput = user.getPassword();
		if(passwordInput != null && passwordInput.length() > 50){
			return false;
		}
		User fromDb = authDao.queryUserByUserNo(userNo);
		if(fromDb == null){
			return false;
		}
		boolean isAuthPass = false;
		String passwordDb = fromDb.getPassword();
		if(passwordInput == null){
			if(passwordDb == null){
				isAuthPass = true;
			}
		}else{
			if(passwordInput.equals(passwordDb)){
				isAuthPass = true;
			}
		}
		return isAuthPass;
	}

}
