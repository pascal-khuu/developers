package fr.formation.developers.domain;

public class TeamName {
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
