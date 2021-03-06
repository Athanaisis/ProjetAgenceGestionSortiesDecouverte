package com.example.demo.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Admin;
import com.example.demo.Models.Role;
import com.example.demo.Repositories.AdminRepository;
import com.example.demo.Repositories.RoleRepository;
import com.example.demo.ServicesInterfaces.AccountService;

@Service
@Transactional
public class AccountServiceImplement implements AccountService {

	@Autowired
	AdminRepository adminRepository;
	@Autowired
	RoleRepository roleRepository;
	
	@Bean
	// avoir un BCryptEncoder qui est initialisé une et une seule fois
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();

	}
	

	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub

		String hashPW = this.getBCPE().encode(admin.getPassword()); // hashPW = le mot de passe crypté
		System.out.print(hashPW);
		admin.setPassword(hashPW);
		return adminRepository.save(admin);
	}

	@Override
	public Role saveRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Override
	public void addRoleToAdmin(String login, String roleName) {
		// TODO Auto-generated method stub
		Role role = (Role) roleRepository.findByRolename(roleName);
		Admin admin1 = (Admin) adminRepository.findByLogin(login);
		admin1.getRoles().add(role);
		adminRepository.save(admin1);
	}

	@Override
	public List<Admin> findAdmins(){
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}
public Admin findbynom(String nom)
{
return  adminRepository.findByNomcomplet(nom);	
}

	@Override
	public List<Role> findRoles() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}
	
}
