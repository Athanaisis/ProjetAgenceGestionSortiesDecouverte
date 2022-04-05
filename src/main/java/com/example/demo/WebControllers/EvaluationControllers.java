package com.example.demo.WebControllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Models.Evaluation;
import com.example.demo.Repositories.EvaluationRepository;

@Controller
@RequestMapping("evaluations")
public class EvaluationControllers {

	@Autowired
	EvaluationRepository evaluationRepository;

	@GetMapping("")
	public String welcome(Model m) {
		List<Evaluation> eval = evaluationRepository.findAll();
		Evaluation eval1 = new Evaluation();
		m.addAttribute("eval", eval1);
		m.addAttribute("eval", eval);
		return "Evaluation.html";
	}

	@PostMapping("add")
	public String addEvaluation(@Valid Evaluation evaluation, BindingResult result) {

		if (result.hasErrors())
			return "Evaluation";
		else {
			evaluationRepository.save(evaluation);
			return "redirect:/evaluation";
		}

	}

	@GetMapping("liste")
	public String getListe(Model model) {
		List<Evaluation> ev = evaluationRepository.findAll();
		model.addAttribute("evaluation", ev);
		return "listEvaluation";
	}
}
