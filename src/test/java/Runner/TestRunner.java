package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
	glue = "stepdefination", monochrome = true,
	dryRun=false
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
