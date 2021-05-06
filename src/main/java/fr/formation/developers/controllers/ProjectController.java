package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.Project;
import fr.formation.developers.domain.ProjectCreate;
import fr.formation.developers.domain.ProjectUpdate;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@PostMapping
	public void createProject ( @Valid @RequestBody ProjectCreate project) {
		System.out.println("le projet de nom "+ project.getName()+ " est de description "+ project.getDescription()+ " de date de début " + project.getDateBegin()+ " et de budget annuel de "+ project.getMoneyAnnual()+" euros");
		
	}
	
	@PatchMapping("{name}/description/moneyannual")
	public void updateProject (@PathVariable("name") String name,@Valid @RequestBody ProjectUpdate project) {
		System.out.println("le projet de nom " +name+" est de description " + project.getDescription()+" et de budget annuel " + project.getMoneyAnnual() + " euros ");
	}
}
