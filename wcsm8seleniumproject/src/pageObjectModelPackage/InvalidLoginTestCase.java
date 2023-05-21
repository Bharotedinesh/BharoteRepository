package pageObjectModelPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		Thread.sleep(2000);
		
		LoginPage lp = new LoginPage(driver);
		
		int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			String invalidusername = flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 0);
			;
			String invalidpassword = flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 1);
			lp.invalidLogin(invalidusername, invalidpassword);
		}
		bt.tearDown();
		
		
	}

	
	
}

