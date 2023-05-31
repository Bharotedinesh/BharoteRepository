package genericPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.math3.fraction.ProperBigFractionFormat;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	// It is use to Store generic reusable methods
	
	//to read excel data
	public String readExcelPathData(String excelPath,String sheetName,int rowCont,int cellCount) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCont);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
		
	}
	//read property data
	
	public String readPropertyData(String PropPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(PropPath);
		Properties prop = new Properties();
		 prop.load(fis);
	      String data = prop.getProperty(key);
	      return data;
		 
	}
	//generalize the  row count
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
	    int rc= sheet.getFirstRowNum();
	    return  rc;
	}
	//wrire excel data
	public void writExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		
	}
	

}
