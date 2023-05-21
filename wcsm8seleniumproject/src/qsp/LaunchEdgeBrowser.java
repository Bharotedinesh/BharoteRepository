package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		
	// Launch Edgebrowser
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		  WebDriver driver =new EdgeDriver();
		  
		  //maximize the browser
		  driver.manage().window().maximize();
		

	}

}
