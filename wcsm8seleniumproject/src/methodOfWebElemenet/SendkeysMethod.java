package methodOfWebElemenet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SendkeysMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://desktop-neii4g1/login.do");

		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("pwd")).sendKeys("manger");
		WebElement usernameTB = driver.findElement(By.name("username"));
		usernameTB.sendKeys("Admin");

		WebElement passwordTB = driver.findElement(By.name("pwd"));
		passwordTB.sendKeys("manager");
		Thread.sleep(2000);
		driver.navigate().refresh();
		// explicit wait
waitMethod(driver,30,"Check").click();
		
	}
	
	   public static WebElement waitMethod(WebDriver driver,int sec,String value)
	   {
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(value)));
           return element;
	   }
	}


      