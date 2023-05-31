package testNGFlags;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActitimeDataProvider {
  @BeforeTest
  public void property() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  
  }
  @BeforeMethod
  public void setUp() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://laptop-knl22f4g/login.do");
  }
  
  @Test(dataProvider = "testActiTime")
  public void loginInvalid(String usn,String pass)
  {
	 
  }
}
