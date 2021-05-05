package fr.formation.developers.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Equipe {
	@NotNull 
	@Size(min=0,max=255)
	private String nom;
	@NotNull
	private boolean agile;
	public Equipe(){
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean isAgile() {
		return agile;
	}
	public void setAgile(boolean agile) {
		this.agile = agile;
	}
	@Override
	public String toString() {
		return "Equipe [nom=" + nom + ", agile=" + agile + "]";
	}
	
}
