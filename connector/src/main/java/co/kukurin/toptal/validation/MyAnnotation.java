package co.kukurin.toptal.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { MyAnnotationValidator.class })
public @interface MyAnnotation {

    String message() default "String length does not match expected";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int value();

}
