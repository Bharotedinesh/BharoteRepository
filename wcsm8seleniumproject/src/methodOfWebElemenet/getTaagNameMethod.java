package methodOfWebElemenet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTaagNameMethod {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.selenium.dev/");
		 WebElement element = driver.findElement(By.xpath("//h2[.='News']"));
		String TageNameOfNews = element.getTagName();
		
		System.out.println(TageNameOfNews);
}
}





//div[@class='_ab32']
