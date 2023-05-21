package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class LaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		//to launch chrome browser
		//for handle illegal exceptions
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		// to avoid connectionfailedException
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		//to launch chrome browser
		WebDriver driver = new ChromeDriver(co);
		//to maximize browser
		driver.manage().window().maximize();

		Thread.sleep(2000);// stop execution of script for 2 sec

		// to close the browser
		driver.close();

	}

}
