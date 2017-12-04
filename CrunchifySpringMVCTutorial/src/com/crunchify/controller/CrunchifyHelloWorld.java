package com.crunchify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.RequestMethod;



@Controller

public class CrunchifyHelloWorld {
		@RequestMapping("/welcome")
		public ModelAndView helloWorld() { 
			
			String message = "<br><div style ='text-align:center;'"
					+"<h3>***** Hello World, spring MVC Tutroial</h3>This is a message coming from CrunchifyHelloWorld.java*****</div><br><br>";
			return new ModelAndView("welcome", "message", message);
		}
}
