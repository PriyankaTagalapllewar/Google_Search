package Selenium_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	public static void main(String args[])
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		WebElement googlesearch=driver.findElement(By.name("q"));
		googlesearch.sendKeys("mi pro");
		List<WebElement> search=driver.findElements(By.xpath("//div[@class='erkvQe']"));
		for(int i=0;i<search.size();i++)
		{
			System.out.println(search.get(i).getText());
			if(search.get(i).getText().equalsIgnoreCase("mi pro 11")) {
				search.get(i).click();
				break;
			}
			
		}
		
		
		
	}

}
