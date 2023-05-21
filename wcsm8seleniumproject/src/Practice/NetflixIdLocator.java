package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NetflixIdLocator {
	
	static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeOptions co = new ChromeOptions();
	
	co.addArguments("--remote-allow-origins=*");
	
	driver = new ChromeDriver(co);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.netflix.com/in/Login");
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("id_userLoginId")).sendKeys("Dinesh Bhawsar");
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("id_password")).sendKeys("123456789");
	
	Thread.sleep(2000);
	
	
	
	
}

}
