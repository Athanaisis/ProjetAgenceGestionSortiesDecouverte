package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Models.Admin;
import com.example.demo.Models.Role;
import com.example.demo.Models.Sorties;
import com.example.demo.Repositories.AdminRepository;
import com.example.demo.Repositories.EvaluationRepository;
import com.example.demo.Repositories.ParticipantsRepository;
import com.example.demo.Repositories.RecommandationRepository;
import com.example.demo.Repositories.RoleRepository;
import com.example.demo.Repositories.SortiesRepository;
import com.example.demo.Services.AccountServiceImplement;

@SpringBootApplication
public class ProjetAgenceGestionSortiesDecouverteApplication implements CommandLineRunner {

	@Autowired
	AdminRepository adminRepository;
	@Autowired
	EvaluationRepository evaluationRepository;
	@Autowired
	ParticipantsRepository participantsRepository;
	@Autowired
	RecommandationRepository recommandationRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	SortiesRepository sortiesRepository;
	@Autowired
	AccountServiceImplement accountServiceImplement;

	public static void main(String[] args) {
		SpringApplication.run(ProjetAgenceGestionSortiesDecouverteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// CREATION DU 1ER ADMINISTRATEUR
		// accountServiceImplement.saveAdmin(new
		// Admin("PremierAdmin",1,"Admin1","Jennifer EUREKA",null,null));
		// accountServiceImplement.saveRole(new Role("organisateur"));
		// accountServiceImplement.addRoleToAdmin("PremierAdmin", "organisateur");

		// CREATION DU 2EME ADMINISTRATEUR
		// accountServiceImplement.saveAdmin(new
		// Admin("DeuxièmeAdmin",1,"Admin2","Harisson MORGAN",null,null));
		// accountServiceImplement.saveRole(new Role("guide"));
		// accountServiceImplement.addRoleToAdmin("DeuxièmeAdmin", "guide");

		// CREATION DE LA 1ERE SORTIE
		// Sorties sortie1=new Sorties("Canyonning","Pyrénées Orientales","Paris le
		// 18/06/22","Paris GD Lyon le 19/06/22","Découverte du sud en canyonnig",115);
		// sortiesRepository.save(sortie1);

		// CREATION DE LA 2EME SORTIE
		// Sorties sortie2=new Sorties("Les Falaises d'Etretat","Normandie","Paris le
		// 25/06/22","Paris GD Lyon le 28/06/22","Visites les côtes en escaladant les
		// falaises",150);
		// sortiesRepository.save(sortie2);

		// CREATION DU 2EME ADMINISTRATEUR
	}

}
