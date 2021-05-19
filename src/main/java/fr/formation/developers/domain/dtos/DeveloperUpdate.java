package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

// It means an input with a date of the field "birthdate"
public class DeveloperUpdate {

    // Field "birthDate" (mandatory)
    @NotNull
    private LocalDate birthDate;

    // Constructor
    public DeveloperUpdate() {

    }

    // Getters and Setters
    public LocalDate getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

    // Redefinition of toString
    @Override
    public String toString() {
	return "DeveloperUpdate [birthDate=" + birthDate + "]";
    }

}
