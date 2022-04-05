package com.example.demo.ServicesInterfaces;

import java.util.List;

import com.example.demo.Models.Sorties;

public interface SortiesServiceInterface {

	public Sorties create(Sorties sortie);

	public List<Sorties> findAll();

	public List<Sorties> searchTitre(String titre);

	public List<Sorties> searchDestination(String destination);

	public List<Sorties> searchDepart(String depart);

	public List<Sorties> searchRetour(String retour);

	public List<Sorties> searchContenu(String contenu);

	public List<Sorties> searchPrix(double prix);

	public void deleteSorties(int id);

}
