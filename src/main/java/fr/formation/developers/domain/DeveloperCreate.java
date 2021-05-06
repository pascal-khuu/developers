package fr.formation.developers.domain;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.NotNull;

public class DeveloperCreate {
	// fields 
	@NotNull
	String pseudo;
	@NotNull
	String name;
	@NotNull
	String firstname;
	@NotNull
	LocalDate birthdate;
	
	
	// constructor
	public DeveloperCreate() {
	}

	// getters && Setters

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


	public LocalDate getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Developer [alias=" + pseudo + ", name=" + name + ", firstname=" + firstname + ", birthdate=" + birthdate
				+ "]";
	}
	
	
	

	// method toString()
	
	
	
	
}
