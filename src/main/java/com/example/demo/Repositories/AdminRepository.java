package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {

	// La recherche des admins par login, nom

	public List<Admin> findByLogin(String login);

	public List<Admin> findByNomcomplet(String nom_complet);

}
