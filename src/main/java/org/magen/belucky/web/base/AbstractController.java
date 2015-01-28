package org.magen.belucky.web.base;

import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * 控制层抽象基类
 *
 * @date Jan 9, 2015
 * @author shenzl
 */
public abstract class AbstractController {
	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView handleException500(Exception ex, HttpServletRequest request
			,HttpServletResponse response) {
		String contentType = request.getHeader("content-type");
		if(contentType != null && contentType.equals("application/x-www-form-urlencoded")){
//			handleExceptionAJAX(new AjaxException(ex),request,response);
			return null;
		}
		log.error(getTrace(ex));
		ModelAndView view = new ModelAndView();
		view.addObject("error",getMessage(ex));
		view.setViewName("error/500");
		return view;
	}
	
	/**
	 * 处理AJAX请求产生的异常
	 * @param ex
	 * @param request
	 * @return
	 */
//	@ExceptionHandler(AjaxException.class)
//	public void handleExceptionAJAX(AjaxException ex, HttpServletRequest request
//			,HttpServletResponse response) {
//		Map<String,Object> map = new HashMap<String,Object>();
//		log.error(getTrace(ex));
//		map.put("code", ex.getCode());
//		map.put("desc", getMessage(ex));
//		JsonUtil.printStream(map,response);	
//	}
	
	/**获取异常的所有信息*/
	private String getTrace(Throwable t){
		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		t.printStackTrace(writer);
		StringBuffer buffer = stringWriter.getBuffer();
		return buffer.toString();
	}
	
	private String getMessage(Exception e){
		String res = "未知异常";
		if(e.getCause() != null && !"".equals(e.getCause().getMessage())){
			res = e.getCause().getMessage();
		}else if(e.getMessage() != null && !"".equals(e.getMessage())){
			res = e.getMessage();
		}
		return res;
	}
}
