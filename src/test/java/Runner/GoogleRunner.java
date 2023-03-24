package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty" }, 
				features = "src/test/resources/Features/Google.feature", 
				glue = {"stepdefinition", "Hooks" }, 
				monochrome = true, 
				dryRun = false)

public class GoogleRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
