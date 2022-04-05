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

import com.example.demo.Models.Recommandation;
import com.example.demo.Repositories.RecommandationRepository;

@Controller
@RequestMapping("recommandations")
public class RecommandationControllers {

	@Autowired
	RecommandationRepository recommandationRepository;

	@GetMapping("")
	public String welcome(Model m) {
		List<Recommandation> recom = recommandationRepository.findAll();
		Recommandation recom1 = new Recommandation();
		m.addAttribute("recom", recom1);
		m.addAttribute("recom", recom);
		return "Recommandation.html";
	}

	@PostMapping("add")
	public String addRecommandation(@Valid Recommandation recommandation, BindingResult result) {

		if (result.hasErrors())
			return "Recommandation.html"; // c'est redirigé vers la page web de référence
		else {
			recommandationRepository.save(recommandation);
			return "redirect:/recommandation";
		}

	}

	@GetMapping("liste")
	public String getListe(Model model) {
		List<Recommandation> reco = recommandationRepository.findAll();
		model.addAttribute("recommandations", reco);
		return "listRecommandation";
	}

}
