package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Models.Recommandation;
import com.example.demo.Repositories.RecommandationRepository;
import com.example.demo.ServicesInterfaces.RecommandationServiceInterface;

public class RecommandationService implements RecommandationServiceInterface {
	@Autowired
	RecommandationRepository recommandationRepository;

	@Override
	public Recommandation create(Recommandation reco) {
		// TODO Auto-generated method stub
		return recommandationRepository.save(reco);
	}

	@Override
	public List<Recommandation> findAll() {
		// TODO Auto-generated method stub
		return recommandationRepository.findAll();
	}

	@Override
	public void deleteRecommandation(int id) {
		// TODO Auto-generated method stub
		recommandationRepository.deleteById(id);
	}

}
