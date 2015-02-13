package org.magen.belucky.web;

import java.util.List;

import org.magen.belucky.common.CodeConst;
import org.magen.belucky.common.Page;
import org.magen.belucky.common.UrlMapperConst;
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

/**
 * 博客controller
 * @date 2015年2月12日
 * @author shenzl
 */
@Controller
@RequestMapping("/blog")
public class BlogController extends AbstractController{
	
	@Autowired
	private IArticleService articleService;
	
	/**
	 * 博客首页查询,匹配/blog
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model){
		Page page = new Page();
		List<Article> articles = articleService.queryArticleByPage(page);
		model.addAttribute(CodeConst.PARAM_LIST_ARTICLE,articles);
		model.addAttribute(CodeConst.PARAM_PAGE,page);
		return UrlMapperConst.BLOG_INDEX;
	}
	
	/**
	 * 博客分页查询
	 * @param currentPage
	 * @param model
	 * @param page
	 * @return
	 */
	@RequestMapping(value="/p/{currentPage}",method = RequestMethod.GET)
	public String listByPage(@PathVariable("currentPage") int currentPage,Model model, Page page){
		List<Article> articles = articleService.queryArticleByPage(page);
		if(articles == null || articles.size() == 0){
			return UrlMapperConst.REDIRECT_TO_BLOG;
		}
		model.addAttribute(CodeConst.PARAM_LIST_ARTICLE,articles);
		model.addAttribute(CodeConst.PARAM_PAGE,page);
		return UrlMapperConst.BLOG_INDEX;
	}
	/**
	 * 单篇博客详情页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public String listOne(@PathVariable("id") Long id,Model model){
		Article article = articleService.queryArticleById(id);
		if(article == null){
			return UrlMapperConst.REDIRECT_TO_BLOG;
		}
		model.addAttribute(CodeConst.PARAM_ARTICLE,article);
		return UrlMapperConst.BLOG_DETAIL;
	}
	
	/**
	 * 增加博客首页
	 * @return
	 */
	@RequestMapping(value="/m/add",method = RequestMethod.GET)
	public String toAdd(){
		return UrlMapperConst.BLOG_ADD;
	}
	/**
	 * 增加博客
	 * @param article
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value="/m/add",method = RequestMethod.POST)
	public String add(Article article, RedirectAttributes redirectAttributes){
		articleService.saveArticle(article);
		redirectAttributes.addFlashAttribute(CodeConst.PARAM_MESSAGE,"发布文章["+article.getTitle()+"]成功!");
		return UrlMapperConst.REDIRECT_TO_BLOG_M;
	}
	/**
	 * 博客管理台首页
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/m",method = RequestMethod.GET)
	public String toManageBlogs(Model model){
		List<Article> articles = articleService.queryAllArticle();
		model.addAttribute(CodeConst.PARAM_LIST_ARTICLE,articles);
		return UrlMapperConst.BLOG_M;
	}
	/**
	 * 更新博客首页
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/m/{id}/update",method = RequestMethod.GET)
	public String toUpdate(@PathVariable("id") Long id,Model model){
		Article article = articleService.queryArticleById(id);
		model.addAttribute(CodeConst.PARAM_ARTICLE, article);
		return UrlMapperConst.BLOG_UPDATE;
	}
	/**
	 * 更新博客
	 * @param article
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value="/m/{id}/update",method = RequestMethod.POST)
	public String update(Article article, RedirectAttributes redirectAttributes){
		articleService.updateArticle(article);
		redirectAttributes.addFlashAttribute(CodeConst.PARAM_MESSAGE,"更新文章["+article.getTitle()+"]成功!");
		return UrlMapperConst.REDIRECT_TO_BLOG_M;
	}
	/**
	 * 删除博客
	 * @param id
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value="/m/{id}/delete",method = RequestMethod.GET)
	public String delete(@PathVariable("id") Long id,RedirectAttributes redirectAttributes){
		articleService.deleteArticle(id);
		redirectAttributes.addFlashAttribute(CodeConst.PARAM_MESSAGE,"删除文章["+id+"]成功!");
		return UrlMapperConst.REDIRECT_TO_BLOG_M;
	}
}
