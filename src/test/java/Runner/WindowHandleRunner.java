package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty" }, 
features = "src/test/resources/Features/Tools.feature", 
glue = {"stepdefinition"}, 
monochrome = true, 
dryRun = false)

public class WindowHandleRunner extends AbstractTestNGCucumberTests{
	
	
}
