package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

public class DeveloperView {

    // Field "pseudo"
    String pseudo;
    // Field "name"
    String lastname;
    // Field "firstname"
    String firstname;
    // Field "birthdate"
    LocalDate birthDate;

    // Constructor
    public DeveloperView() {
    }

    // Getters and Setters

    public String getPseudo() {
	return pseudo;
    }

    public void setPseudo(String alias) {
	this.pseudo = alias;
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

    public void setBirthDate(LocalDate birthdate) {
	this.birthDate = birthdate;
    }

    // Redefinition of toString()
    @Override
    public String toString() {
	return "Developer [alias=" + pseudo + ", name=" + lastname + ", firstname=" + firstname + ", birthdate="
		+ birthDate + "]";
    }

}
