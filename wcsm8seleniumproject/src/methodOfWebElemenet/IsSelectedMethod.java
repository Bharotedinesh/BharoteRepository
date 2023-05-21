package methodOfWebElemenet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsSelectedMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://127.0.0.1/login.do;jsessionid=1kwfflmg1o9e3");
		WebElement CheckBox = driver.findElement(By.name("remember"));
		
		boolean verify = CheckBox.isSelected();
		
		
		System.out.println(verify);
		
		CheckBox.click();
		boolean verify1 = CheckBox.isSelected();
		System.out.println(verify1);

		


}
}
