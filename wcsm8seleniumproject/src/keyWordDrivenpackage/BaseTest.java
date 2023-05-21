package keyWordDrivenpackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements iAutoConstant {
	
	static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
	      Flib flib = new Flib();
	      
	     String browserValue = flib.readPropertyData(PROP_PATH, "browser");
	     String url = flib.readPropertyData(PROP_PATH, "url");
	     if(browserValue.equals("chrome"))
	     {
	    	System.setProperty(CHROME_KEY,CHROME_PATH);
	    	driver=new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	driver.get(url);
	     } else if(browserValue.equals("firefox"))
	     {
	    	 System.setProperty(GECKO_KEY,GECKO_PATH);
	    	 driver=new FirefoxDriver();
	    	 driver.manage().window().maximize();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	 driver.get(url);
	     } else if(browserValue.equals("msedge"))
	     {
	    	 System.setProperty(MSEDGE_KEY,MSEDGE_PATH);
	    	 driver=new EdgeDriver();
	    	 driver.manage().window().maximize();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	 driver.get(url);
	     } else
	     {
	    	 System.out.println("Plz Enter valid Browser Value!!!");
	     }
	      
	    }

	      public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
		
	}
	
 
}
