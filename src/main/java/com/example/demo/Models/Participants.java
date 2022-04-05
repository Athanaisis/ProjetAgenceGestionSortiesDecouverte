package com.example.demo.Models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Participants implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	@NotBlank
	@Size(min = 5, max = 50, message = "la taille du nom est [5-50]")
	private String nom;

	@Column(nullable = false)
	@NotBlank
	@Size(min = 5, max = 50, message = "la taille du nom est [5-50]")
	private String prenom;

	@Column(nullable = false)
	@NotBlank
	private String email;

	@Column(nullable = false)
	@NotBlank
	private String telephone;

	@Column(nullable = false)
	@NotBlank
	private int age;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "id_sortie", nullable = false)
	private Sorties sorties;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Sorties getSorties() {
		return sorties;
	}

	public void setSorties(Sorties sorties) {
		this.sorties = sorties;
	}

	public Participants() {
		super();
	}

	public Participants(@NotBlank @Size(min = 5, max = 50, message = "la taille du nom est [5-50]") String nom,
			@NotBlank @Size(min = 5, max = 50, message = "la taille du nom est [5-50]") String prenom,
			@NotBlank String email, @NotBlank String telephone, @NotBlank int age, Sorties sorties) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.age = age;
		this.sorties = sorties;
	}

}
