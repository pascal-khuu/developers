package fr.formation.developers.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// personal annotation to check if the number of years between two dates (the birthdate and today) is bigger than or equals to 18 years
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = { BirthDateValidator.class })
public @interface BirthDate {
    String message() default "the birthdate is not correct";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
