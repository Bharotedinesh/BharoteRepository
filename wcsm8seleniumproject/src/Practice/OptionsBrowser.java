package Practice;

import java.util.Scanner;

import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class OptionsBrowser {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);

		System.out.println("enter Your Desired Browser Name");

		String browserValue = sc.next();

		if (browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

			ChromeOptions co = new ChromeOptions();

			co.addArguments("--remote-allow-origins=*");

			driver =new ChromeDriver(co);

			driver.manage().window().maximize();

			Thread.sleep(2000);

			driver.close();

		}
		else if (browserValue.equalsIgnoreCase("edge"))
				{
				System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

                driver = new EdgeDriver();
                
                driver.manage().window().maximize();
                
                Thread.sleep(2000);
                
                driver.close();
                
	}

		else
		{
			System.out.println("please enter a valid browser name");
		}
}

}
