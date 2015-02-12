package org.magen.belucky.web;

import org.magen.belucky.web.base.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 分发
 * @date 2015年1月28日
 * @author shenzl
 */
@Controller
public class IndexController extends AbstractController{
	
	/**
	 * 跳转到首页
	 * @return
	 */
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
