package org.magen.belucky.web;

import java.util.List;

import org.magen.belucky.entity.Article;
import org.magen.belucky.service.IArticleService;
import org.magen.belucky.web.base.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blog")
public class BlogController extends AbstractController{
	
	@Autowired
	private IArticleService articleService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model){
		List<Article> articles = articleService.queryAllArticle();
		model.addAttribute("articles",articles);
		return "blog/blogMain";
	}
	
	@RequestMapping(value="/add",method = RequestMethod.GET)
	public String toAdd(){
		return "blog/addBlog";
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public String add(Article article, RedirectAttributes redirectAttributes){
		articleService.saveArticle(article);
		redirectAttributes.addFlashAttribute("message","发布文章["+article.getTitle()+"]成功!");
		return "redirect:/blog";
	}
	
	
}
