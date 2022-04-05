package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Models.Sorties;
import com.example.demo.Repositories.SortiesRepository;
import com.example.demo.ServicesInterfaces.SortiesServiceInterface;

public class SortiesService implements SortiesServiceInterface {

	@Autowired
	SortiesRepository sortiesRepository;

	@Override
	public Sorties create(Sorties sortie) {
		// TODO Auto-generated method stub
		return sortiesRepository.save(sortie);
	}

	@Override
	public List<Sorties> findAll() {
		// TODO Auto-generated method stub
		return sortiesRepository.findAll();
	}

	@Override
	public List<Sorties> searchTitre(String titre) {
		// TODO Auto-generated method stub
		return sortiesRepository.findByTitre(titre);
	}

	@Override
	public List<Sorties> searchDestination(String destination) {
		// TODO Auto-generated method stub
		return sortiesRepository.findByDestination(destination);
	}

	@Override
	public List<Sorties> searchDepart(String depart) {
		// TODO Auto-generated method stub
		return sortiesRepository.findByDepart(depart);
	}

	@Override
	public List<Sorties> searchRetour(String retour) {
		// TODO Auto-generated method stub
		return sortiesRepository.findByRetour(retour);
	}

	@Override
	public List<Sorties> searchContenu(String contenu) {
		// TODO Auto-generated method stub
		return sortiesRepository.findByDescriptionContaining(contenu);
	}

	@Override
	public List<Sorties> searchPrix(double prix) {
		// TODO Auto-generated method stub
		return sortiesRepository.findByPrix(prix);
	}

	@Override
	public void deleteSorties(int id) {
		// TODO Auto-generated method stub
		sortiesRepository.deleteById(id);
	}

}
