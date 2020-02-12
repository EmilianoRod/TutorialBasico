package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "DefSteps",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter", "json:target/cucumber-reports.json"},
        monochrome = true,
        tags = "@Test"
)
public class Runner {
}
