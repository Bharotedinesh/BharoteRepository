package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser2 {
 
	 static WebDriver driver;
     @Test
     @Parameters("browser")
     public void method1(String browser)
     {
    	 if(browser.equalsIgnoreCase("chrome"))
    	 {
    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	driver=new ChromeDriver();
    	 }
     }
     }