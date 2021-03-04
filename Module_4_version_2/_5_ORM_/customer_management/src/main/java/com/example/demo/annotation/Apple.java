package com.example.demo.annotation;

import com.example.demo.validator.ExistC10Validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ExistC10Validator.class)
@Documented
public @interface Apple {
    String message() default "Name must contain 'C10'.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
