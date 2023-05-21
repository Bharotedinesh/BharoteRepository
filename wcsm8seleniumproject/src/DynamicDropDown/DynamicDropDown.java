package DynamicDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement( By.name("username")).sendKeys("Admin");
		driver.findElement( By.name("password")).sendKeys("admin123");
		//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']
		driver.findElement( By.xpath("//button[contains(@class,'')]")).click();

		driver.findElement(By.xpath("//i[contains(@class,'oxd-icon bi-list ')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
		//driver.manage().timeouts()

	}

}
