package com.sandeep.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	public String home() {
		System.out.println("hi......");
		return "home";
	}

	@RequestMapping("office")
	// public String office(HttpServletRequest req, HttpServletResponse resp) {

	public String office(@RequestParam("name") String myName, HttpSession session) {

		// HttpSession session = req.getSession();
		// String name = req.getParameter("name");
		session.setAttribute("name", myName);
		System.out.println("hi......" + myName);
		return "office";
	}

	@RequestMapping("modelView")
	public ModelAndView test(@RequestParam("name") String myName, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("modelView");
		return mv;
	}
	@RequestMapping("alien")
	public ModelAndView test(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("alien");
		return mv;
	}
	
}
