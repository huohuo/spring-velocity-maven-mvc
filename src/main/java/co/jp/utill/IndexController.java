package co.jp.utill;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("userName", StringUtils.EMPTY);
		return mv;
	}
}
