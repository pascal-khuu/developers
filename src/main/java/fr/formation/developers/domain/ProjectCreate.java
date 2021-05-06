package fr.formation.developers.domain;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProjectCreate {
	//Créer un projet avec les champs name, description, dateBegin et moneyAnnual
	@NotNull
	@Size(min=1,max=255)
	private String name;
	@NotNull
	@Size(min=100,max=1000)
	private String description;
	@NotNull
	private LocalDate dateBegin;
	@NotNull
	@Min(value=1)
	private int moneyAnnual;
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
	@Override
	public String toString() {
		return "ProjectCreate [name=" + name + ", description=" + description + ", dateBegin=" + dateBegin
				+ ", moneyAnnual=" + moneyAnnual + "]";
	}
	
}
