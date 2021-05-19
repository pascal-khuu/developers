package fr.formation.developers.domain.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class ProjectUpdate {
    // Class "ProjectUpdate with two fields "description" and "moneyAnnual"
    // Field "description" (Mandatory, between one character and 255 characters, at
    // least one character)
    @NotNull
    @Size(min = 100, max = 1000)
    @NotBlank
    private String description;
    // Field "moneyAnnual" (positive (not optional) or 0 (optional))
    @PositiveOrZero
    private int moneyAnnual;

    // Constructor
    public ProjectUpdate() {

    }

    // Getters and setters
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

    // Redefinition of toString
    @Override
    public String toString() {
	return "ProjectUpdate [description=" + description + ", moneyAnnual=" + moneyAnnual + "]";
    }

}
