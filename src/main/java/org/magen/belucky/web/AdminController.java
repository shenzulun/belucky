package org.magen.belucky.web;

import org.magen.belucky.entity.User;
import org.magen.belucky.service.IAuthService;
import org.magen.belucky.web.base.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminController extends AbstractController{
	
	@Autowired
	private IAuthService authService;
	
	@RequestMapping(params="method=logon",method = RequestMethod.POST)
	public String logon(User user){
		log.info("用户{}尝试登陆",user.getUserNo());
		boolean isAuthPass = authService.logon(user);
		if(!isAuthPass){
			log.info("用户{}登陆失败",user.getUserNo());
			return "redirect:/";
		}
		log.info("用户{}登陆成功",user.getUserNo());
		return "admin/adminHome";
	}

}
