package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.Team;
import fr.formation.developers.domain.TeamName;

@RestController
@RequestMapping("/team")
public class TeamController {

    @PostMapping
    // Create a team with all its attribute with rules (length of characters and
    // obligatory)
    public void create(@Valid @RequestBody Team team) {
	System.out.println(team);

    }

    // Collect the information of a team by its name
    @GetMapping("{name}")
    public Team get(@PathVariable("name") String name) {
	Team team = new Team();
	team.setName(name);
	team.setAgility(true);

	return team;

    }

    // Class TeamName with one field "name"
    // Delete a team by its name
    @DeleteMapping
    public void deleteName(@Valid @RequestBody TeamName name) {
	// display field "name" of the TeamName "name" which is deleted
	System.out.println("the team with name " + name.getName() + " is deleted. ");

    }

}
