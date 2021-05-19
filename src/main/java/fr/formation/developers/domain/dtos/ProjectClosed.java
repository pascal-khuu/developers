package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

public class ProjectClosed {
    // Class "ProjectClosed" with one field "dateEnd"
    // Field "dateEnd" (Mandatory, date in the future)
    @NotNull
    @Future
    private LocalDate dateEnd;

    // Constructor
    public ProjectClosed() {

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
