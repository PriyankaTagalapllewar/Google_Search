package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features= "src/test/resources/Features/dezlearn.feature",
		glue= "stepdefinition",
		monochrome = true,
		dryRun=false
		)

public class dezlearnRunner extends AbstractTestNGCucumberTests{

}
