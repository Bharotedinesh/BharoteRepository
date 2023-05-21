package operationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class GetFirstSelectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Administrator/Desktop/wcsm8workspace/DropDownButoonMultiple.html");

		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);

		for(int i=3;i<6;i++)
		{
			Thread.sleep(3000);
			sel.selectByIndex(i);
		}
		Thread.sleep(3000);
		WebElement firestoption = sel.getFirstSelectedOption();
		String Value = firestoption.getText();
		System.out.println(Value);
	}
}