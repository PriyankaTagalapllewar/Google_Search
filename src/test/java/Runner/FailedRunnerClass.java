package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","rerun:target/failedrerun.txt"},
		features = "@target/failedrerun.txt",
		glue = "stepdefinition", monochrome = true,
		dryRun=false
)
public class FailedRunnerClass extends AbstractTestNGCucumberTests{

}
