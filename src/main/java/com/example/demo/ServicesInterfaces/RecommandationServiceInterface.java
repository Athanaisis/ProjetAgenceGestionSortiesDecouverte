package com.example.demo.ServicesInterfaces;

import java.util.List;

import com.example.demo.Models.Recommandation;

public interface RecommandationServiceInterface {

	public Recommandation create(Recommandation reco);

	public List<Recommandation> findAll();

	public void deleteRecommandation(int id);

}
