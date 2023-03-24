package POMclassQRM;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandleElementsAndMethods {
	public WebDriver driver;
	
	public WindowHandleElementsAndMethods(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@id='u_7_8']") 
	public WebElement windowhandleClick_btn;
	
	
	public void clickOnWindowHandleButton() {
		windowhandleClick_btn.click();;
	}
	
	public void MultipleWindowHandles() {
		String ParentWindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		
		for(String window: windows) {
			if(!window.equals(ParentWindow)) {
				driver.switchTo().window(window);
				System.out.println(driver.getCurrentUrl());
			}
		}
		driver.switchTo().defaultContent();
	}
}
