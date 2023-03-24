package BasePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleBaseClass {
	
	public WebDriver driver;
	public WindowHandleBaseClass(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver initializeBrowser() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Vikas\\Chrome.exe\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    return driver;
	}
	
	public void url() {
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
	}
	
	public void tearDown() {
		driver.quit();
	}
	
}
