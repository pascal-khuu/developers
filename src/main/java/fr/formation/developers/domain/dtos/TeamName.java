package fr.formation.developers.domain.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TeamName {
    // Class TeamName with one field "name"
    // Field "name" (mandatory, between one character and 255 characters, at least
    // one character)
    @NotNull
    @Size(min = 1, max = 255)
    @NotBlank
    private String name;

    // Constructor
    public TeamName() {

    }

    // Getters and Setters
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    // Redefinition of toString
    @Override
    public String toString() {
	return "TeamName [name=" + name + "]";
    }

}
