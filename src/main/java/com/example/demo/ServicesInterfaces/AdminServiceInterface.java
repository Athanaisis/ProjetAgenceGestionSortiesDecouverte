package com.example.demo.ServicesInterfaces;

import java.util.List;

import com.example.demo.Models.Admin;

public interface AdminServiceInterface {

	public Admin create(Admin admin);

	public List<Admin> findAll();

	public List<Admin> searchByLogin(String login);

	public void deleteAdmin(String login);

	public List<Admin> findByNom(String nom_complet);

}
