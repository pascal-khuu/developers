package fr.formation.developers.domain.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "developers")
public class Developer {
    // Field "pseudo" (mandatory)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "pseudo")
    String pseudo;
    // Field "name" (mandatory)
    @Column(name = "last_name")
    String lastname;
    // Field "firstname" (mandatory)
    @Column(name = "first_name")
    String firstname;

    @Column(name = "birth_date")
    // Field "birthdate" (mandatory)
    // personal annotation >=18 years
    LocalDate birthDate;

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
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

    @Override
    public String toString() {
	return "Developer [id=" + id + ", pseudo=" + pseudo + ", name=" + lastname + ", firstname=" + firstname
		+ ", birthDate=" + birthDate + "]";
    }

}
