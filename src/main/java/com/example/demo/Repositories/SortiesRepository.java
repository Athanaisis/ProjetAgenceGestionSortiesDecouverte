package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Sorties;

public interface SortiesRepository extends JpaRepository<Sorties, Integer> {

	// LA RECHERCHE DES SORTIES PAR TOUS LES CHAMPS

	// Une recherche par titre
	public List<Sorties> findByTitre(String titre);

	// Une recherche par destination
	public List<Sorties> findByDestination(String destination);

	// Une recherche par départ
	public List<Sorties> findByDepart(String depart);

	// Une recherche par retour
	public List<Sorties> findByRetour(String retour);

	// Une recherche par contenu de la description
	List<Sorties> findByDescriptionContaining(String contenu);

	// Une recherche par prix
	public List<Sorties> findByPrix(double prix);

	// LE TRI ET PAGINATION DES SORTIES PAR TOUS LES CHAMPS

	// Par Id
	Page<Sorties> findById(int id, Pageable pageable);

	// Par Titre
	Page<Sorties> findByTitre(String titre, Pageable pageable);

	// Par destination
	Page<Sorties> findByDestination(String destination, Pageable pageable);

	// Par départ
	Page<Sorties> findByDepart(String depart, Pageable pageable);

	// Par retour
	Page<Sorties> findByRetour(String retour, Pageable pageable);

	// Par contenu de la description
	Page<Sorties> findByDescriptionContaining(String contenu, Pageable pageable);

	// Par prix
	Page<Sorties> findByPrix(double prix, Pageable pageable);
}
