package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrolDown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.javatpoint.com/");
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("scrollBy (0,5000)");
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("core Java")).click();
	}

}
