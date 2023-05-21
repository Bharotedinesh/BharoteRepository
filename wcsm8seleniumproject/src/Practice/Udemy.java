package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Udemy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		

		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("")
		driver.findElement(By.name("password")).sendKeys("Bottle@123");
		driver.findElement(By.xpath("//button[@class='ud-btn ud-btn-large ud-btn-brand ud-heading-md helpers--auth-submit-button--2K2dh']")).click();
	}
}


//input[contains(@class,'ng-tns-c57-74 ui-input')] //from    //input[contains(@class,'ng-tns-c57-18 ui-')]