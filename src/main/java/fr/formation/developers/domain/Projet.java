package fr.formation.developers.domain;

import java.time.LocalDate;

import javax.validation.constraints.Size;

public class Projet {
	private String nom;
	private String description;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private int montant;
	
	public Projet(){
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "Projet [nom=" + nom + ", description=" + description + ", dateDebut=" + dateDebut + ", dateFin="
				+ dateFin + ", montant=" + montant + "]";
	}
	
	
}
