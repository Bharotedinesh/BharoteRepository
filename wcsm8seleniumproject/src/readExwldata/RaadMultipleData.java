package readExwldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class RaadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//read multipledata by using for loop
		for(int i=1;i<10;i++)
		{



			FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("IPL");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			String data = cell.getStringCellValue();
			Thread.sleep(2000);
			System.out.println(data);
		}
		//GENERALIZE THE ROW COUNT
		FileInputStream fis2 = new FileInputStream("./Data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis2);
		Sheet sheet = wb.getSheet("IPL");
	}
}
