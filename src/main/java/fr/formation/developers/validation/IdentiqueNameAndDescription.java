package fr.formation.developers.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = {IdentiqueNameAndDescriptionValidation.class })
public @interface IdentiqueNameAndDescription {
	String message() default "The name and the description must not be the same expression";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
