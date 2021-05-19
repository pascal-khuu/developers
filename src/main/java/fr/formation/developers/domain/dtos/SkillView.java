package fr.formation.developers.domain.dtos;

public class SkillView {
    // Without validation
    private String name;

    public SkillView() {

    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return "SkillView [name=" + name + "]";
    }

}
