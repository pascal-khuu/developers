package fr.formation.developers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.developers.domain.entities.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {

}
