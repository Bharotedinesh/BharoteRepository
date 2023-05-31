package dynamicScreenSot;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class AssertionInTestNG {
	static WebDriver driver;

	@BeforeTest
	public void property()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-knl22f4g/login.do");

	}



}

