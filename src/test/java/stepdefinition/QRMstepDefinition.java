package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BasePackage.AllBrowserMethods;
import BasePackage.QRMbaseClass;
import POMclassQRM.QRMwebelementsAndMethodsPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QRMstepDefinition {
	WebDriver driver;
	QRMbaseClass base;
	QRMwebelementsAndMethodsPOM hrm;
	
	private QRMwebelementsAndMethodsPOM allBrowsermethods=new QRMwebelementsAndMethodsPOM(AllBrowserMethods.getDriver());
	
	@Given("user navigate to qrm login page url")
	public void user_navigate_to_qrm_login_page_url() {
		AllBrowserMethods.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		base=new QRMbaseClass(driver);
//		base.initializeBrowser();
//		base.url();
	}

	@When("user enters username and password in boxes")
	public void user_enters_username_and_password_in_boxes() {
		allBrowsermethods.loginHRMcredentials();
//		hrm=new QRMwebelementsAndMethodsPOM(base.driver);
//		hrm.loginHRMcredentials();
	}

	@Then("user hits on qrl login button")
	public void user_hits_on_qrl_login_button() throws InterruptedException {
		allBrowsermethods.qrmLoginButtonMethod();
//		hrm.qrmLoginButtonMethod();
	    Thread.sleep(3000);
	}

	@Then("user navigate to home page of qrm page")
	public void user_navigate_to_home_page_of_qrm_page() throws InterruptedException {
		//String actualTitile= driver.getTitle();
	    Assert.assertEquals(allBrowsermethods.gettileMethod(), "OrangeHRM1");
	    //base.tearDown();
	}
	@When("user clicks on hrm forgot password link")
	public void user_clicks_on_hrm_forgot_password_link() {
		//hrm=new QRMwebelementsAndMethodsPOM(base.driver);
		allBrowsermethods.hrmForgotPassword();
	}
	@Then("user navigates to reset password page")
	public void user_navigates_to_reset_password_page() {
	    //hrm.gettileMethod();
	    Assert.assertEquals(allBrowsermethods.gettileMethod(), "OrangeHRM");
	    //base.tearDown();
	}
	
	@Given("user is on home page of hrmApplication")
	public void user_is_on_home_page_of_hrm_application() {
	    AllBrowserMethods.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}
	@When("user clicks on Admin button on home page")
	public void user_clicks_on_admin_button_on_home_page() {
		allBrowsermethods.clickOnAdminButoon();
	}
	@When("user clicks on add button on user management page")
	public void user_clicks_on_add_button_on_user_management_page() throws InterruptedException {
		Thread.sleep(5000);
		allBrowsermethods.clickOnAddButton();
	}
	@When("user sets user role as ESS from dropdown")
	public void user_sets_user_role_as_ess_from_dropdown() throws InterruptedException {
		allBrowsermethods.selectESSvalueFromUserRoleDropdown();
		Thread.sleep(5000);
	}
	@When("user enter Employee name")
	public void user_enter_employee_name() {
		allBrowsermethods.EnterEmployeeName();
	}
	@When("user sets Status as disabled")
	public void user_sets_status_as_disabled() throws InterruptedException {
		allBrowsermethods.selectStatusasEnabledFromStatusDropdown();
		Thread.sleep(5000);
		
	}
	@Then("user clicks on save button")
	public void user_clicks_on_save_button() throws InterruptedException {
		allBrowsermethods.clickOnSaveButton();
		Thread.sleep(5000);
	}
	
	@When("user enters {string} in username searchbox")
	public void user_enters_in_username_searchbox(String senduser) throws InterruptedException {
		allBrowsermethods.sendUsername(senduser);
		Thread.sleep(4000);
	}
	@When("user hit on search button")
	public void user_hit_on_search_button() {
		allBrowsermethods.hitOnSearch_Button();
	}
	@Then("user no found message should be displayed")
	public void user_no_found_message_should_be_displayed() {
	    
	}
}
