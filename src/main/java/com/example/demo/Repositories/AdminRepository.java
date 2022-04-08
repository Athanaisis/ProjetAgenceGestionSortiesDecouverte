package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {

	// La recherche des admins par login, nom

	public Admin findByLogin(String login);

	public Admin findByNomcomplet(String nom_complet);

}
