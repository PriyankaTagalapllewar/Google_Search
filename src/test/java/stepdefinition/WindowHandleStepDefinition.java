package stepdefinition;

import org.openqa.selenium.WebDriver;

import BasePackage.WindowHandleBaseClass;
import POMclassQRM.WindowHandleElementsAndMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class WindowHandleStepDefinition {
	
	public WebDriver driver;
	WindowHandleBaseClass windowbase;
	WindowHandleElementsAndMethods window;
	
	@Given("user navigate to url of window handle")
	public void user_navigate_to_url_of_window_handle() throws InterruptedException {
		windowbase=new WindowHandleBaseClass(driver);
	    windowbase.initializeBrowser();
	    windowbase.url();
	    Thread.sleep(4000);
	}

	@When("user clicks on window handle click button")
	public void user_clicks_on_window_handle_click_button() throws InterruptedException {
	    window=new WindowHandleElementsAndMethods(driver);
	    
	    Thread.sleep(4000);
	    window.clickOnWindowHandleButton();
	}

	@When("user shifts his focus on next window")
	public void user_shifts_his_focus_on_next_window() {
	    window.MultipleWindowHandles();
	    windowbase.tearDown();
	}
}
