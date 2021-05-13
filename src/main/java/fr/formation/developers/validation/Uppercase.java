package fr.formation.developers.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//Personnal annotation for checking if an input is uppercased or not
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = { UppercaseValidator.class })
public @interface Uppercase {
    String message() default "must be uppercased";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
