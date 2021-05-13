package fr.formation.developers.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.developers.domain.ProjectCreate;

// validate if two expressions are not equal
public class IdentiqueNameAndDescriptionValidation
	implements ConstraintValidator<IdentiqueNameAndDescription, ProjectCreate> {

    @Override
    public boolean isValid(ProjectCreate value, ConstraintValidatorContext context) {

	return !(value.getDescription().equals(value.getName()));
    }

}
