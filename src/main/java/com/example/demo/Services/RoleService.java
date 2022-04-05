package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Models.Role;
import com.example.demo.Repositories.RoleRepository;
import com.example.demo.ServicesInterfaces.RoleServiceInterface;

public class RoleService implements RoleServiceInterface {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public Role create(Role role_name) {
		// TODO Auto-generated method stub
		return roleRepository.save(role_name);
	}

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public void deleteRole(String id) {
		// TODO Auto-generated method stub
		roleRepository.deleteById(id);
	}

}
