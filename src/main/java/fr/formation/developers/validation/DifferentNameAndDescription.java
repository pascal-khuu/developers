package fr.formation.developers.validation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// personal annotation to check if two words are not identical.
@Retention(RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = { DifferentNameAndDescriptionValidation.class })
public @interface DifferentNameAndDescription {
    String message() default "The name and the description must  be different";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
