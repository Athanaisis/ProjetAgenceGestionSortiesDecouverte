package com.example.demo.ServicesInterfaces;

import java.util.List;

import com.example.demo.Models.Evaluation;

public interface EvaluationServiceInterface {

	public Evaluation create(Evaluation eval);

	public List<Evaluation> findAll();

	public void deleteEvaluation(int id);

	public List<Evaluation> findOrder();

}
