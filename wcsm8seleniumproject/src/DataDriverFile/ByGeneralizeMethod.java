package DataDriverFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ByGeneralizeMethod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO multiple data by using for loop
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the path of excel sheet
		   
		Workbook wb = WorkbookFactory.create(fis);// make the file ready to read "APACHE POI PACKAGE"
		
		Sheet sheet2 = wb.getSheet("IPL");// get into the sheet
		
		int rc=sheet2.getLastRowNum();
		
	//	Row row = sheet.getRow(0));
		for(int i=0;i<rc;i++)
			
		{
			Sheet sheet= wb.getSheet("IPL");
			Row row = sheet.getRow(i);//get into desired row
			Cell cell = row.getCell(0);// get into desired cell
			
			String data = cell.getStringCellValue();//read the value from cell
			
			System.out.println(data);
		}
	}

}
