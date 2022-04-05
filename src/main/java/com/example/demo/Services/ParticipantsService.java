package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Participants;
import com.example.demo.Repositories.ParticipantsRepository;
import com.example.demo.ServicesInterfaces.ParticipantsServiceInterface;

@Service
public class ParticipantsService implements ParticipantsServiceInterface {

	@Autowired
	ParticipantsRepository participantsRepository;

	@Override
	public Participants create(Participants participants) {
		// TODO Auto-generated method stub
		return participantsRepository.save(participants);
	}

	@Override
	public List<Participants> findAll() {
		// TODO Auto-generated method stub
		return participantsRepository.findAll();
	}

	@Override
	public List<Participants> searchNomAndPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return participantsRepository.findByNomAndPrenom(nom, prenom);
	}

	@Override
	public List<Participants> searchNomOrPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return participantsRepository.findByNomOrPrenom(nom, prenom);
	}

	@Override
	public void deleteParticipants(int id) {
		// TODO Auto-generated method stub
		participantsRepository.deleteById(id);
	}

	@Override
	public List<Participants> searchByMail(String email) {
		// TODO Auto-generated method stub
		return participantsRepository.findByEmail(email);
	}

}
