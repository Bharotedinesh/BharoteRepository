package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public  class FaceBookbIdLocator {

	public static void main(String[] args) throws InterruptedException {
		

		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		 ChromeOptions co = new ChromeOptions();
		 
		 co.addArguments("--remote-allow-origins=*");
		    WebDriver driver =new ChromeDriver(co);
		    driver.manage().window().maximize();
		    driver.get("https://hi-in.facebook.com/");
		    Thread.sleep(2000);
		    driver.findElement(By.id("email")).sendKeys("bharotedinesh@gmail.com");
		    Thread.sleep(2000);
		    driver.findElement(By.id("pass")).sendKeys("Dinesh@1994");
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	}

}
