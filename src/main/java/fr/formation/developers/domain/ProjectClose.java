package fr.formation.developers.domain;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;

public class ProjectClose {
	// Champ de la classe ProjectClose
	@NotNull
	@Future
	private LocalDate dateEnd;
	
	// COnstructeur de la classe ProjectClose
	public ProjectClose() {
		
	}

	// Getters et Setters de la classe ProjectClose
	public LocalDate getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(LocalDate dateEnd) {
		this.dateEnd = dateEnd;
	}

	// redéfinition de la méthode toString de la classe ProjectClose
	@Override
	public String toString() {
		return "ProjectClose [dateEnd=" + dateEnd + "]";
	}
	
	
	
	
	
}
