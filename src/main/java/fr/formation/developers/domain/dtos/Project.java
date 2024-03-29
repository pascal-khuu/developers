package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class Project {
    // Field "name" (mandatory, at least one character, between one character and
    // 255 characters)
    @NotNull
    @NotBlank
    @Size(min = 1, max = 255)
    private String name;
    // Field "description" (mandatory, at least one character, between 100
    // characters and 1000 characters)
    @NotNull
    @NotBlank
    @Size(min = 100, max = 1000)
    private String description;
    // Field "dateBegin" (mandatory, the current date or in the future)
    @NotNull
    @FutureOrPresent
    private LocalDate dateBegin;
    // Field "dateEnd" (mandatory, date in the future)
    @Future
    @NotNull
    private LocalDate dateEnd;
    // Field "moneyAnnual" (mandatory, optional(=0) , if not optional (>0))
    @NotNull
    @PositiveOrZero
    private int moneyAnnual;

    // Constructor
    public Project() {

    }

    // Getters and Setters
    public String getName() {
	return name;
    }

    public void setName(String nom) {
	this.name = nom;
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

    public void setDateBegin(LocalDate dateDebut) {
	this.dateBegin = dateDebut;
    }

    public LocalDate getDateEnd() {
	return dateEnd;
    }

    public void setDateEnd(LocalDate dateFin) {
	this.dateEnd = dateFin;
    }

    public int getMoneyAnnual() {
	return moneyAnnual;
    }

    public void setMoneyAnnual(int montant) {
	this.moneyAnnual = montant;
    }

    // Redefinition of toString
    @Override
    public String toString() {
	return "Projet [name=" + name + ", description=" + description + ", dateBegin=" + dateBegin + ", dateEnd="
		+ dateEnd + ", money=" + moneyAnnual + "]";
    }

}
