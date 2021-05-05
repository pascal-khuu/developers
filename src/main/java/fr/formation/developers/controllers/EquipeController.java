package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.Equipe;

@RestController
@RequestMapping("/equipe")
public class EquipeController {

	@PostMapping
	public void create (@Valid @RequestBody Equipe equipe) {
		System.out.println(equipe);
	}
	
	@GetMapping
	public String GetMessage () {
		//System.out.println(equipe);
		return "Hello";
	}
	

}
