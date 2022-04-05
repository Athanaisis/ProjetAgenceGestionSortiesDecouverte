package com.example.demo.ServicesInterfaces;

import java.util.List;

import com.example.demo.Models.Participants;

public interface ParticipantsServiceInterface {

	public Participants create(Participants participants);

	public List<Participants> findAll();

	public List<Participants> searchNomAndPrenom(String nom, String prenom);

	public List<Participants> searchNomOrPrenom(String nom, String prenom);

	public void deleteParticipants(int id);

	public List<Participants> searchByMail(String email);
}
