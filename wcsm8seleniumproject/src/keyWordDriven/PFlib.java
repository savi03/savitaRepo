package keyWordDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PFlib {

	
	// TO READ DATA FROM EXTERNAL SHEET
	
	public String readExcelData(String excelPath,String sheetName,int rowC,int cellC) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowC);
		Cell cell = row.getCell(cellC);
		String data = cell.getStringCellValue();
		return data;
	}
	// TO GET THE COUNT OF TOTAL NO. OF ROWS IN SHEET
	
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
        FileInputStream fis = new FileInputStream(excelPath);
        
        Workbook wb = WorkbookFactory.create(fis);
        
        Sheet sheet = wb.getSheet(sheetName);
        int rc = sheet.getLastRowNum();
        return rc;

	}
	
	// TO WRITE THE DATA INTO EXCEL SHEET
	
	public void writeExcelData(String excelPath,String sheetName,int rowC,int cellC,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowC);
		Cell cell = row.createCell(cellC);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
	}
	public String readPropertyData(String propPath,String key) throws IOException
	{
		    FileInputStream fis = new FileInputStream(propPath);
		   Properties prop = new Properties();
		   prop.load(fis);
		   String data = prop.getProperty(key);
		   return data;
	}
}
