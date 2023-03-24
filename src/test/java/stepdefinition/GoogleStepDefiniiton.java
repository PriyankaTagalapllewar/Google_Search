package stepdefinition;

import BasePackage.AllBrowserMethods;
import POMclassQRM.GoogleWebElementsAndMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GoogleStepDefiniiton {
	
	private GoogleWebElementsAndMethods google=new GoogleWebElementsAndMethods(AllBrowserMethods.getDriver());
	
	@Given("user go to google url")
	public void user_go_to_google_url() {
		AllBrowserMethods.getDriver().get("https://www.google.com/");

	}

	@When("user add ICC in the search box")
	public void user_add_icc_in_the_search_box() {
	    google.sendIIC();
	}

	@When("user clicks on second option we get")
	public void user_clicks_on_second_option_we_get() throws InterruptedException {
	    google.SecondOption();
	    Thread.sleep(5000);
	}
}
