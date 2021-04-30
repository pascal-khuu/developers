package fr.formation.developers.controllers;

import java.time.LocalDate;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.Developpeur;

@RestController
public class DeveloppeurController {
	
	
	@PostMapping ("/developpeur")
	public void create(@RequestBody Developpeur developpeur) {
		System.out.println(developpeur);
	}
	
	@GetMapping("developpeur/{pseudo}")
	public Developpeur getByPseudo(@PathVariable("pseudo") String pseudo) {
		Developpeur developpeur = new Developpeur();
		developpeur.setPseudo(pseudo);
		developpeur.setNom("KHUU");
		developpeur.setPrenom("Pascal");
		LocalDate date1 = LocalDate.parse("1972-07-09"); 
		developpeur.setDateNaissance(date1);
		return developpeur;
	}
	
	
}
