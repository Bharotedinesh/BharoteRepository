package deSelecctMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByVisibleText {
	public static void main(String[] args) throws InterruptedException {
		
		
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Administrator/Desktop/wcsm8workspace/DropDownButoonMultiple.html");
	WebElement dropDown = driver.findElement( By.name("menu"));
	
	Select sel = new Select(dropDown);
	sel.selectByVisibleText("Poha");
	Thread.sleep(2000);
	//deselect option
	sel.deselectByVisibleText("Poha");
	Thread.sleep(2000);
	

}
}