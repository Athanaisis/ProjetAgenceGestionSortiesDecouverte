package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Participants;

public interface ParticipantsRepository extends JpaRepository<Participants, Integer> {

	// LE TRI ET PAGINATION DES PARTICIPANT

	// Par Id
	Page<Participants> findById(int id, Pageable pageable);

	// Par Nom
	Page<Participants> findByNom(String nom, Pageable pageable);

	// Par Prénom
	Page<Participants> findByPrenom(String prenom, Pageable pageable);

	// Par Email
	Page<Participants> findByEmail(String email, Pageable pageable);

	// Par Téléphone
	Page<Participants> findByTelephone(String telephone, Pageable pageable);

	// Par Age
	Page<Participants> findByAge(int age, Pageable pageable);

	// LA RECHERCHE DES PARTICIPANT PAR NOM ET PRENOM
	public List<Participants> findByNomAndPrenom(String nom, String prenom);

	// LA RECHERCHE DES PARTICIPANT PAR NOM OU PRENOM
	public List<Participants> findByNomOrPrenom(String nom, String prenom);

	// LA RECHERCHE DES PARTICIPANT PAR EMAIL
	public List<Participants> findByEmail(String email);

}
