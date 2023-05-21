package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prectice {
public static void main(String[] args) throws InterruptedException {
	
	//for illegal exception
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	//for connetion faild exception
       ChromeOptions co = new ChromeOptions();
       co.addArguments("--remote-allow-origins=*");
       
       //launch Chrome Brpwser
      WebDriver driver = new ChromeDriver(co);
      //to maximize browser
      driver.manage().window().maximize();
      // to deley 2 sec
      Thread.sleep(2000);
      driver.close();
}

}
