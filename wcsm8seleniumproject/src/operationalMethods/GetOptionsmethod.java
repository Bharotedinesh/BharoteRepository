package operationalMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class GetOptionsmethod {
	public static void main(String[] args) throws InterruptedException {



	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Administrator/Desktop/wcsm8workspace/DropDownButoon.html");
	WebElement dropDown = driver.findElement(By.name("menu"));
	 Select sel = new Select(dropDown);
	  
	  List<WebElement> var = sel.getOptions();
	
	 
	 for(int i=0;i<var.size();i++)
	 {
	     String options = sel.getOptions().get(i).getText();
		 System.out.println(options);
	}
	
	for(WebElement op:var)
	{
		String options = op.getText();
		System.out.println(options);
	}
	
	
//  Advance for loop
	  
//		
//		for(WebElement op:allOptions)
//		{
//			String options = op.getText();
//			System.out.println(options);
//		}
//		
}
}