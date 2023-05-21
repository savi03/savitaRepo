package Udemi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PractiseFlib {

	public static void main(String[] args) {
		// generic reusable method
		
		public String readExcelData(String excelPath,String sheetName,int rowNum,int cellNum)
		{
		  FileInputStream fs=new FileInputStream(excelPath);
		 
		  Workbook wb=WorkbookFactory.create(fs);
		  Sheet sheet=wb.getSheet(sheetname);
		  Row row= sheet.getRow(rowNum);
		 Cell cell=row.getCell(cellNum);
		string data=cell.getStringCellValue();
		return data ;
		
		}

	}

}
