package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class blogController {
	
	@RequestMapping("/blog")
	public String blog()
	{
		return "blog";
	}

}
