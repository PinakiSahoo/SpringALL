package com.project.springboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	//	@ResponseBody
	public ModelAndView home(Alien alien)
	//(@RequestParam("name")String myName)
	
	{
//		//HttpSession session=req.getSession();
//		//  String name=req.getParameter("name");
//
//		System.out.println("Hi"+myName);
//		session.setAttribute("name",myName  );
		ModelAndView mv=new ModelAndView();
		//mv.addObject("name",myName);
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv;

	}

}
