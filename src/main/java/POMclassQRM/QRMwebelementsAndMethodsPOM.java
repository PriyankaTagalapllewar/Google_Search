package POMclassQRM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QRMwebelementsAndMethodsPOM {
	
	public WebDriver driver;
	
	public QRMwebelementsAndMethodsPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * these WebElements are for 1st scenario
	 */
	@FindBy(xpath="//input[@placeholder='Username']") 
	public WebElement username; //input[@placeholder='Username']
	
	@FindBy(xpath="//input[@placeholder='Password']") 
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']") 
	public WebElement qrmLoginButton;
	
	
	/*
	 * These WebElements are for 2nd scenario
	 */
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	public WebElement hrmforgotPasswordLink; 
	
	
	/*
	 * These WebElements are for 3rd scenario
	 */
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	public WebElement AdminButton;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") 
	public WebElement AddButton;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	public WebElement UserRole;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	public WebElement EmployeeName;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	public WebElement Status;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement SaveButton;
	
	/*
	 * Methods for first scenario
	 */
	public void loginHRMcredentials() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
	}
	
	public void qrmLoginButtonMethod() {
		qrmLoginButton.click();
	}
	
	public String gettileMethod() {
		return driver.getTitle();
	}
	
	/*
	 * Methods for second scenario
	 */
	public void hrmForgotPassword() {
		hrmforgotPasswordLink.click();
	}
	
	
	/*
	 * Methods for third scenario
	 */
	public void clickOnAdminButoon() {
		AdminButton.click();
	}
	
	public void clickOnAddButton() {
		AddButton.click();
	}
	
	public void selectESSvalueFromUserRoleDropdown() {		
		UserRole.sendKeys(Keys.DOWN);
		UserRole.sendKeys(Keys.DOWN);
		UserRole.sendKeys(Keys.ENTER);
	}
	
	public void EnterEmployeeName() {
		EmployeeName.sendKeys("Vikas Parabkar");
	}
	
	public void selectStatusasEnabledFromStatusDropdown() {
		Status.sendKeys(Keys.DOWN);
		Status.sendKeys(Keys.ENTER);		
	}
	
	public void clickOnSaveButton() {
		SaveButton.click();
	}
	
	/*
	 * Methods for 4th scenario
	 */
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement search_username;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement searchButtonOnAdminPage;
	
	@FindBy(xpath="")
	public WebElement NoUserFound;
	
	public void sendUsername(String uname) {
		search_username.sendKeys(uname);
	}
	
	public void hitOnSearch_Button() {
		searchButtonOnAdminPage.click();
	}
	
	@FindBy(css=".oxd-toast-container.oxd-toast-container--bottom")
	public WebElement noAlert;
	
	
	public void methodForNoAlert(WebDriver Integer) {
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".oxd-toast-container.oxd-toast-container--bottom")));
//
//		System.out.println(driver.findElement(By.id("oxd-toaster_1")).getText());
		System.out.println("error is present");
	}
}
