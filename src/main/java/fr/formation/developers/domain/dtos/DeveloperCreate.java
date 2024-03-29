package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import fr.formation.developers.validation.BirthDate;

public class DeveloperCreate {

    // Field "pseudo" (mandatory)
    @NotNull
    String pseudo;
    // Field "name" (mandatory)
    @NotNull
    String lastname;
    // Field "firstname" (mandatory)
    @NotNull
    String firstname;
    // Field "birthdate" (mandatory)
    @BirthDate
    // personal annotation >=18 years
    LocalDate birthDate;

    // Constructor
    public DeveloperCreate() {
    }

    // Getters and Setters

    // Redefinition of toString()
    @Override
    public String toString() {
	return "Developer [pseudo=" + pseudo + ", lastname=" + lastname + ", firstname=" + firstname + ", birthdate="
		+ birthDate + "]";
    }

    public String getPseudo() {
	return pseudo;
    }

    public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
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

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

}
