package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class contactController {
	
	@RequestMapping("/contact")
		public String contact() 
		{
		    return "contact";
		}
		
	

}
