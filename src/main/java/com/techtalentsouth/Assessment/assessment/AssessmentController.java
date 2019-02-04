package com.techtalentsouth.Assessment.assessment;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AssessmentController {
	
	public AssessmentController() {
		
	}

	@GetMapping("/")
	public ModelAndView indexMethod() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
		
	}
	
		@GetMapping(value="/about")
	public String about() {
		return "/about";
	}
	
		@GetMapping(value="/contact")
	public String contact() {
		return "/contact";
		
	}
	
}
