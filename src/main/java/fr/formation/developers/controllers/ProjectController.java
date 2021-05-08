package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.Project;
import fr.formation.developers.domain.ProjectClose;
import fr.formation.developers.domain.ProjectCreate;
import fr.formation.developers.domain.ProjectUpdate;

@RestController
@RequestMapping("/project")
public class ProjectController {

	//Create a project with rules on fields "name", "description", "dateBegin", "moneyAnnual" 
	// of the object "projectCreate" with type "ProjectCreate" 
	//(obligatory, length of character,at least one character, date at the present or at the future and optionnal)
	@PostMapping
	public void createProject(@Valid @RequestBody ProjectCreate projectCreate) {
		System.out.println("The project of name " + projectCreate.getName() + " has a description " + projectCreate.getDescription()
				+ " with the date of beginning " + projectCreate.getDateBegin() + " and with annual money of " + projectCreate.getMoneyAnnual()
				+ " euros");

	}

	// Modify the fields of the project by the name with rules on fields "description" and "moneyAnnual" of  the object 
	// "projectUpdate " with type "ProjectUpdate"  
	// (obligatory, length of character,at least one character,  optionnal, if not optionnal moneyAnnual >0)
	@PatchMapping("{name}/description/moneyannual")
	public void updateProject(@PathVariable("name") String name, @Valid @RequestBody ProjectUpdate projectUpdate) {
		System.out.println("the project of name " + name + " has a description " + projectUpdate.getDescription()
				+ " and the annual money is " + projectUpdate.getMoneyAnnual() + " euros ");
	}

	// Close a project by its name with rules on the field "dateEnd" of the object "projectClose" with type "ProjectClose"
	// (obligatory, date at the future)
	@DeleteMapping("{name}/date-end")
	public void closeProject(@PathVariable("name") String name, @Valid @RequestBody ProjectClose projectClose) {
		System.out.println(" the project of name " + name + " is closed at " + projectClose.getDateEnd() + " . ");
	}
}
