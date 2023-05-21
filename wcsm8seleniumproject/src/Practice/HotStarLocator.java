package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HotStarLocator {
static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.rgpv.ac.in/Login/StudentLogin.aspx");
		Thread.sleep(2000);
        driver.findElement(By.name("ctl00$ContentPlaceHolder1$uc_UserLogin1$txtUserName")).sendKeys("0823EC193D02");
		Thread.sleep(2000);
        driver.findElement( By.name("ctl00$ContentPlaceHolder1$uc_UserLogin1$txtPassword")).sendKeys("Dinesh@1994");
        Thread.sleep(2000);
        driver.findElement(By.name("ctl00$ContentPlaceHolder1$uc_UserLogin1$imgLogin")).click();
		

	}

}
