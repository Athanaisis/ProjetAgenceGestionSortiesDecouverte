package com.example.demo.RestControllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Admin;
import com.example.demo.Repositories.AdminRepository;

@RestController
@RequestMapping("api/administrateur")
public class AdminRestControllers {

	@Autowired
	AdminRepository adminRepository;

	@GetMapping
	public List<Admin> getAll() {
		return adminRepository.findAll();

	}

	@PostMapping
	public Admin addProduct(@RequestBody @Valid Admin admin) {
		return adminRepository.save(admin);
	}

	@GetMapping("/{id}")
	public Admin getOneAdmin(@PathVariable String login) {
		return (Admin) adminRepository.findByLogin(login); // la méthode retourne optional par defaut => get transforme
															// le result en object
	}

	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable String login) {
		adminRepository.deleteById(login);

	}

}
