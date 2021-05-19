package fr.formation.developers.domain.dtos;

import fr.formation.developers.validation.Uppercase;

public class SkillCreate {

    // Field "name"
    @Uppercase
    private String name;

    // Constructor
    public SkillCreate() {

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
	return "Skill [name=" + name + "]";
    }

}
