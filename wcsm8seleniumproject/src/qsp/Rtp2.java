package qsp;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class Rtp2 {
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter browesr name");

		String browserValue = sc.next();

		if (browserValue.equalsIgnoreCase("chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			driver.close();
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		} 
		else {
			   System.out.println("plz enter vlid browser");
		     }
	}
}
