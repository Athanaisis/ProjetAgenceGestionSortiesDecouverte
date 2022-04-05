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

	@GetMapping("")
	public String welcome(Model m) {
		List<Participants> participant = participantsRepository.findAll();
		Participants participant1 = new Participants();
		m.addAttribute("participant", participant1);
		m.addAttribute("participant", participant);
		return "Participants.html";
	}

	@PostMapping("add")
	public String addParticipants(@Valid Participants participants, BindingResult result) {

		if (result.hasErrors())
			return "Participants.html";
		else {
			participantsRepository.save(participants);
			return "redirect:/participants";
		}

	}

	@GetMapping("liste")
	public String getListe(Model model) {
		List<Participants> p = participantsRepository.findAll();
		model.addAttribute("participantss", p);
		return "listParticipants";
	}

}
