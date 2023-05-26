package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
	  Reporter.log("Test Annotations",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Before Method Annotations",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("After Method Annotations",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("Before Class Annotations",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("After Class Annotations",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("Before Test Annotations",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("After Test Annotations",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("Before Suite Annotations",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("After Suite Annotations",true);
  }

}
