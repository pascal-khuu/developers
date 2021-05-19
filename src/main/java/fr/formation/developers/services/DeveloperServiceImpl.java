package fr.formation.developers.services;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Override
    public void create(DeveloperCreate developer) {
	System.out.println("call in service");
	System.out.println(developer);

    }

    @Override
    public DeveloperView getByPseudo(String pseudo) {
	DeveloperView developer = new DeveloperView();
	developer.setPseudo(pseudo);
	developer.setName("KHUU");
	developer.setFirstname("Pomme");
	LocalDate date1 = LocalDate.of(1980, 07, 05);
	developer.setBirthDate(date1);
	return developer;
    }

    @Override
    public void updateBirthDate(String pseudo, DeveloperUpdate partial) {
	System.out.println("Partial object=" + partial);
	// DeveloperCreate developer = new DeveloperCreate();
	// developer.setPseudo(pseudo); // Variable de chemin
	// developer.setFirstname(partial.getFirstname()); // Anomalie
	// developer.setName("MARSHALL");
	// developer.setBirthdate(partial.getBirthdate()); // JSON
	// System.out.println("New object=" + developer);
	System.out.println("Update birth date of " + pseudo + " with new date " + partial.getBirthDate());

    }

}
