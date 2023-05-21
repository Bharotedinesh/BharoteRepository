package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XPath {
static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	ChromeOptions co = new ChromeOptions();

	co.addArguments("--remote-allow-origins=*");
	WebDriver driver =new ChromeDriver(co);
	driver.manage().window().maximize();

	

	driver.get("https://www.instagram.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("username")).sendKeys("Dinesh Bhawsar");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("password")).sendKeys("123456789");
	
	Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	
}
}
