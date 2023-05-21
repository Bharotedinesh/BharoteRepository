package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath4 {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		 ChromeOptions co = new ChromeOptions();
		 
		 co.addArguments("--remote-allow-origins=*");
		    WebDriver driver =new ChromeDriver(co);
		    driver.manage().window().maximize();
		    driver.get("https://www.airasia.co.in/home");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[contains(text(),'PNQ')]")).sendKeys("pune"); 
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//div[contains(text(),'PN')]")).sendKeys("PNQ");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='flight-search-source-field-read-only'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(text(),'COK')]")).sendKeys("COK");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Special Fares']")).click();
		

	}

}


//div[contains(text(),'PN')]')]  // from
	//div[contains(text(),'COK')]  //to
	//div[contains(text(),'Special Fares')]   //drofdown
	////div[@text()='Wed, Apr 12']   deaprt