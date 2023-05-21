package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hi-in.facebook.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("boatsmart watch");
		//driver.findElement(null)
	}

}
