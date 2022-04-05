package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

	public List<Role> findByRolename(String role_name);
}
