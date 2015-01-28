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
	
	@RequestMapping("/index")
	public String index(){
//		log.info("index");
		return "index";
	}
	
	@RequestMapping("/admin")
	public String toAdmin(){
		return "admin/adminIndex";
	}
	
	
}
