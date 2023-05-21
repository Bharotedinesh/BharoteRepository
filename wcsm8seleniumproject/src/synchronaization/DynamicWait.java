package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWait {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   //apply the implicitly wait to appear the element
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("https://www.instagram.com/");
		   
		   driver.findElement(By.className("username")).sendKeys("_dinesh_bhawsar_1611");
		   driver.findElement(By.className("password")).sendKeys("Rohini@123");
		   driver.findElement(By.xpath("//div[text()='Log in']")).click();
		   
		

}
	
}
