package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Admin;
import com.example.demo.Repositories.AdminRepository;
import com.example.demo.ServicesInterfaces.AdminServiceInterface;

@Service
public class AdminService implements AdminServiceInterface {

	@Autowired
	AdminRepository adminRepository;

	@Override
	public Admin create(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	@Override
	public List<Admin> searchByLogin(String login) {
		// TODO Auto-generated method stub
		return (List<Admin>) adminRepository.findByLogin(login);
	}

	@Override
	public void deleteAdmin(String login) {
		// TODO Auto-generated method stub
		adminRepository.deleteById(login);
	}

	@Override
	public List<Admin> findByNom(String nom_complet) {
		// TODO Auto-generated method stub
		return (List<Admin>) adminRepository.findByNomcomplet(nom_complet);
	}

}
