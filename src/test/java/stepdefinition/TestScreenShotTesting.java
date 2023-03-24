package stepdefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScreenShotTesting {
	public static void main(String[] args) throws IOException {
		
	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Vikas\\Chrome.exe\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    //driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    driver.get("https://www.youtube.com/");
    
//    File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    FileUtils.copyFile(scrFile,new File("ScreenShot\\Vikas.png"));
    
    //System.out.println(driver.manage().window().getSize());
//    Dimension d=new Dimension(800,700);
//    driver.manage().window().setSize(d);
    
    //enter text message without using sendkeys
    JavascriptExecutor js=((JavascriptExecutor)driver);
    js.executeScript("document.getElementById('search').value=vikas");
    
    //driver.close();
	
}}
