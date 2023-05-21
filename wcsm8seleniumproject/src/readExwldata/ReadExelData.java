package readExwldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Read data from ipl exel sheet
		
		//provide the path of the exel file
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		
		//make the file ready for read
		Workbook wb = WorkbookFactory.create(fis);
		
		//get into the sheet
		Sheet sheet = wb.getSheet("IPL");
		
		for(int i=0;i<=7;i++)
		{
			Row row = sheet.getRow(i);
			System.out.println(  "   ");
			
		     
		    


			 for(int j=0;j<=1;j++)
			{
			      Cell cell = row.getCell(j);
			      String data = cell.getStringCellValue();
			      System.out.print(  data);

			}
		}
			
		
		
		//get into desired row
		
		//Row row = sheet.getRow(5);
		
		//get into desired cell
		
	      //Cell cell = row.getCell(1);
	      
	      //read the value from the cell
	      
	     // String data = cell.getStringCellValue();
	     // System.out.println(data);
	}

}
