package fr.formation.developers.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = {DateNaissanceValidator.class })
public @interface DateNaissance {
	String message() default "La date de naissance n'est pas bonne";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
