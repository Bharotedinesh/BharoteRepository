package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags1 {
	//to describe the Method
  @Test(description = "Perform login")
  
  public void method1() {
	  Reporter.log("Method 1 Login!!",true);
  }
}
