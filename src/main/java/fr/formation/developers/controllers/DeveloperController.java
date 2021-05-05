package fr.formation.developers.controllers;

import java.time.LocalDate;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.Developer;

@RestController
public class DeveloperController {
	
	// Access to all attributes of developer
	@PostMapping ("/developer")
	public void create(@RequestBody Developer developer) {
		System.out.println(developer);
	}
	
	// Access to all attributes of developer with alias
	@GetMapping("developer/{alias}")
	public Developer getByPseudo(@PathVariable("alias") String alias) {
		Developer developer = new Developer();
		developer.setAlias(alias);
		developer.setName("KHUU");
		developer.setFirstname("Christine");
		LocalDate date1 = LocalDate.of(1980,07,05); 
		developer.setBirthdate(date1);
		return developer;
	}
	
	@GetMapping ("/developer/{alias}/{birthdate}")
	public void create(@PathVariable("alias") String alias,@PathVariable("birthdate") LocalDate birthdate) {
		Developer developer1 = new Developer();
		developer1.setAlias(alias);
		developer1.setBirthdate(birthdate);
		System.out.println(developer1);
	}
	 @PatchMapping("developer/{pseudo}/birth-date")
	    public void updateBirthDate(@PathVariable("pseudo") String pseudo,
		    @RequestBody Developer partial) {
		System.out.println("Partial object=" + partial);
		Developer developer = new Developer();
		developer.setAlias(pseudo); // Variable de chemin
		developer.setFirstname(partial.getFirstname()); // Anomalie
		developer.setName("MARSHALL");
		developer.setBirthdate(partial.getBirthdate()); // JSON
		System.out.println("New object=" + developer);
	    }
}
