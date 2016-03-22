package nl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@RequestMapping("/working")
	public ModelAndView helloWorld()
 {
 
		ModelAndView mv = new ModelAndView("demoWork");
		mv.addObject("message", "It works!!!");
		return mv;
	}

}
