package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import fr.formation.developers.validation.DifferentNameAndDescription;

@DifferentNameAndDescription
public class ProjectCreate {
    // Class "ProjectCreate" with 4 fields "name", "description", "dateBegin" and
    // "moneyAnnual"
    // Field "name" (mandatory, between one character and 255 characters, at least
    // one character)
    @NotNull
    @Size(min = 1, max = 255)
    @NotBlank
    private String name;
    // Field "description" (mandatory, between 100 character and 1000 characters,
    // at least one character)
    @NotNull
    @Size(min = 100, max = 1000)
    @NotBlank
    private String description;
    // Field "dateBegin" (mandatory, the current date or in the future)
    @NotNull
    @FutureOrPresent
    private LocalDate dateBegin;
    // Field "moneyAnnual" (mandatory, Positive (>0) or Zero (optional))
    @NotNull
    @PositiveOrZero
    private int moneyAnnual;

    // Constructor
    public ProjectCreate() {

    }

    // Getters and Setters
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

    // Redefinition of toString
    @Override
    public String toString() {
	return "ProjectCreate [name=" + name + ", description=" + description + ", dateBegin=" + dateBegin
		+ ", moneyAnnual=" + moneyAnnual + "]";
    }

}
