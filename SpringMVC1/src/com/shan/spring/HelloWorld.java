package com.shan.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class HelloWorld {

	@RequestMapping("/hello")
	public String Hello(ModelMap mm)
	{
		String st="Hello World";
		mm.addAttribute("msg",st);
		return "valid";
	}
	
	@RequestMapping("/bye")
	public String sayBye(ModelMap mm)
	{
		String st="Bye Bye";
		mm.addAttribute("msg", st);
		return "byeview";
	}
	
}
