package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XPath2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 
	 ChromeOptions co = new ChromeOptions();
	 
	 co.addArguments("--remote-allow-origins=*");
	    WebDriver driver =new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.navigate().to("https://app.quore.com/login.php");
	    
	    driver.findElement(By.xpath("//input[@placeholder='put']")).sendKeys("bharotedinesh@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Dinesh@1994");

	    driver.findElement(By.xpath("//span[@class='button-text']")).click();
}
}