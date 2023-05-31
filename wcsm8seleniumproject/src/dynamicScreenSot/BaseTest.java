package dynamicScreenSot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;


public class BaseTest {
	 static WebDriver driver;
  @BeforeMethod
  public void property()
    {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
    }
  @BeforeMethod
  public void setUp()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://laptop-knl22f4g/login.do");
  }
  public void failedMethodToTakeScreenShot(String failedMethod) 
  {
	  try {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	 File dest = new File("./ScreenShots/"+failedMethod+".png");
	 Files.copy(src, dest);
	  }
	  
	  catch(Exception e)
	  {
		  
	  }
	  
  }
   
  @AfterMethod
  public void tearDown() throws InterruptedException
  {
	  Thread.sleep(2000);
	  driver.quit();
  }
}
