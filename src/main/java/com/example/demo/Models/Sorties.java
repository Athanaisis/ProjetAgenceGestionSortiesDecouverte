package com.example.demo.Models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
public class Sorties implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotEmpty
	private String titre;

	@NotEmpty
	private String destination;

	@NotEmpty
	private String depart;

	@NotEmpty
	private String retour;

	@NotEmpty
	@Lob
	private String description;

	@Column(nullable = false)
	@Min(value = 101)
	private double prix;

	@OneToOne(cascade = CascadeType.ALL) // name=> nom de la colonne dans la bdd / reference => champs existant dans
											// l'entity à pointer
	@JoinColumn(name = "responsable", referencedColumnName = "nomcomplet")
	private Admin admin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getRetour() {
		return retour;
	}

	public void setRetour(String retour) {
		this.retour = retour;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Sorties() {
		super();
	}

	public Sorties(@NotEmpty String titre, @NotEmpty String destination, @NotEmpty String depart,
			@NotEmpty String retour, @NotEmpty String description, @NotEmpty @Min(101) double prix, Admin admin) {
		super();
		this.titre = titre;
		this.destination = destination;
		this.depart = depart;
		this.retour = retour;
		this.description = description;
		this.prix = prix;
		this.admin = admin;
	}

	public Sorties(@NotEmpty String titre, @NotEmpty String destination, @NotEmpty String depart,
			@NotEmpty String retour, @NotEmpty String description, @NotEmpty @Min(101) double prix) {
		super();
		this.titre = titre;
		this.destination = destination;
		this.depart = depart;
		this.retour = retour;
		this.description = description;
		this.prix = prix;
	}

}
