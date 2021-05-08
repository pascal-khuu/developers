package fr.formation.developers.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TeamName {
	// Class TeamName with one field "name"
	// Name (obligatory, between one character and 255 characters)
	@NotNull
	@Size(min=1,max=255)
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
