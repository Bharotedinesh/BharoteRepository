package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActitimeLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("http://desktop-neii4g1/login.do");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		String loginpage = driver.getTitle();
		Thread.sleep(2000);
		driver.quit();
		System.out.println(loginpage);

	}

}
