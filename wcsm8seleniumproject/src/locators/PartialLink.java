package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PartialLink {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/Administrator/Desktop/Link.html");

		driver.findElement(By.partialLinkText("Flip")).click();
	}

}
