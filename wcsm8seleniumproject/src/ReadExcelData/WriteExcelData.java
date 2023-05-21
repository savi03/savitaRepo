package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws  , IOException {
		// passing data into xl sheet
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
   sheet=wb.getSheet("IPL");
	}

}
