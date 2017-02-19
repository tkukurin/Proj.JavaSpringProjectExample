package co.kukurin;

import co.kukurin.toptal.TopTalentService;
import org.assertj.core.api.BDDAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
        Application.class,
        SampleUnitTestConfig.class
})
public class SampleUnitTestConfigDemonstration {

    @Autowired
    private TopTalentService topTalentService;

    @Test
    public void autowiringDemonstration() throws Exception {
        BDDAssertions.then(topTalentService.getTopTalent())
                .extracting("name")
                .containsExactly("Mary", "Joel");
    }

}
