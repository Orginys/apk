package com.example.annotations;

import com.example.demo.validations.PasswordMatchesValidator;
import org.springframework.context.PayloadApplicationEvent;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidator.class)
@Documented
public @interface PasswordMatches {
    String message() default "Password do not match";

    Class<?> [] groups() default {};

    Class<? extends Payload>[] payload() default  {};
}
