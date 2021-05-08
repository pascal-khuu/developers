package fr.formation.developers.domain;

import javax.validation.constraints.NotNull;

public class Skill {
	
	// Field "name" (obligatory)
	@NotNull
	private String name;
	
	// Constructor
	public Skill() {
		
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
