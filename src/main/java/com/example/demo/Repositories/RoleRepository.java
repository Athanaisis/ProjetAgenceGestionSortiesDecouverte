package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

	public Role findByRolename(String role_name);
}
