package com.example.demo.Repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Recommandation;

public interface RecommandationRepository extends JpaRepository<Recommandation, Integer> {

	// LA PAGINATION DES RECOMMANDATIONS

	// Par Id
	Page<Recommandation> findById(int id, Pageable pageable);

	// Par Titre
	Page<Recommandation> findByTitre(String titre, Pageable pageable);

	// Par Texte
	Page<Recommandation> findByTexte(String texte, Pageable pageable);

	// Par Date
	Page<Recommandation> findByDate(String date, Pageable pageable);

}
