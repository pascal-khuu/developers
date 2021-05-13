package fr.formation.developers.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Team {
    // Field "name" (mandatory, between one character and 255 characters)
    @NotNull
    @Size(min = 1, max = 255)
    private String name;
    // Field "agility" (mandatory)
    @NotNull
    private boolean agility;

    // Constructor
    public Team() {

    }

    // Getters and Setters
    public String getName() {
	return name;
    }

    public void setName(String nom) {
	this.name = nom;
    }

    public boolean isAgility() {
	return agility;
    }

    public void setAgility(boolean agile) {
	this.agility = agile;
    }

    // Redefinition of toString
    @Override
    public String toString() {
	return "Equipe [nom=" + name + ", agile=" + agility + "]";
    }

}
