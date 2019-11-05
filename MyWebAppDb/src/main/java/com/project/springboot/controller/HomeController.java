package com.project.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.springboot.dao.AlienRepo;
import com.project.springboot.model.Alien;



@Controller
public class HomeController {
	@Autowired
	AlienRepo repo;   	
		@RequestMapping("/")
		
		public String home() {
			System.out.println("hi");
			return "home.jsp";
			
		
		}
		@RequestMapping("/addAlien")
		public String addAlien(Alien alien) {
			repo.save(alien); 
			return "home.jsp";
		}
      @RequestMapping("/getAlien")
      public ModelAndView getAlien(@RequestParam int aid )
      {
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		Alien alien=repo.findById(aid).orElse(new Alien());
		//System.out.println(repo.findByTech("Java"));
		mv.addObject(alien);
		return mv;


}
      @RequestMapping("/aliens")
      @ResponseBody
      public String getAliens() {
    	  
    	  return repo.findAll().toString();
      }
      @RequestMapping("/alien/{aid} ")
      @ResponseBody
      public String getAlien1(int aid) {
    	  
    	  return repo.findById(aid).toString();
      }
}


