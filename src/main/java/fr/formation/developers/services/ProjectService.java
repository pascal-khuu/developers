package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.ProjectClosed;
import fr.formation.developers.domain.dtos.ProjectCreate;
import fr.formation.developers.domain.dtos.ProjectUpdate;

public interface ProjectService {

    void createProject(ProjectCreate projectCreate);

    void updateProject(String name, ProjectUpdate projectUpdate);

    void closeProject(String name, ProjectClosed projectClose);

}
