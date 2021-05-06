package fr.formation.developers.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TeamName {
	@NotNull
	@Size(min=1,max=255)
	private String name;
	public TeamName() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "TeamName [name=" + name + "]";
	}
	
}
