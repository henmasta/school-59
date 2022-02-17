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

	@GetMapping("/items")
	public String items(Model model) {
		model.addAttribute("title", "items");
		return "предметы";
	}

	@GetMapping("/items/Русский_язык_5-класс")
	public String RussianLanguage5(Model model) {
		model.addAttribute("title", "Russian_Language");
		return "Русский_язык/5-класс";
	}

	@GetMapping("/items/Русский_язык_6-класс")
	public String RussianLanguage6(Model model) {
		model.addAttribute("title", "Russian_Language");
		return "Русский_язык/6-класс";
	}

	@GetMapping("/items/Русский_язык_7-класс")
	public String RussianLanguage7(Model model) {
		model.addAttribute("title", "Russian_Language");
		return "Русский_язык/7-класс";
	}

	@GetMapping("/items/Русский_язык_8-класс")
	public String RussianLanguage8(Model model) {
		model.addAttribute("title", "Russian_Language");
		return "Русский_язык/8-класс";
	}

	@GetMapping("/items/Физика_7-класс")
	public String Physics7(Model model) {
		model.addAttribute("title", "Physics");
		return "Физика/Physics_7";
	}
}