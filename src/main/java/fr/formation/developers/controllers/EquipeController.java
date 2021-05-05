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

import fr.formation.developers.domain.Equipe;

@RestController
@RequestMapping("/equipe")
public class EquipeController {
	//list of equips
	List <Equipe> equipes = new ArrayList<Equipe>();

	@PostMapping
	//create a team with all its attribute
	public void create (@Valid @RequestBody Equipe equipe) {
		System.out.println(equipe);
		equipes.add(equipe);
	}



	@GetMapping
	public List <Equipe> GetEquipes () {
		return equipes;
	}

	//delete by the name
	@DeleteMapping("/delete/{nom}")
	public void delete (@Valid @PathVariable String nom) {
		int index=0;
		for (Equipe equipe: equipes ) {
			if (equipe.getNom().equals(nom)) {
				index=equipes.indexOf(equipe);
			}

		}
		equipes.remove(index);

	}
}
