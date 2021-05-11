package fr.formation.developers.validation;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.developers.domain.DeveloperCreate;

public class DateNaissanceValidator implements ConstraintValidator<DateNaissance, LocalDate> {

	@Override
	public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
		if (value==null) {
			return false;
		}
		
		LocalDate date1 = LocalDate.now();
		return (date1.getYear()-value.getYear()>=18);

		
		
		
	}

}
