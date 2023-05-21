package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.shoppersstack.com/");
		 driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__MDlEh']/descendant::img[@src='https://m.media-amazon.com/images/I/61br13t0jtL._SX679_.jpg']")).click();
		 driver.findElement(By.id("Check Delivery")).sendKeys("580032");
		 driver.findElement(By.id("Check")).clear();
		 
		 // apply the explicit wait  to web element
		  
		 
	}
	
}
