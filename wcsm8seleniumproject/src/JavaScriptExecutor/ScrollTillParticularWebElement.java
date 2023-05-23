package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollTillParticularWebElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     ChromeOptions co = new ChromeOptions();
	     co.addArguments("--disable-notifications");
	     
	     ChromeDriver driver = new ChromeDriver(co);
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://in.puma.com/in/en/mens/mens-shoes?utm_source=GGL-SEA&utm_medium=PS&utm_campaign=PS_GGL_SEA_TXT_Brand_Category&utm_aud=OTH&utm_obj=OLC&gclid=EAIaIQobChMIr4bD-ard_gIVW8CWCh0gVAVyEAAYASAAEgKpcfD_BwE%22");
	    
	     
	}

}
