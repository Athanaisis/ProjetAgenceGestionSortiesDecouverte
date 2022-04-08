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

import com.example.demo.Models.Participants;
import com.example.demo.Repositories.ParticipantsRepository;

@Controller
@RequestMapping("participants")
public class ParticipantsControllers {

	@Autowired
	ParticipantsRepository participantsRepository;

	@GetMapping
	public String welcome(Model m) {
		List<Participants> participants= participantsRepository.findAll();
		Participants participant1 = new Participants();
		m.addAttribute("participant", participant1);
		m.addAttribute("participants", participants);
		return "Participants.html";
	}

	@PostMapping("add")
	public String addParticipants(@Valid Participants participants, BindingResult result) {

		if (result.hasErrors())
			return "Participants.html";
		else {
			participantsRepository.save(participants);
			return "redirect:/participants"; // ici c'est le mapping (RequestMapping) qu'il faut renseigner et non la page web html
		}

	}

	@GetMapping("liste")
	public String getListe(Model model) {
		List<Participants> p = participantsRepository.findAll();
		model.addAttribute("participant", p); //Le model prend la classe participant
		// le Model est un objet proposer pour intégrer les classes entity dans le web graphique (ici Participants.html)
		//tout en gérant la documentation de la bdd effectuer grâce aux posts de utilisateurs
		//depuis la page Participants.html //Ainsi la mise à jour de la bdd effectuée on peut synchroniser les infos entre
		// la bdd et une autre page web (ici listParticipants.html)pour que l'utilisateur puisse visualiser et rectifier les modifications
		return "listParticipants";
	}

}
