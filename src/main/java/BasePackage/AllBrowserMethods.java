package BasePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllBrowserMethods {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
	
	public WebDriver init_driver(String browser) {
		/**
		 * This method is used to initialize the threadlocal driver on the basis of given browser
		 * @param browser
		 * @return
		 */
		
		System.out.println("browser value is: "+ browser);
		
		
		
		if(browser.equals("chrome")) {
			ChromeOptions c=new ChromeOptions();
			c.addArguments("--remote-allow-origins=*");
			
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver(c));
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		else if(browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			tlDriver.set(new InternetExplorerDriver());
		}
		else {
			System.out.println("Please provide correct browser value: "+ browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	/*
	 * this is used to get the driver with ThreadLocal
	 */
	
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
}
