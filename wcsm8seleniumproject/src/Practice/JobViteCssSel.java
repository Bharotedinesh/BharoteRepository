package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JobViteCssSel {
	
	static WebDriver driver; 
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	ChromeOptions co = new ChromeOptions();

	co.addArguments("--remote-allow-origins=*");
	WebDriver driver =new ChromeDriver(co);
	
	driver.manage().window().maximize();
	driver.get("https://id.jobvite.com/");
	
	driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
	driver.findElement(By.cssSelector("span[class='jvc-MuiButton-label']")).click();
}
}
//https://id.jobvite.com/