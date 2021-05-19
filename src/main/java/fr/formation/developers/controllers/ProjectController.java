package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.ProjectClosed;
import fr.formation.developers.domain.dtos.ProjectCreate;
import fr.formation.developers.domain.dtos.ProjectUpdate;
import fr.formation.developers.services.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
	this.service = service;
    }

    /*
     * Create a project with rules on fields "name", "description", "dateBegin",
     * "moneyAnnual" of the object "projectCreate" with type "ProjectCreate"
     * (mandatory, length of a string,at least one character, date in the present or
     * in the future and optional (if not optional >0)
     */
    @PostMapping
    public void createProject(@Valid @RequestBody ProjectCreate projectCreate) {
	service.createProject(projectCreate);

    }

    /*
     * Modify the fields of the project by the name with rules on fields
     * "description" and "moneyAnnual" of the object "projectUpdate " with the type
     * "ProjectUpdate" (mandatory, length of a string,at least one character,
     * optional, if not optional moneyAnnual >0)
     */

    @PatchMapping("{name}/description/moneyannual")
    public void updateProject(@PathVariable("name") String name, @Valid @RequestBody ProjectUpdate projectUpdate) {
	service.updateProject(name, projectUpdate);

    }

    /*
     * Close a project by its name with rules on the field "dateEnd" of the object
     * "projectClose" with type "ProjectClose" (mandatory, date in the future)
     */

    @DeleteMapping("{name}/date-end")
    public void closeProject(@PathVariable("name") String name, @Valid @RequestBody ProjectClosed projectClose) {
	service.closeProject(name, projectClose);

    }

}
