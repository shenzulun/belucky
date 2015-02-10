package org.magen.belucky.web;

import java.util.List;

import org.magen.belucky.common.Page;
import org.magen.belucky.entity.Article;
import org.magen.belucky.service.IArticleService;
import org.magen.belucky.web.base.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
		Page page = new Page();
		List<Article> articles = articleService.queryArticleByPage(page);
		model.addAttribute("articles",articles);
		model.addAttribute("page",page);
		return "blog/blogMain";
	}
	
	@RequestMapping(value="/p/{currentPage}",method = RequestMethod.GET)
	public String listByPage(@PathVariable("currentPage") int currentPage,Model model, Page page){
		List<Article> articles = articleService.queryArticleByPage(page);
		model.addAttribute("articles",articles);
		model.addAttribute("page",page);
		return "blog/blogMain";
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public String listOne(@PathVariable("id") Long id,Model model){
		Article article = articleService.queryArticleById(id);
		if(article == null){
			return "redirect:/blog";
		}
		model.addAttribute("article",article);
		return "blog/blogDetail";
	}
	
	@RequestMapping(value="/m/add",method = RequestMethod.GET)
	public String toAdd(){
		return "blog/addBlog";
	}
	
	@RequestMapping(value="/m/add",method = RequestMethod.POST)
	public String add(Article article, RedirectAttributes redirectAttributes){
		articleService.saveArticle(article);
		redirectAttributes.addFlashAttribute("message","发布文章["+article.getTitle()+"]成功!");
		return "redirect:/blog/m";
	}
	
	@RequestMapping(value="/m",method = RequestMethod.GET)
	public String toManageBlogs(Model model){
		List<Article> articles = articleService.queryAllArticle();
		model.addAttribute("articles",articles);
		return "blog/manageBlogMain";
	}
	
	@RequestMapping(value="/m/{id}/update",method = RequestMethod.GET)
	public String toUpdate(@PathVariable("id") Long id,Model model){
		Article article = articleService.queryArticleById(id);
		model.addAttribute("article", article);
		return "blog/updateBlog";
	}
	
	@RequestMapping(value="/m/{id}/update",method = RequestMethod.POST)
	public String update(Article article, RedirectAttributes redirectAttributes){
		articleService.updateArticle(article);
		redirectAttributes.addFlashAttribute("message","更新文章["+article.getTitle()+"]成功!");
		return "redirect:/blog/m";
	}
	
	@RequestMapping(value="/m/{id}/delete",method = RequestMethod.GET)
	public String delete(@PathVariable("id") Long id,RedirectAttributes redirectAttributes){
		articleService.deleteArticle(id);
		redirectAttributes.addFlashAttribute("message","删除文章["+id+"]成功!");
		return "redirect:/blog/m";
	}
}
