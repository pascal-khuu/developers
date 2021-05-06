package fr.formation.developers.controllers;

import java.util.ArrayList;
import java.util.List;

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
	//create a team with all its attribute
	public void create (@Valid @RequestBody Team team) {
		System.out.println(team);
		
	}
	
	@GetMapping("{name}")	
	public Team get(@PathVariable("name")String ui) {
		Team team = new Team();
		team.setName(ui);
		team.setAgility(true);

		return team;
		
	}
	
	@DeleteMapping
	public void deleteName( @RequestBody TeamName name) {
		System.out.println("the team with name "+ name.getName() + " is deleted. ");
		
	}



	
}
