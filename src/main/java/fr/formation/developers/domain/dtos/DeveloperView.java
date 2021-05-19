package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

public class DeveloperView {

    // Field "pseudo"
    String pseudo;
    // Field "name"
    String name;
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
