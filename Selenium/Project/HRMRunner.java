package cucumberTests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@HRM",
    format = {"pretty", "html:target/cucumber"}
)

public class HRMRunner {
    //empty
}
