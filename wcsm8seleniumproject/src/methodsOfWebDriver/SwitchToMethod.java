package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,gecko,driver", "./drivers/geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		   // will launch webapplication by uasing navigate method
		   driver.navigate().to("https://www.google.com/");
		   Thread.sleep(2000);
		   //switch to the control to activElement
		   driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		   //to use back operation
		   driver.navigate().back();
		   Thread.sleep(2000);
	       driver.switchTo().activeElement().sendKeys("Automation Testing",Keys.ENTER);
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.navigate().refresh();
	      
	}      

}
