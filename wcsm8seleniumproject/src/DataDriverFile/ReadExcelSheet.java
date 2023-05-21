package DataDriverFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TO read values from excel sheet using apache poi
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
	   
		Workbook wb = WorkbookFactory.create(fis);// make the file ready to read
		
		Sheet sheet = wb.getSheet("IPL");// get into the sheet
		
		Row row = sheet.getRow(3);//get into desired row
		
		Cell cell = row.getCell(0);// get into desired cell
		
		String data = cell.getStringCellValue();//read the value from cell
		
		System.out.println(data);
		
		
		

	}

}
