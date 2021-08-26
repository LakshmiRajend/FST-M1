package cucumberTests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@SmokeTest", plugin = {"pretty"}, monochrome = true )
 */

/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@SmokeTest", plugin = {"html: test-reports"}, monochrome = true )
 */

@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@SimpleAlert",
    plugin = {"json: test-reports/json-report.json"},
    monochrome = true
)



public class Activity6Runner {
    //empty
}
