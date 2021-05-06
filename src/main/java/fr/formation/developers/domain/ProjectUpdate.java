package fr.formation.developers.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProjectUpdate {
	@NotNull
	@Size(min=100,max=1000)
	private String description;
	@NotNull
	@Min(value=1)
	private int moneyAnnual;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getMoneyAnnual() {
		return moneyAnnual;
	}
	public void setMoneyAnnual(int moneyAnnual) {
		this.moneyAnnual = moneyAnnual;
	}
	@Override
	public String toString() {
		return "ProjectUpdate [description=" + description + ", moneyAnnual=" + moneyAnnual + "]";
	}
	
	
}
