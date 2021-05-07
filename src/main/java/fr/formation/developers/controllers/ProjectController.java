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
		System.out.println("le projet de nom " + project.getName() + " est de description " + project.getDescription()
				+ " de date de début " + project.getDateBegin() + " et de budget annuel de " + project.getMoneyAnnual()
				+ " euros");

	}

	// Modifier les propriétés d'un projet par son nom ave la gestion des règles sur
	// les champs Description et Budget annuel de la classe ProjectUpdate
	@PatchMapping("{name}/description/moneyannual")
	public void updateProject(@PathVariable("name") String name, @Valid @RequestBody ProjectUpdate project) {
		System.out.println("le projet de nom " + name + " est de description " + project.getDescription()
				+ " et de budget annuel " + project.getMoneyAnnual() + " euros ");
	}

	// Clôturer un projet par son nom
	@DeleteMapping("{name}/date-end")
	public void closeProject(@PathVariable("name") String name, @Valid @RequestBody ProjectClose projectClose) {
		System.out.println(" le projet de nom " + name + " est clôturé à la date " + projectClose.getDateEnd() + " . ");
	}
}
