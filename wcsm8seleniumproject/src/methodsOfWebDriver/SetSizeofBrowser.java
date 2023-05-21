package methodsOfWebDriver;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetSizeofBrowser {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			
			co.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(co);
			
			driver.manage().window().maximize();
			
			 Dimension tragetSize = new Dimension(400, 400);
			
			Thread.sleep(2000);
			driver.manage().window().setSize(tragetSize);
			
			
		
	}

}
