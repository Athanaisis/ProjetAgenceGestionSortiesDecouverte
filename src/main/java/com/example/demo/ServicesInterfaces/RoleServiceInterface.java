package com.example.demo.ServicesInterfaces;

import java.util.List;

import com.example.demo.Models.Role;

public interface RoleServiceInterface {

	public Role create(Role role_name);

	public List<Role> findAll();

	public void deleteRole(String id);

}
