package POMclassQRM;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RshettyPOM {
	
	public WebDriver driver;
	
	public RshettyPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Scenario 1- testing radio button
	 */
	
	@FindBy(xpath="//input[@value='radio1']")
	public WebElement radio1;
	
	public void clickRadio1() {
		radio1.click();
	}
	
	@FindBy(xpath="//input[@value='radio2']") 
	public WebElement radio2;
	
	public void clickRadio2() {
		radio2.click();
	}
	
	@FindBy(xpath="//input[@value='radio3']")
	public WebElement radio3;
	
	public void clickRadio3() {
		radio3.click();
	}
	
	/*
	 * Scenario 2- Testing dropdown
	 */
	
	@FindBy(xpath="//select[@id='dropdown-class-example']")
	public WebElement dropdown;
	
	public void RshettyDropdown() {
		Select select=new Select(dropdown);
		select.selectByValue("option2");
	}
	
	/*
	 * Scenario 3- Checking checkbox
	 */
	
	@FindBy(xpath="//input[@id='checkBoxOption1']")
	public WebElement checkbox1;
	
	public void ClickCheckBox1() {
		checkbox1.click();
	}
	
	@FindBy(xpath="//input[@id='checkBoxOption2']")
	public WebElement checkbox2;
	
	public void ClickCheckBox2() {
		checkbox2.click();
	}
	
	@FindBy(xpath="//input[@id='checkBoxOption3']")
	public WebElement checkbox3;
	
	public void ClickCheckBox3() {
		checkbox3.click();
	}
	
	/*
	 * Scenario 4- Checking WindowHandle
	 */
	
	@FindBy(xpath="//button[@id='openwindow']")
	public WebElement windowHandle;
	
	public void ClickWindowHandle() {
		windowHandle.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='Access all our Courses']")
	public WebElement Access;
	
	public void AccessAllCources() {
		
		Set<String>windows=driver.getWindowHandles();
		
		for(String window:windows) {
			if(!window.equals(windows)) {
				driver.switchTo().window(window);
			}
		}
		
		Access.click();
	}
	/*
	 * Method to get title of page
	 */
	
	public String getTitleMethod() {
		return driver.getTitle();
	}
	
	/*
	 * Scenario 5- Alert checking
	 */
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement alertbox;
	
	public void sendValueInAlertBox(String string) {
		alertbox.sendKeys(string);
	}
	
	@FindBy(xpath="//input[@id='alertbtn']")
	public WebElement alert;
	
	public void clickonAlertButton() {
		alert.click();
	}
	
	public void AcceptAllert() {
		driver.switchTo().alert().accept();
	}
	
	
}
