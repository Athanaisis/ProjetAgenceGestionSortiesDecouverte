package com.example.demo.RestControllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Participants;
import com.example.demo.Repositories.ParticipantsRepository;

@RestController
@RequestMapping("api/participants")
public class ParticipantsRestControllers {

	@Autowired
	ParticipantsRepository participantsRepository;

	@GetMapping
	public Page<Participants> getAllParticipants(Pageable pageable) {
		return participantsRepository.findAll(pageable);

	}

	@PostMapping
	public Participants addParticipant(@RequestBody @Valid Participants participant) {
		return participantsRepository.save(participant);
	}

	@GetMapping("/{id}")
	public Participants getOneParticipant(@PathVariable int id) {
		return participantsRepository.findById(id).get(); // la méthode retourne optional par defaut => get transforme
															// le result en object
	}

	@DeleteMapping("/{id}")
	public void deleteParticipant(@PathVariable int id) {
		participantsRepository.deleteById(id);

	}

}
