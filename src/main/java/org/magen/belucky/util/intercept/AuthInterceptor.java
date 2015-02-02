package org.magen.belucky.util.intercept;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.magen.belucky.util.SessionUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 权限控制
 * @date 2015年2月2日
 * @author shenzl
 */
public class AuthInterceptor implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
        String contextPath=request.getContextPath();      
        if (!SessionUtil.isSessionAlive(request)) {
            //被拦截，重定向到login界面
            response.sendRedirect(contextPath+"/admin");
            return false;
        }
        return true;
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
