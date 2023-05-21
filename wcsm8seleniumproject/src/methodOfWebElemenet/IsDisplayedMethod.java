package methodOfWebElemenet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.netflix.com/in/login");
		
		 WebElement usnTB = driver.findElement(By.id("id_userLoginId"));//sendKeys("Dinesh");//
		WebElement psTB = driver.findElement(By.id("id_password"));//sendKeys("Dinesh@1994");
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		if(usnTB.isDisplayed())
		{
			usnTB.sendKeys("Dinesh");
		}
		else 
		{
			System.out.println("will get exception");
		}
		
		if(psTB.isDisplayed())
		{
			psTB.sendKeys("Dinesh@1994");
		}
		else
		{
			System.out.println("will get exception");
		}
		
		if(button.isDisplayed())
		{
			button.click();
		}
		else
		{
			System.out.println("will get exception");
		}
	}
	

}
