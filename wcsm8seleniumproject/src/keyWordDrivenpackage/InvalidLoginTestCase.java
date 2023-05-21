package keyWordDrivenpackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "invaliddata");
		
		
		for(int i=1;i<rc;i++)
		{
			String invalidusername=flib.readExceData(EXCEL_PATH, "invaliddata", i, 0);
			String invalidpassword=flib.readExceData(EXCEL_PATH, "invaliddata",i,1);
			
			driver.findElement(By.name("username")).sendKeys(invalidusername);
			driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
			driver.findElement(By.id("loginButton")).click();
		     Thread.sleep(2000);
		      driver.findElement(By.name("username")).clear();
		}
	        bt.closeBrowser();

}
}