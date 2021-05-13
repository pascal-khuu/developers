package fr.formation.developers.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UppercaseValidator implements ConstraintValidator<Uppercase, String> {
// Value must be in uppercase
// compare Value to uppercased value
// Validate if the value is in uppercase
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
	if (value == null) {
	    return true;
	}
	String uppercased = value.toUpperCase();
	return value.equals(uppercased);

    }

}
