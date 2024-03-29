package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;
import fr.formation.developers.services.SkillService;

@RestController
public class SkillController {

    // @Autowired // @Inject
    private final SkillService service;

    public SkillController(SkillService service) {
	this.service = service;
    }

    /* Access to the name of a skill by its id */
    @GetMapping("/skills/{id}")
    public SkillView getById(@PathVariable("id") Long id) {
	// service=null
	System.out.println(" call in controller");
	return service.getById(id);
    }

    /* Access to the name of a skill by its name */
    @GetMapping("/skills/{name}/by-name")
    public SkillView getByName(@PathVariable("name") String name) {
	return service.getByName(name);
    }

    /* Create a skill with its field "name" */
    @PostMapping("/skills")
    public void create(@Valid @RequestBody SkillCreate dto) {
	System.out.println(" call in controller");
	service.create(dto);
    }
}
