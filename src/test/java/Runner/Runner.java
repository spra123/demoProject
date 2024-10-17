package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\SAYPRAMA\\IdeaProjects\\DemoProject\\src\\test\\resources\\testing.feature"
        ,glue = {"C:\\Users\\SAYPRAMA\\IdeaProjects\\DemoProject\\src\\test\\java\\StepDefinitions\\scenarioSteps.java"}
)

public class Runner {

}
