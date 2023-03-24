package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQaStepDefinition {
	
	static WebDriver driver;
	

	@Given("User navigate to tools qa page")
	public void user_navigate_to_tools_qa_page() {
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\New journey\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.get("https://demoqa.com/text-box");
	}

	@When("user clicks on Text Box")
	public void user_clicks_on_text_box() {
	    driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();
	}

	@Then("user enter name")
	public void user_enter_name() {
	    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Vikas");
	}

	@Then("user enter email id")
	public void user_enter_email_id() {
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("vikas@gmail.com");
	}	
	

}
