package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {

	@Test(description = "Login testcases")
	public void loginMethod()
	{
		Reporter.log("Login Perform"true);
	}
	@Test(description = "CreateUser")
	public void createuserMethod() {
		Reporter.log("user created",true);
	}
	@Test(description = "Logout method")
	public void logoutMethod() 
	{
		Reporter.log("Logout perform",true);
	}

}
