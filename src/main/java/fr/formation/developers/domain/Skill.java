package fr.formation.developers.domain;

public class Skill {
	private String name;
	
	public Skill() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Skill [name=" + name + "]";
	}
	
	

	
	
}
