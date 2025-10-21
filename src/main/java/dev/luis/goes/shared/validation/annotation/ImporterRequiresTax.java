package dev.luis.goes.shared.validation.annotation;

import dev.luis.goes.shared.validation.validator.ImporterRequiresTaxValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ImporterRequiresTaxValidator.class)
public @interface ImporterRequiresTax {

    String message() default "The import tax must be levied only on imported products and cannot be less than zero. For domestic products, the tax must be zero or null.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}