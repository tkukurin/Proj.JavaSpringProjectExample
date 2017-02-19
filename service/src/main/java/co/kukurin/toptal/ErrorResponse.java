package co.kukurin.toptal;

import lombok.Value;
import org.springframework.validation.ObjectError;

import java.util.List;

@Value
public class ErrorResponse {

    public static final int GENERIC_ERROR_CODE = 0;
    public static final int VALIDATION_ERROR_CODE = 1;

    public static final ErrorResponse GENERIC_ERROR = new ErrorResponse(GENERIC_ERROR_CODE, "Unknown server exception");

    private Integer errorCode;
    private String errorMessage;

    public static ErrorResponse fromValidationErrors(List<ObjectError> validationErrors) {
        return validationErrors.stream()
                .map(ObjectError::getDefaultMessage)
                .findFirst()
                .map(error -> new ErrorResponse(ErrorResponse.VALIDATION_ERROR_CODE, error))
                .orElse(ErrorResponse.GENERIC_ERROR);
    }

}
