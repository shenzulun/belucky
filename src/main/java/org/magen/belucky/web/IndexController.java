package org.magen.belucky.web;

import java.io.IOException;

import org.magen.belucky.extend.md.MarkdownFactory;
import org.magen.belucky.util.FileUtil;
import org.magen.belucky.web.base.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	/**
	 * 关于我页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/about")
	public String aboutMe(Model model){
		String content = FileUtil.readFileFromCache("md/aboutme.md");
		String html = "";
		try {
			html = MarkdownFactory.getMarkdownProcessor().process(content);
		} catch (IOException e) {
			log.error("markdown格式化错误",e);
		}
		model.addAttribute("content", html);
		return "me/aboutMe";
	}
}
