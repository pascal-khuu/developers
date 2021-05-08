package fr.formation.developers.domain;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
// Represent an input with a date of birthdate
public class DeveloperUpdate {
	
	// Field "birthDate" (Obligatory)
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
