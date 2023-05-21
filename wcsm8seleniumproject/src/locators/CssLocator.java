package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssLocator {
	public static void main(String[] args) throws InterruptedException {
		
 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		 ChromeOptions co = new ChromeOptions();
		 
		 co.addArguments("--remote-allow-origins=*");
		    WebDriver driver =new ChromeDriver(co);
		    driver.manage().window().maximize();
		    driver.get("https://hi-in.facebook.com/");
		    Thread.sleep(2000);
		
	}

}   
//button[@class='_acan _acap _acas _aj1-']
