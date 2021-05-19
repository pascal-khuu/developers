package fr.formation.developers.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.developers.domain.dtos.ProjectCreate;

// validate if two expressions are not identical.
public class DifferentNameAndDescriptionValidation
	implements ConstraintValidator<DifferentNameAndDescription, ProjectCreate> {

    @Override
    public boolean isValid(ProjectCreate value, ConstraintValidatorContext context) {

	return !(value.getDescription().equals(value.getName()));
    }

}
