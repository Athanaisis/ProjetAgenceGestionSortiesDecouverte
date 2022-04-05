package com.example.demo.Calculs;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

import org.springframework.web.context.annotation.RequestScope;

import com.example.demo.Models.Evaluation;
import com.example.demo.Models.Participants;
import com.example.demo.Models.Recommandation;
import com.example.demo.Models.Sorties;

@ManagedBean
@RequestScope
public class MoyenneEtTotal {

	// 1. // Déclaration des variables
	private int nbParticipants, notesEvaluation, nbRecommandations;
	private int prix;

	List<Sorties> listSorties = new ArrayList<Sorties>();

	public int getNbParticipants() {
		return nbParticipants;
	}

	public void setNbParticipants(int nbParticipants) {
		this.nbParticipants = nbParticipants;
	}

	public int getNotesEvaluation() {
		return notesEvaluation;
	}

	public void setNotesEvaluation(int notesEvaluation) {
		this.notesEvaluation = notesEvaluation;
	}

	public int getNbRecommandations() {
		return nbRecommandations;
	}

	public void setNbRecommandations(int nbRecommandations) {
		this.nbRecommandations = nbRecommandations;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public List<Sorties> getListSorties() {
		return listSorties;
	}

	public void setListSorties(List<Sorties> listSorties) {
		this.listSorties = listSorties;
	}

	// a. Calculer la moyenne des prix des sorties (parcours du tableau sortie)

	public double moyennePrix(Sorties prix) {
		double sommePrix = 0;
		this.prix = 0;

		while (prix.getPrix() != 0) {

			sommePrix = +prix.getPrix();
			++this.prix;
		}
		return sommePrix / this.prix;
	}

//b. Calculer le nombre total des participants

	public int nbTotalParticipants(Participants nbParticipants) {
		int sommeParticipants = 0;
		this.nbParticipants = 0;

		while (nbParticipants.getId() != 0) {
			sommeParticipants = +nbParticipants.getId();
			++this.nbParticipants;

		}

		return sommeParticipants;
	}

	// c. Calculer la moyenne des évaluations

	public double moyenneNotes(Evaluation note) {
		int sommeNotes = 0;
		this.notesEvaluation = 0;

		while (note.getNote() >= 0) {
			sommeNotes = +note.getNote();
			++this.notesEvaluation;

		}

		return sommeNotes / this.notesEvaluation;
	}

	// d. Afficher la moyenne des recommandations

	public void moyenneRecommandation(Recommandation reco) {
		int sommeReco = 0;
		this.nbRecommandations = 0;

		while (reco.getId() >= 0) {
			sommeReco = +reco.getId();
			++this.nbRecommandations;

		}
		System.out.println(sommeReco / this.nbRecommandations);

	}

}
