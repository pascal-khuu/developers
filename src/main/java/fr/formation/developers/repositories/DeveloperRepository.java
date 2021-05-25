package fr.formation.developers.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.developers.domain.entities.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {

    Optional<Developer> findByFirstnameAndLastname(String firstname, String lastname);

    Optional<Developer> findByPseudo(String pseudo);

}
