package org.magen.belucky.web;

import javax.servlet.http.HttpServletRequest;

import org.magen.belucky.common.CodeConst;
import org.magen.belucky.common.UrlMapperConst;
import org.magen.belucky.entity.User;
import org.magen.belucky.service.IAuthService;
import org.magen.belucky.util.SessionUtil;
import org.magen.belucky.web.base.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 管理台controller
 * @date 2015年2月12日
 * @author shenzl
 */
@Controller
@RequestMapping("/admin")
@SessionAttributes(CodeConst.SESSION_AUTH_ID)
public class AdminController extends AbstractController{
	
	@Autowired
	private IAuthService authService;
	
	/**
	 * 匹配 /admin 请求
	 * @param request
	 * @return
	 */
	@RequestMapping(value="")
	public String toAdmin(HttpServletRequest request){
		if(SessionUtil.isSessionAlive(request)){
			return UrlMapperConst.ADMIN_HOME;
		}
		return UrlMapperConst.ADMIN_INDEX;
	}
	
	/**
	 * 用户登录,get请求(如：url直接输入/admin/login)
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String login(HttpServletRequest request){
		if(SessionUtil.isSessionAlive(request)){
			return UrlMapperConst.ADMIN_HOME;
		}
		return UrlMapperConst.ADMIN_INDEX;
	}
	
	/**
	 * 用户登录验证
	 * @param user
	 * @param model
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String login(User user,Model model, RedirectAttributes redirectAttributes){
		log.info("用户{}尝试登陆",user.getUserNo());
		boolean isAuthPass = authService.login(user);
		if(!isAuthPass){
			log.info("用户{}登陆失败",user.getUserNo());
			redirectAttributes.addFlashAttribute("message","登录失败");
			return UrlMapperConst.REDIRECT_TO_ADMIN;
		}
		model.addAttribute(CodeConst.SESSION_AUTH_ID, user.getUserNo());
		log.info("用户{}登陆成功",user.getUserNo());
		return UrlMapperConst.ADMIN_HOME;
	}

}
