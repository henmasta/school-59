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

	@GetMapping("/error")
	public String error(Model model) {
		model.addAttribute("title", "Oops");
		return "404";
	}

	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("name", "hey");
		return "contact";
	}

	@GetMapping("/abouts")
	public String abouts(Model model) {
		model.addAttribute("title", "about");
		return "vacancy";
	} 

	@GetMapping("/items")
	public String items(Model model) {
		model.addAttribute("title", "items");
		return "предметы";
	}

	@GetMapping("/vacancy")
	public String vacancy(Model model) {
		model.addAttribute("title", "vacancy");
		return "vacancy";
	}

	@GetMapping("/vacancy_place")
	public String vacancy_place(Model model) {
		model.addAttribute("title", "vacancy_place");
		return "vacancy_place";
	}

	@GetMapping("/documents")
	public String documents(Model model) {
		model.addAttribute("title", "documents");
		return "documents";
	}

	@GetMapping("/education")
	public String education(Model model) {
		model.addAttribute("title", "education");
		return "education";
	}


	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("title", "login");
		return "login";
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