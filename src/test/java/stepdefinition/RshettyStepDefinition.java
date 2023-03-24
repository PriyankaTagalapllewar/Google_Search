package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BasePackage.AllBrowserMethods;
import POMclassQRM.RshettyPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RshettyStepDefinition {
	
	public WebDriver driver;
	
	public RshettyPOM shetty=new RshettyPOM(AllBrowserMethods.getDriver());
	
	@Given("user navigate to rahul shetty's page url {string}")
	public void user_navigate_to_rahul_shetty_s_page_url(String string) {
		AllBrowserMethods.getDriver().get(string);
	}

	@Given("user click on radio1 button")
	public void user_click_on_radio1_button() {
	    shetty.clickRadio1();
	}

	@Given("user click on radio2 button")
	public void user_click_on_radio2_button() {
	    shetty.clickRadio2();
	}

	@Given("user click on radio3 button")
	public void user_click_on_radio3_button() {
	    shetty.clickRadio3();
	}

	@Given("user clicks on option2")
	public void user_clicks_on_option2() {
	    shetty.RshettyDropdown();
	}

	@Given("user check on option1")
	public void user_check_on_option1() {
	    shetty.ClickCheckBox1();
	}

	@Given("user check on option2")
	public void user_check_on_option2() {
	    shetty.ClickCheckBox2();
	}

	@Given("user check on option3")
	public void user_check_on_option3() {
	    shetty.ClickCheckBox3();
	}

	@Given("user clicks on Open Window button")
	public void user_clicks_on_open_window_button() {
	    shetty.ClickWindowHandle();
	}

	@Then("user should navigate to quickAcademy page")
	public void user_should_navigate_to_quick_academy_page() {
	    Assert.assertEquals(shetty.getTitleMethod(), "Practice Page");
	}

	@Then("user clicks on Access all our cources menu")
	public void user_clicks_on_access_all_our_cources_menu() {
	    shetty.AccessAllCources();
	}

	@Given("user send {string} in the box")
	public void user_send_in_the_box(String string) {
	    shetty.sendValueInAlertBox(string);
	}

	@Given("user clicks on alert button")
	public void user_clicks_on_alert_button() {
	    shetty.clickonAlertButton();
	}

	@Then("user should accept the alert prompted")
	public void user_should_accept_the_alert_prompted() {
	    shetty.AcceptAllert();
	}
	
}
