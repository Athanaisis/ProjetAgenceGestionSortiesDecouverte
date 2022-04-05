package com.example.demo.WebControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("")
	public String welcome() {
		return "Accueil";
	}

}
