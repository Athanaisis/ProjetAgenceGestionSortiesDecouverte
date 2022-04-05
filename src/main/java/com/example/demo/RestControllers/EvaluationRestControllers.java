package com.example.demo.RestControllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Evaluation;
import com.example.demo.Repositories.EvaluationRepository;

@RestController
@RequestMapping("api/evaluation")
public class EvaluationRestControllers {

	@Autowired
	EvaluationRepository evaluationRepository;

	@GetMapping
	public Page<Evaluation> getAllEvaluation(Pageable pageable) {
		return evaluationRepository.findAll(pageable);

	}

	@PostMapping
	public Evaluation addEvaluation(@RequestBody @Valid Evaluation evaluation) {
		return evaluationRepository.save(evaluation);
	}

	@GetMapping("/{id}")
	public Evaluation getOneEvaluation(@PathVariable int id) {
		return evaluationRepository.findById(id).get(); // la méthode retourne optional par defaut => get transforme le
														// result en object
	}

	@DeleteMapping("/{id}")
	public void deleteEvaluation(@PathVariable int id) {
		evaluationRepository.deleteById(id);

	}

}
