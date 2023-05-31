package dynamicScreenSot;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class TestCase  extends BaseTest {
  
  public void login1() {
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  Assert.fail();
	  driver.findElement(By.id("loginButton")).click();
	  
	  
  }
}
