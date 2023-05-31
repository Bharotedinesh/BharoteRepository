package genericPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class BaseTest  extends Flib implements IAutoConstant {
	static WebDriver driver;
	//it is use to open the browser or close the browser
	@BeforeMethod

	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new  FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		}
		else {
			Reporter.log("invalid browser!!",true);
		}

	}
	public void faileMethodToTakeScreenShot(String failedMethod)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(SCREENSHOT_PATH+failedMethod+" .png");
			Files.copy(src, dest);
		}
		catch(Exception e)
		{

		}
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}


