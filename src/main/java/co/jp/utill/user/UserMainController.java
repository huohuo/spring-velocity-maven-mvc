package co.jp.utill.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserMainController {

	@RequestMapping("/user/main")
	public ModelAndView userMain() {
		ModelAndView mv = new ModelAndView("user/user-main.vm");
		return mv;
	}
}
