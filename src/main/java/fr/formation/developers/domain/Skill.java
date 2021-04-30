package fr.formation.developers.domain;

public class Skill {
	private String name;
	
	public Skill() {
		
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getterName() {
		return this.name;
	}
	@Override
	public String toString() {
		return "Skill [name=" + name + "]";
	}
	
	
	
	/*public String toString() {
		return '['+ "le skill est" + this.name + ']';
	}*/
	
	
	
}
