package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  
	 //.out.println("Hi TestNG");
	  Reporter.log("Hi TestNG!!!",true);
  }
  @Test
   public void g()
   {
	  //System.out.println("Hey Java");
	  Reporter.log("Hey Java!!!",true);
   }
}
