package methodOfWebElemenet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-neii4g1/login.do");
		
		
		 driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click();
		
		
	}

}
