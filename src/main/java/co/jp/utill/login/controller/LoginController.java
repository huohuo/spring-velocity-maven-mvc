package co.jp.utill.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(
			@RequestParam(value = "userName", required = false, defaultValue = "") String userName,
			@RequestParam(value = "password", required = false, defaultValue = "") String password) {

		ModelAndView mv = null;
		if (!userName.equals("user")) {
			mv = new ModelAndView("login");
			mv.addObject("userName", userName);
		} else {
			mv = new ModelAndView("user/user-main");
		}

		return mv;
	}
}
