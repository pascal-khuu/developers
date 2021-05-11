package fr.formation.developers.domain;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.NotNull;

import fr.formation.developers.validation.DateNaissance;

public class DeveloperCreate {
	
	// Field "pseudo" (obligatory)
	@NotNull
	String pseudo;
	// Field "name" (obligatory)
	@NotNull
	String name;
	// Field "firstname" (obligatory)
	@NotNull
	String firstname;
	// Field "birthdate" (obligatory)
	@DateNaissance
	LocalDate birthDate;
	
	
	// Constructor
	public DeveloperCreate() {
	}

	// Getters and Setters

	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String alias) {
		this.pseudo = alias;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(LocalDate birthdate) {
		this.birthDate = birthdate;
	}

	// Redefinition of toString()
	@Override
	public String toString() {
		return "Developer [alias=" + pseudo + ", name=" + name + ", firstname=" + firstname + ", birthdate=" + birthDate
				+ "]";
	}
	
	
	

	
	
	
	
	
}
