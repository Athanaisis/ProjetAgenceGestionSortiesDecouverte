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

import com.example.demo.Models.Recommandation;
import com.example.demo.Repositories.RecommandationRepository;

@RestController
@RequestMapping("api/recommandation")
public class RecommandationRestControllers {

	@Autowired
	RecommandationRepository recommandationRepository;

	@GetMapping
	public Page<Recommandation> getAllRecommandations(Pageable pageable) {
		return recommandationRepository.findAll(pageable);
		// pour afficher un nombre d'éléments (liste avec pagination)
	}

	@PostMapping
	public Recommandation createRecommandation(@Valid @RequestBody Recommandation post) {
		return recommandationRepository.save(post);
	}

	@DeleteMapping("/{id}")
	public void deleteSortie(@PathVariable int id) {
		recommandationRepository.deleteById(id);

	}
}