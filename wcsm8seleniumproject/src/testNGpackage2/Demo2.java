package testNGpackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void e() {
	  Reporter.log("e Method  From DemoTest2");
	  
  }
  @Test
  public void f()
  {
	  Reporter.log("f Method  From DemoTest2");
  }
  @Test
  public void f1()
  {
	  int i=10;
	  int j=5;
	  int res=i/j;
	  Reporter.log("f1 Method  From DemoTest2");
	  Reporter.log("res: "+res);
  }
  
}
