package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/home")
	@ResponseBody
	public String home() { // http://localhost:8080/home
		return "hello spring boot";
	}
	
	@GetMapping("/jump")
	@ResponseBody
	public String jump() { // http://localhost:8080/jump
		return "jump to spring boot";
	}
	
	@GetMapping("/sbb")
	@ResponseBody
	public String sbb() { // http://localhost:8080/sbb
		return "index";
	}
}