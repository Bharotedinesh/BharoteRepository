package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriversMethods {
	public static void main(String[] args) throws InterruptedException {
		//set the path of chrome driver exe file
		
		System.setProperty("websriver.chrome.driver", "drivers/chromedriver.exe");
		//launch the chrome browser
		
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
	
		
		//Enter url
		
		driver.get("http://www.google.com");
		
		//Get the title of google page nd print on cansole
		
		String title = driver.getTitle();
		System.out.println("the title of the page is :"+title);
		
		//get the url of google page and print on cansole
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("the url of page is: "+currenturl);
		
		//get the source code of google page and print on the cansole
		
		String pagesource = driver.getPageSource();
		System.out.println("the source code of the page is :"+pagesource);
		
		//helt the code on 2 min
		
		Thread.sleep(2000);
		
		//close the browser
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
