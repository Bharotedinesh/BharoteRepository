package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirAsiaLogIn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airasia.co.in/home");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='header-b2c-login-text']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mobile-input-sso")).sendKeys("8962589466");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.findElement(By.id("//p[@id='NonLoyalty']")).click();
		Thread.sleep(2000);
	}
}
