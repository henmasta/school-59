package com.prodaction.uznk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UznkController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "Main");
		return "index";
	}

	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("name", "hey");
		return "contact";
	}

	@GetMapping("/abouts")
	public String abouts(Model model) {
		model.addAttribute("title", "abouts");
		return "aboutus";
	}
}