package fr.formation.developers.domain;

import java.time.LocalDate;
import java.util.Date;

public class Developpeur {
	// fields 
	String pseudo;
	String nom;
	String prenom;
	LocalDate dateNaissance;
	
	
	// constructor
	public Developpeur() {
	}
	
	// getters && Setters
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
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
	
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	// method toString()
	@Override
	public String toString() {
		return "Developpeur [pseudo=" + pseudo + ", nom=" + nom + ", prenom=" + prenom + ", date=" + dateNaissance + "]";
	}
	
	
	
}
