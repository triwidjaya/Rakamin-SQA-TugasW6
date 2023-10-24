package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDef"},
//        plugin = { "json:target/cucumber.json", "pretty", "html:target/cucumber-reports" }
        plugin = {"html:target/HTML_report.html"}
)

public class runner {
}