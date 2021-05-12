package fr.formation.developers.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.developers.domain.ProjectCreate;



public class IdentiqueNameAndDescriptionValidation implements ConstraintValidator<IdentiqueNameAndDescription, ProjectCreate> {

	@Override
	public boolean isValid(ProjectCreate value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return !(value.getDescription().equals(value.getName()));
	}



}

