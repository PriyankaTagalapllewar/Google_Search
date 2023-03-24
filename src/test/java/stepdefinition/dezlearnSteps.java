package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dezlearnSteps {
	public WebDriver driver;

	@Given("I am on ebay home page")
	public void i_am_on_ebay_home_page() {
	    System.out.println("I am on ebay home page");
	    WebDriverManager.firefoxdriver().setup();
	    
	    driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.ebay.com/");
	}

	@When("I am clicking on ebay logo")
	public void i_am_clicking_on_ebay_logo() {
		System.out.println("I am clicking on ebay logo");
		
		driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
	}

	@Then("I am getting error")
	public void i_am_getting_error() {
		System.out.println("I am getting error");
		
		driver.findElement(By.xpath("//a[@id='gh-as-a']")).click();
		driver.close();
	}
}
