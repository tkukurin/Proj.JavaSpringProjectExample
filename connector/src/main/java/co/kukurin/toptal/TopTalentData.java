package co.kukurin.toptal;

import co.kukurin.toptal.validation.MyAnnotation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TopTalentData {

    @MyAnnotation(value = 10)
    @NotNull
    private String name;

}
