package fr.formation.developers.services;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;
import fr.formation.developers.domain.entities.Developer;
import fr.formation.developers.repositories.DeveloperRepository;

@Service
public class DeveloperServiceImpl implements DeveloperService {
    private final DeveloperRepository repository;

    public DeveloperServiceImpl(DeveloperRepository repository) {
	this.repository = repository;
    }

    @Override
    public void create(DeveloperCreate dto) {
	Developer entity = new Developer();
	entity.setPseudo(dto.getPseudo());
	entity.setFirstname(dto.getFirstname());
	entity.setLastname(dto.getLastname());
	entity.setBirthDate(dto.getBirthDate());
	System.out.println(entity);
	repository.save(entity);

    }

    @Override
    public DeveloperView getByPseudo(String pseudo) {
	Developer entity = repository.findByPseudo(pseudo).get();
	DeveloperView developerView = new DeveloperView();
	developerView.setPseudo(pseudo);
	developerView.setFirstname(entity.getFirstname());
	developerView.setLastname(entity.getLastname());
	developerView.setBirthDate(entity.getBirthDate());
	return developerView;
    }

    @Override
    public void updateBirthDate(String pseudo, DeveloperUpdate partial) {
	// System.out.println("Partial object=" + partial);
	// Developer developer = new Developer();
	Developer entity = repository.findByPseudo(pseudo).get();
	entity.setBirthDate(partial.getBirthDate());
	repository.save(entity);
	// DeveloperCreate developer = new DeveloperCreate();
	// developer.setPseudo(pseudo); // Variable de chemin
	// developer.setFirstname(partial.getFirstname()); // Anomalie
	// developer.setName("MARSHALL");
	// developer.setBirthdate(partial.getBirthdate()); // JSON
	// System.out.println("New object=" + developer);
	// System.out.println("Update birth date of " + pseudo + " with new date " +
	// partial.getBirthDate());

    }

    @Override
    public DeveloperView find() {
	// TODO Auto-generated method stub
	String firstname = "pascal";
	String lastname = "khuu";
	Developer entity = repository.findByFirstnameAndLastname(firstname, lastname).get();
	DeveloperView view = new DeveloperView();
	view.setPseudo(entity.getPseudo());
	view.setFirstname(firstname);
	view.setLastname(lastname);
	view.setBirthDate(entity.getBirthDate());
	return view;

    }

}
