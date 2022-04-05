package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Evaluation;
import com.example.demo.Repositories.EvaluationRepository;
import com.example.demo.ServicesInterfaces.EvaluationServiceInterface;

@Service
public class EvaluationService implements EvaluationServiceInterface {

	@Autowired
	EvaluationRepository evaluationRepository;

	@Override
	public Evaluation create(Evaluation eval) {
		// TODO Auto-generated method stub
		return evaluationRepository.save(eval);
	}

	@Override
	public List<Evaluation> findAll() {
		// TODO Auto-generated method stub
		return evaluationRepository.findAll();
	}

	@Override
	public void deleteEvaluation(int id) {
		// TODO Auto-generated method stub
		evaluationRepository.deleteById(id);
	}

	@Override
	public List<Evaluation> findOrder() {
		// TODO Auto-generated method stub
		return evaluationRepository.findByNoteOrderDesc();
	}

}
