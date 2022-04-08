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
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Models.Admin;
import com.example.demo.Models.Sorties;
import com.example.demo.Repositories.SortiesRepository;
import com.example.demo.Services.AccountServiceImplement;


@Controller
@RequestMapping("sorties")
public class SortiesControllers {

	@Autowired
	SortiesRepository sortiesRepository;
	@Autowired
	AccountServiceImplement accountServiceImplement;

	@GetMapping
	public String welcome(Model m) {
		
		Sorties sorties = new Sorties();
		List<Admin> admins=accountServiceImplement.findAdmins();
		m.addAttribute("admins", admins);
		m.addAttribute("sorties", sorties);
		String nom="";
		m.addAttribute("nom",nom);
		return "Sorties.html";
	}

	@PostMapping("/add")
	public String addSorties(@Valid Sorties sorties, BindingResult result,@RequestParam String nom) {
		
		Admin ad=accountServiceImplement.findbynom(nom); // recherche d'admin
		sorties.setAdmin(ad); // association de admin=> sortie
		
		sortiesRepository.save(sorties);
		
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
