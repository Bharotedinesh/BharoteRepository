package synchronaization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			   WebDriver driver =new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.get("https://www.instagram.com/");
			   Thread.sleep(2000);
			   driver.findElement(By.className("username")).sendKeys("_dinesh_bhawsar_1611");
			   driver.findElement(By.className("password")).sendKeys("Rohini@123");
			   driver.findElement(By.xpath("//div[text()='Log in']")).click();
			   
			
		}

	}


