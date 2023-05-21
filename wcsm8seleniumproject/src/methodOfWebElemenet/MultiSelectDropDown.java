package methodOfWebElemenet;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	public static void main(String[] args) throws InterruptedException {


		//single select dropdown

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Administrator/Desktop/wcsm8workspace/DropDownButoonMultiple.html");

		WebElement dropDwon = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropDwon);
		
		//sel.selectByIndex(3);
		
		for(int i = 0; i <= 4; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		//deselecting options
		
		
	}
}