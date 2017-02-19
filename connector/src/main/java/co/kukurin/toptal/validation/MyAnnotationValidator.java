package co.kukurin.toptal.validation;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class MyAnnotationValidator implements ConstraintValidator<MyAnnotation, String> {

    private int expectedLength;

    @Override
    public void initialize(MyAnnotation myAnnotation) {
        this.expectedLength = myAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s == null || s.length() == this.expectedLength;
    }
}
