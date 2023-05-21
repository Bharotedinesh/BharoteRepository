package pageObjectModelPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.crome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-knl22f4g/login.do");
		
		WebElement usernameTB = driver.findElement(By.name("username"));
		usernameTB.sendKeys("Admin");
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		passwordTB.sendKeys("manger");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		driver.navigate().refresh();
		//usernameTB.clear();
		//Thread.sleep(2000);
		usernameTB.sendKeys("Admin");
	}

}
