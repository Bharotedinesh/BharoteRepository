package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	///use to execute annotation or method multiple tiem
  @Test(invocationCount = 10)
  public void method1() {
	  Reporter.log("Login TestCaese",true);
  }
}
