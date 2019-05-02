package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Morris.Messias\\FourSeasons\\features\\Private_Retreats",
        glue = "mySteps"
)


public class testRunner {
}
