package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Evaluation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotEmpty
	private String titre;

	@NotEmpty
	@Size(min = 1, max = 5)
	private int note;

	@NotEmpty
	@Lob
	private String remarques;

	@Column(nullable = true)
	@NotEmpty
	private String nom;

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

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getRemarques() {
		return remarques;
	}

	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Evaluation() {
		super();
	}

	public Evaluation(@NotEmpty String titre, @NotEmpty @Size(min = 1, max = 5) int note, @NotEmpty String remarques,
			@NotEmpty String nom) {
		super();
		this.titre = titre;
		this.note = note;
		this.remarques = remarques;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Evaluation [id=" + id + ", titre=" + titre + ", note=" + note + ", remarques=" + remarques + ", nom="
				+ nom + "]";
	}

}
