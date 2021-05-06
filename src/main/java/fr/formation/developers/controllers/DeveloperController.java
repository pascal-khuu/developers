package fr.formation.developers.controllers;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.DeveloperCreate;
import fr.formation.developers.domain.DeveloperUpdate;

@RestController
public class DeveloperController {
	
	// Access to all attributes of developer
	@PostMapping ("/developer")
	public void create(@RequestBody DeveloperCreate developer) {
		System.out.println(developer);
	}
	
	// Access to all attributes of developer with alias
	@GetMapping("developer/{pseudo}")
	public DeveloperCreate getByPseudo(@PathVariable("pseudo") String pseudo) {
		DeveloperCreate developer = new DeveloperCreate();
		developer.setPseudo(pseudo);
		developer.setName("KHUU");
		developer.setFirstname("Christine");
		LocalDate date1 = LocalDate.of(1980,07,05); 
		developer.setBirthdate(date1);
		return developer;
	}
	
	@GetMapping ("/developer/{pseudo}/{birthdate}")
	public void create(@PathVariable("pseudo") String pseudo,@PathVariable("birthdate") LocalDate birthdate) {
		DeveloperCreate developer1 = new DeveloperCreate();
		developer1.setPseudo(pseudo);
		developer1.setBirthdate(birthdate);
		System.out.println(developer1);
	}
	 @PatchMapping("developer/{pseudo}/birth-date")
	    public void updateBirthDate(@PathVariable("pseudo") String pseudo,
		   @Valid @RequestBody DeveloperUpdate partial) {
		//System.out.println("Partial object=" + partial);
		//DeveloperCreate developer = new DeveloperCreate();
		//developer.setPseudo(pseudo); // Variable de chemin
		//developer.setFirstname(partial.getFirstname()); // Anomalie
		//developer.setName("MARSHALL");
		//developer.setBirthdate(partial.getBirthdate()); // JSON
		//System.out.println("New object=" + developer);
		 System.out.println("Update birth date of " + pseudo+ " with new date "+partial.getBirthDate());
	    }
}
