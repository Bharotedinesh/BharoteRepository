package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-neii4g1/login.do");

		if(driver.getTitle().equals("actitime-Login"))
		{

			System.out.println("Login page title is match !!test case passed");
			driver.quit();
		}
		else 
		{
			System.out.println("Login page title is match !!test case failed");
			driver.quit();

		}
		

		
	}
}
