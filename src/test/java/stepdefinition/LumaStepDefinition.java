package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BasePackage.AllBrowserMethods;
import BasePackage.QRMbaseClass;
import POMclassQRM.LumaWebElementsAndMethods;
import POMclassQRM.QRMwebelementsAndMethodsPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LumaStepDefinition {
	
	public WebDriver driver;
	
	public LumaWebElementsAndMethods luma=new LumaWebElementsAndMethods(AllBrowserMethods.getDriver());
	
	@Given("user navigate to url {string}")
	public void user_navigate_to_url(String string) {
		AllBrowserMethods.getDriver().get(string);
		
	}

	@When("user clicks Bags option from Gear Molule dropdown")
	public void user_clicks_bags_option_from_gear_molule_dropdown() throws InterruptedException {
		Thread.sleep(5000);
	 luma.mouseHoverGear();
	 
	 Thread.sleep(5000);
	 
	 luma.ClickOnBagsOption();
	}

	@Then("user should navigate to required page")
	public void user_should_navigate_to_required_page() throws InterruptedException {
	   Assert.assertEquals("Bags - Gear", "Bags - Gear");
	   Thread.sleep(5000);
	}

	@Then("user clicks on Overnight duffer bag")
	public void user_clicks_on_overnight_duffer_bag() throws InterruptedException {
		
	    luma.clickOnOverNightDuffleBag();
	    Thread.sleep(5000);
	}

	@Then("user clicks on Add To Card button")
	public void user_clicks_on_add_to_card_button() throws InterruptedException {
	    luma.ClickOnAddToCart();
	    Thread.sleep(5000);
	}

	@Then("user should be able to see {string} this message")
	public void user_should_be_able_to_see_this_message(String string) {
		
	    Assert.assertEquals(luma.getconfirmationmsg, string);
	}
}
