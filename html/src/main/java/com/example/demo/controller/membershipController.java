package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class membershipController {
	
	@RequestMapping("/membership")
	public String membership()
	{
		return "membership";
	}

}
