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

import com.example.demo.Models.Sorties;
import com.example.demo.Repositories.SortiesRepository;

@RestController
@RequestMapping("api/sorties")
public class SortiesRestControllers {

	@Autowired
	SortiesRepository sortiesRepository;

	@GetMapping
	public Page<Sorties> getAllSorties(Pageable pageable) {
		return sortiesRepository.findAll(pageable);

	}

	@PostMapping
	public Sorties addSortie(@RequestBody @Valid Sorties produit) {
		return sortiesRepository.save(produit);
	}

	@GetMapping("/{id}")
	public Sorties getOneSortie(@PathVariable int id) {
		return sortiesRepository.findById(id).get(); // la méthode retourne optional par defaut => get transforme le
														// result en object
	}

	@DeleteMapping("/{id}")
	public void deleteSortie(@PathVariable int id) {
		sortiesRepository.deleteById(id);

	}

}
