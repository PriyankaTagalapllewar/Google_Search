package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDefinition {
	
	@Given("user navigate to url")
	public void user_navigate_to_url() {
	    System.out.println("User navigates on required url");
	}

	@When("user fills login credentials")
	public void user_fills_login_credentials() {
	    System.out.println("User fills credentials");
	}

	@Then("user exit from tab")
	public void user_exit_from_tab() {
	    System.out.println("User exit");
	}
}
