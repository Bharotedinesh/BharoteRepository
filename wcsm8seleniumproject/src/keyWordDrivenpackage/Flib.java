package keyWordDrivenpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	// it is use to store generic reusable methods..
	
	// all the methods are Non static
	
	public String readExceData(String excelPath,String sheetName,int rowCount,int cellCout) throws FileNotFoundException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
	   Sheet sheet = wb.getSheet(sheetName);
	   Row row = sheet.getRow(rowCount);
	   Cell cell = row.getCell(cellCout);
	   String data = cell.getStringCellValue();
	   return data;
		
	}

	 public int rowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	 {
		 FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		 int rc = sheet.getFirstRowNum();
		return 0;
		 
	 }
	 public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	 {
		 FileInputStream fis = new FileInputStream(excelPath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		 Row row = sheet.getRow(rowCount);
		 Cell cell = row.createCell(cellCount);
		 FileOutputStream fos = new FileOutputStream(excelPath);
		 wb.write(fos);
		 
	 }
       public String readPropertyData(String PropPath,String key) throws IOException
       {
    	   FileInputStream fis = new FileInputStream(PropPath);
    	   Properties prop = new Properties();
    	   prop.load(fis);
    	   String data = prop.getProperty(key);
    	   return data;
    	    
       }
}
