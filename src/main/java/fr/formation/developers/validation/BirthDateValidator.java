package fr.formation.developers.validation;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

// Validate if the years between the input  birthDate and today is more or equal of 18 years
public class BirthDateValidator implements ConstraintValidator<BirthDate, LocalDate> {

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
	if (value == null) {
	    return false;
	}

	LocalDate date1 = LocalDate.now();
	int Year = value.getYear() + 18;
	value = LocalDate.of(Year, value.getMonth(), value.getDayOfMonth());
	return (value.isBefore(date1));

    }

}
