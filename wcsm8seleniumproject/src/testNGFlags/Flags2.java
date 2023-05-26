package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags2 {
	//method or annnotation is enable or disable
  @Test(enabled = false,description = "Login Method" )
  public void method1() {
	  Reporter.log("Login Perform",true);
  }
  @Test(enabled = true,description = "Logout Method")
  public void method2()
  {
	  Reporter.log("Logout Perform",true);
  }
}
