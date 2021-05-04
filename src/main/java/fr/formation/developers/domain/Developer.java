package fr.formation.developers.domain;

import java.time.LocalDate;
import java.util.Date;

public class Developer {
	// fields 
	String alias;
	String name;
	String firstname;
	LocalDate birthdate;
	
	
	// constructor
	public Developer() {
	}

	// getters && Setters

	public String getAlias() {
		return alias;
	}


	public void setAlias(String alias) {
		this.alias = alias;
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
		return "Developer [alias=" + alias + ", name=" + name + ", firstname=" + firstname + ", birthdate=" + birthdate
				+ "]";
	}
	
	
	

	// method toString()
	
	
	
	
}
