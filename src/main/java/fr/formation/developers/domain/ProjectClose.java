package fr.formation.developers.domain;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;

public class ProjectClose {
	// Class "ProjectClose" with one field "dateEnd"
	// Field "dateEnd" (Obligatory, date at future)
	@NotNull
	@Future
	private LocalDate dateEnd;
	
	// Constructor
	public ProjectClose() {
		
	}

	// Getters and setters
	public LocalDate getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(LocalDate dateEnd) {
		this.dateEnd = dateEnd;
	}

	// Redefinition of toString
	@Override
	public String toString() {
		return "ProjectClose [dateEnd=" + dateEnd + "]";
	}
	
	
	
	
	
}
