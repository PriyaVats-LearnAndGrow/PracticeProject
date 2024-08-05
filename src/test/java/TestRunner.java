import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", // Path to feature files
        glue = "stepdefinitions", // Package where step definition classes are located
        plugin = {"pretty", "html:target/cucumber-reports"}, // Reports
        monochrome = true // Improve readability of console output
)
public class TestRunner {
    // This class will be empty
}
