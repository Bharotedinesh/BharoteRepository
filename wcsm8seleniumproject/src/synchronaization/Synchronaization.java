package synchronaization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronaization {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.instagram.com/");
		   
		
	}

}
