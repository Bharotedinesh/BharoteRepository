package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags4 {
  @Test
  public void f() {
	  Reporter.log("f Method",true);
  }
  public void a() {
	  Reporter.log("a Method",true);
  }
  public void e() {
	  Reporter.log("e Method",true);
  }
  public void g() {
	  Reporter.log("g Method",true);
  }
  public void m() {
	  Reporter.log("m Method",true);
  }
  public void p() {
	  Reporter.log("p Method",true);
  }
  public void z() {
	  Reporter.log("z Method",true);
  }
}
