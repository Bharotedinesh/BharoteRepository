package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelecterFristChar {
static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	ChromeOptions co = new ChromeOptions();

	co.addArguments("--remote-allow-origins=*");
	WebDriver driver =new ChromeDriver(co);
	driver.manage().window().maximize();

	

	driver.get("https://www.netflix.com/in/Login");
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("id_userLoginId")).sendKeys("Dinesh Bhawsar");
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("id_password")).sendKeys("123456789");
	
	
	//driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
	
	//driver.findElement(By.cssSelector("button[class^='b']")).click();
	
	//driver.findElement(By.cssSelector("button[class$='l']")).click();
	
	driver.findElement(By.cssSelector("button[class*=' btn-']")).click();
}

}
