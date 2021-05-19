package fr.formation.developers.services;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;

@Service
public class SkillServiceImpl implements SkillService {

    @Override
    public SkillView getById(long id) {
	System.out.println(" call in service");
	SkillView skill = new SkillView();
	skill.setName("Spring boot " + id);
	return skill;
    }

    @Override
    public void create(SkillCreate skill) {
	System.out.println(" call in service");
	System.out.println(skill);

    }

}
