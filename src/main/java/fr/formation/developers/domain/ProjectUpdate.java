package fr.formation.developers.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class ProjectUpdate {
	// Champs de la classe ProjectUpdate
	@NotNull
	@Size(min=100,max=1000)
	@NotBlank
	private String description;
	@PositiveOrZero
	private int moneyAnnual;
	
	// Constructeur de la classe ProjectUpdate
	public ProjectUpdate() {
		
	}
	// Getters et setters de la classe ProjectUpdate
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getMoneyAnnual() {
		return moneyAnnual;
	}
	public void setMoneyAnnual(int moneyAnnual) {
		this.moneyAnnual = moneyAnnual;
	}
	// Redéfinition de la méthode ToString de la classe ProjectUpdate
	@Override
	public String toString() {
		return "ProjectUpdate [description=" + description + ", moneyAnnual=" + moneyAnnual + "]";
	}
	
	
}
