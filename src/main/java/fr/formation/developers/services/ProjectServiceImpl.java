package fr.formation.developers.services;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.ProjectClosed;
import fr.formation.developers.domain.dtos.ProjectCreate;
import fr.formation.developers.domain.dtos.ProjectUpdate;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Override
    public void createProject(ProjectCreate projectCreate) {
	// TODO Auto-generated method stub
	System.out.println("The project with the name " + projectCreate.getName() + " has a description "
		+ projectCreate.getDescription() + " with the start date of " + projectCreate.getDateBegin()
		+ " and with an annual budget of " + projectCreate.getMoneyAnnual() + " euros");

    }

    @Override
    public void updateProject(String name, ProjectUpdate projectUpdate) {
	System.out.println("the project of name " + name + " has a description " + projectUpdate.getDescription()
		+ " and the annual money is " + projectUpdate.getMoneyAnnual() + " euros ");

    }

    @Override
    public void closeProject(String name, ProjectClosed projectClose) {
	System.out.println(" the project of name " + name + " is closed at " + projectClose.getDateEnd() + " . ");

    }

}
