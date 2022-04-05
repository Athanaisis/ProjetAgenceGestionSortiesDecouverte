package com.example.demo.WebControllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Models.Sorties;
import com.example.demo.Repositories.SortiesRepository;

@Controller
@RequestMapping("sorties")
public class SortiesControllers {

	@Autowired
	SortiesRepository sortiesRepository;

	@GetMapping("")
	public String welcome(Model m) {
		List<Sorties> sorties = sortiesRepository.findAll();
		Sorties sorties1 = new Sorties();
		m.addAttribute("sorties", sorties1);
		m.addAttribute("sorties", sorties);
		return "Sorties.html";
	}

	@PostMapping("add")
	public String addSorties(@Valid Sorties sorties, BindingResult result) {

		if (result.hasErrors())
			return "Sorties";
		else {
			sortiesRepository.save(sorties);
			return "redirect:/sorties";
		}

	}

	@GetMapping("liste")
	public String getListe(Model model) {
		List<Sorties> sor = sortiesRepository.findAll();
		model.addAttribute("sorties", sor);
		return "listSorties";
	}
}
