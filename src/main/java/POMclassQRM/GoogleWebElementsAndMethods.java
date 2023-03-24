package POMclassQRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleWebElementsAndMethods {
	
	public WebDriver driver;
	
	public GoogleWebElementsAndMethods(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Webelement and mothods for google first page
	 */
	
	@FindBy(xpath="//input[@title='Search']")
	public WebElement GoogleSearchBox;
	
	public void sendIIC() {
		GoogleSearchBox.sendKeys("ICC");
	}
	
	public List<WebElement> SecondOption() {
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@jsname=\"bw4e9b\"])[1]"));
		System.out.println("List of all the options we get: "+list);
		
		for(WebElement li:list) {
			if(li.getText().contains("icc ranking")) {
				li.click();
				break;
			}
		}
		return list;
	}
	
}
