package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("file:///D:/html/registrationForm.html");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dinesh");
	  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Bharote");
	  driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8962589466");
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bharotedinesh@gmail.com");
	}

}
