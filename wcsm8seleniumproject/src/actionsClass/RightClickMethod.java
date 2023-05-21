package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod {
	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/downloads/");
		//driver.findElement(By.linkText("Downloads"));
		WebElement trget = driver.findElement(By.linkText("4.9.0"));

		//to perform mouse Action we need to create obj

		Actions act = new Actions(driver);
		
		//to perform Right click Action

		act.contextClick(trget).perform();

	}
}