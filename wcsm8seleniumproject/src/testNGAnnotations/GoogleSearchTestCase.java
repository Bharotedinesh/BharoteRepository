package testNGAnnotations;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest {
  @Test(description = "searching for java")
  public void search1()
  {
	 driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
  }
  @Test(description = "searching for sql")
  public void search2()
  {
	  driver.switchTo().activeElement().sendKeys("Sql",Keys.ENTER);
  }
  @Test(description = "searching for selenium")
  public void search3()
  {
	  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
  }
}
