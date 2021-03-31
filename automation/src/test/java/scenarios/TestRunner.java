package scenarios;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions
        (features = "features/stefanini",
                glue = {"pages"},
                monochrome = true, tags = {"@login"}, plugin = { "pretty", "html:target/report-html" })

public class TestRunner {
}
