package fr.formation.developers.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Team {
	@NotNull 
	@Size(min=0,max=255)
	private String name;
	@NotNull
	private boolean agility;
	public Team(){
		
	}
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
	@Override
	public String toString() {
		return "Equipe [nom=" + name + ", agile=" + agility + "]";
	}
	
}
