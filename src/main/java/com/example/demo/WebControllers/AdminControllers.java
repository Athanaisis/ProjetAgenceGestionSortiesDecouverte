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

import com.example.demo.Models.Admin;
import com.example.demo.Repositories.AdminRepository;

@Controller
@RequestMapping("admin")
public class AdminControllers {

	@Autowired
	AdminRepository adminRepository;

	@GetMapping("")
	public String welcome(Model m) {
		List<Admin> admin = adminRepository.findAll();
		Admin admin1 = new Admin();
		m.addAttribute("admin", admin1);
		m.addAttribute("admin", admin);
		return "Admin.html";
	}

	@PostMapping("add")
	public String addAdmin(@Valid Admin admin, BindingResult result) {

		if (result.hasErrors())
			return "Admin";
		else {
			adminRepository.save(admin);
			return "redirect:/admin";
		}

	}
}
