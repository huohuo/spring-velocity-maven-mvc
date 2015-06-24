package co.jp.utill.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.jp.utill.sys.UtillUser;
import co.jp.utill.user.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private HttpSession session;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(
			@RequestParam(value = "userId", required = false, defaultValue = "") String userId,
			@RequestParam(value = "pass", required = false, defaultValue = "") String pass) {

		UtillUser user = loginService.getUser(userId, pass);
		ModelAndView mv = null;
		if (user == null) {
			mv = new ModelAndView("login");
			mv.addObject("userId", userId);
		} else {
			session.setAttribute("user", user);
			mv = new ModelAndView("user/user-main");
		}

		return mv;
	}
}
