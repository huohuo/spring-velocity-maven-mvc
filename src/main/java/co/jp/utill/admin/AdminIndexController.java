package co.jp.utill.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminIndexController {

	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("admin/index");
		return mv;
	}
}
