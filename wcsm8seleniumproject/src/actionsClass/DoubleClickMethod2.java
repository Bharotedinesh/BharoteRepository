package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClickMethod2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Open Browser

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=g3ddjhi20j9df");

		// Handle login page with valid inputs

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		// HOME PAGE

		// click on Setting 

		driver.findElement(By.xpath("//A[@class='content administration']/IMG[@class='sizer']")).click();

		//click on logo & color
		driver.findElement(By.xpath("//a[contains(.,'Logo &')]")).click();
		Thread.sleep(2000);
		
		//click on radio button
		
		driver.findElement(By.id("//label[@for='uploadNewLogoOption']")).click();
		

	}

}
