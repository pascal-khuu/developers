package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.ProjectClosed;
import fr.formation.developers.domain.ProjectCreate;
import fr.formation.developers.domain.ProjectUpdate;

@RestController
@RequestMapping("/project")
public class ProjectController {

    /*
     * Create a project with rules on fields "name", "description", "dateBegin",
     * "moneyAnnual" of the object "projectCreate" with type "ProjectCreate"
     * (mandatory, length of a string,at least one character, date in the present or
     * in the future and optional (if not optional >0)
     */
    @PostMapping
    public void createProject(@Valid @RequestBody ProjectCreate projectCreate) {
	System.out.println("The project with the name " + projectCreate.getName() + " has a description "
		+ projectCreate.getDescription() + " with the start date of " + projectCreate.getDateBegin()
		+ " and with an annual budget of " + projectCreate.getMoneyAnnual() + " euros");

    }

    /*
     * Modify the fields of the project by the name with rules on fields
     * "description" and "moneyAnnual" of the object "projectUpdate " with the type
     * "ProjectUpdate" (mandatory, length of a string,at least one character,
     * optional, if not optional moneyAnnual >0)
     */
    @PatchMapping("{name}/description/moneyannual")
    public void updateProject(@PathVariable("name") String name, @Valid @RequestBody ProjectUpdate projectUpdate) {
	System.out.println("the project of name " + name + " has a description " + projectUpdate.getDescription()
		+ " and the annual money is " + projectUpdate.getMoneyAnnual() + " euros ");
    }

    /*
     * Close a project by its name with rules on the field "dateEnd" of the object
     * "projectClose" with type "ProjectClose" (mandatory, date in the future)
     */
    @DeleteMapping("{name}/date-end")
    public void closeProject(@PathVariable("name") String name, @Valid @RequestBody ProjectClosed projectClose) {
	System.out.println(" the project of name " + name + " is closed at " + projectClose.getDateEnd() + " . ");
    }
}
