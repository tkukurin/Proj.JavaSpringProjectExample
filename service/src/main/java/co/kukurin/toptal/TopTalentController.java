package co.kukurin.toptal;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/toptal")
@AllArgsConstructor
public class TopTalentController {

    private final TopTalentService topTalentService;

    @RequestMapping("/get")
    public List<TopTalentData> getTopTalent() {
        return topTalentService.getTopTalent();
    }

    @RequestMapping("/put")
    public void addTopTalent(@Valid @NotNull @RequestBody TopTalentData topTalentData) {
        topTalentService.addTopTalent(topTalentData);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleInvalidTopTalentDataException(MethodArgumentNotValidException methodArgumentNotValidException) {
        BindingResult bindingResult = methodArgumentNotValidException.getBindingResult();
        List<ObjectError> validationErrors = bindingResult.getAllErrors();

        return ErrorResponse.fromValidationErrors(validationErrors);
    }

}
