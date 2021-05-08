package fr.formation.developers.domain;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProjectCreate {
	// Class "ProjectCreate" with fields "name", "description", "dateBegin" and "moneyAnnual"
	// field "name" (obligatory, at least one character, between one character and 255 characters)
	@NotNull
	@Size(min=1,max=255)
	@NotBlank
	private String name;
	// field "description" (obligatory, at least one character, between 100 character and 1000 characters)
	@NotNull
	@Size(min=100,max=1000)
	@NotBlank
	private String description;
	// field "dateBegin" (obligatory, date of the present or at future)
	@NotNull
	@FutureOrPresent
	private LocalDate dateBegin;
	// field "moneyAnnual" (obligatory, value at least one)
	@NotNull
	@Min(value=1)
	private int moneyAnnual;
	
	// Constructeur de la classe ProjectCreate
	public ProjectCreate() {
		
	}
	
	// Getters et Setters de la classe ProjectCreate
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDateBegin() {
		return dateBegin;
	}
	public void setDateBegin(LocalDate dateBegin) {
		this.dateBegin = dateBegin;
	}
	public int getMoneyAnnual() {
		return moneyAnnual;
	}
	public void setMoneyAnnual(int moneyAnnual) {
		this.moneyAnnual = moneyAnnual;
	}
	// Redéfinition de la méthode toString de la classe ProjectCreate
	@Override
	public String toString() {
		return "ProjectCreate [name=" + name + ", description=" + description + ", dateBegin=" + dateBegin
				+ ", moneyAnnual=" + moneyAnnual + "]";
	}
	
}
