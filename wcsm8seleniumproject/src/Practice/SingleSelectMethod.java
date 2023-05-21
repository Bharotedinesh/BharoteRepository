package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Administrator/Desktop/wcsm8workspace/DropDownButoonMultiple.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropDown);
		//sel.selectByIndex(9);
		
		
		for(int i = 0; i <= 4; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		for(int i = 0; i<=3; i++)
		{
			sel.deselectByIndex(i);
			Thread.sleep(1000);
		}
		
		
		
		
	}
}
