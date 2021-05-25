package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;
import fr.formation.developers.services.DeveloperService;

@RestController
public class DeveloperController {

    private final DeveloperService service;

    public DeveloperController(DeveloperService service) {
	this.service = service;
    }

    // Create with all attributes of developer
    @PostMapping("/developers")
    public void create(@Valid @RequestBody DeveloperCreate developer) {
	System.out.println("call in controller");
	service.create(developer);
    }

    // Access to all attributes of developer with pseudo
    @GetMapping("developers/{pseudo}")
    public DeveloperView getByPseudo(@PathVariable("pseudo") String pseudo) {
	return service.getByPseudo(pseudo);
    }

    // Modify birthdate of a developer by its pseudo
    @PatchMapping("developers/{pseudo}/birth-date")
    public void updateBirthDate(@PathVariable("pseudo") String pseudo, @Valid @RequestBody DeveloperUpdate partial) {
	service.updateBirthDate(pseudo, partial);
    }

    @GetMapping("developers/find")
    public DeveloperView find() {
	return service.find();
    }

}
