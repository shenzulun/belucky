package org.magen.belucky.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.magen.belucky.common.CodeConst;

/**
 * session工具类
 * @date 2015年2月12日
 * @author shenzl
 */
public class SessionUtil {
	
	/**
	 * 判断是否已登录
	 * @param request
	 * @return
	 */
	public static boolean isSessionAlive(HttpServletRequest request){
		boolean isAvlive = false;
		HttpSession session = request.getSession();
		String user = (String) session.getAttribute(CodeConst.SESSION_AUTH_ID);
        if (StringUtils.isNotEmpty(user)) {
        	isAvlive = true;
        }
        return isAvlive;
	}

}
