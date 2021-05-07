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

	// Créer un projet avec la gestion des règles sur le champ nom, description,
	// date de début et budget annuel de la classe ProjectCreate
	@PostMapping
	public void createProject(@Valid @RequestBody ProjectCreate project) {
		System.out.println("The project of name " + project.getName() + " has a description " + project.getDescription()
				+ " with date of beginning " + project.getDateBegin() + " and annual money " + project.getMoneyAnnual()
				+ " euros");

	}

	// Modifier les propriétés d'un projet par son nom ave la gestion des règles sur
	// les champs Description et Budget annuel de la classe ProjectUpdate
	@PatchMapping("{name}/description/moneyannual")
	public void updateProject(@PathVariable("name") String name, @Valid @RequestBody ProjectUpdate project) {
		System.out.println("the project of name " + name + " has a description " + project.getDescription()
				+ " and annual money " + project.getMoneyAnnual() + " euros ");
	}

	// Clôturer un projet par son nom
	@DeleteMapping("{name}/date-end")
	public void closeProject(@PathVariable("name") String name, @Valid @RequestBody ProjectClose projectClose) {
		System.out.println(" the project of name " + name + " is closed at " + projectClose.getDateEnd() + " . ");
	}
}
