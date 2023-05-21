package DataDriverFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidActiTimeLogin {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://omsairam/login.do");
	
	//read the valid username from ActiTimeTestData excel sheet
	
	FileInputStream fis = new FileInputStream("./data/ActiTimeTestCase.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	
	Sheet sheet = wb.getSheet("validcreds");
	
	Row row = sheet.getRow(1);
	
	 Cell cell = row.getCell(1);
	 
	 String validUsn = cell.getStringCellValue();
	 
	 //to read the valid Password from ActiTimeTestData excel sheet
	 
	 Sheet sheet1 = wb.getSheet("validcreds");
		
		Row row1 = sheet1.getRow(1);
		
		 Cell cell1 = row1.getCell(1);
		 
		 String Pwd = cell1.getStringCellValue();
		 
		 
	driver.findElement(By.name("username")).sendKeys("admin");
	
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.id("loginButton")).click();
	
	

	}

}
