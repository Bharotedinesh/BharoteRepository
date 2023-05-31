package dynamicScreenSot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomeListners extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("TestCase is Started",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log(failedMethod+" :This the failed Method of Test Case",true);
		failedMethod(failedMethod);
	}

	private void failedMethod(String failedMethod) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}
 
}

