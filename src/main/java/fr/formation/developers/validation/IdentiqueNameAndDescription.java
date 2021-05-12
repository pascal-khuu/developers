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
	String message() default "La description et le nom ne doivent pas être identiques";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
