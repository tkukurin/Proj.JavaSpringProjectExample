package co.kukurin;

import co.kukurin.toptal.TopTalentData;
import co.kukurin.toptal.TopTalentService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class SampleUnitTestConfig {
    @Bean
    public TopTalentService topTalentService() {
        TopTalentService topTalentService = Mockito.mock(TopTalentService.class);
        Mockito.when(topTalentService.getTopTalent()).thenReturn(
                Stream.of("Mary", "Joel").map(TopTalentData::new).collect(Collectors.toList()));
        return topTalentService;
    }
}

