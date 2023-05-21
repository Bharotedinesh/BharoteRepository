package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LanuchFirefoxDriver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver","./drivers/geckodriver.exe");//To handle Illegal State exception 
	FirefoxDriver driver = new FirefoxDriver();
	Thread.sleep(2000);
	driver.close();

		
		
	}

}      