package testNGpackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void a() {
	  Reporter.log("A Method  From DemoTest2");
  }
  @Test
  public void b()
  {
	  Reporter.log("b Method  From DemoTest2");
  }
  @Test
  public void c()
  {
	  Reporter.log("c Method  From DemoTest2");
  }
}
