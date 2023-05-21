package keyWordDriven;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidloginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// 
		
		BaseTest bt = new BaseTest();
		
		
		bt.openBrowser();
		
		Flib flib = new Flib();
         int rc = flib.rowCount(Excel_path,"invalidcreds");
         
         for(int i=1;i<rc;i++)
         {
        	 String invalidUsername = flib.readExcelData(Excel_path, "invalidcreds", i, 0);
        	      String invalidPassword = flib.readExcelData(Excel_path, "invalidcreds", i, 1);
        	      
        	      driver.findElement(By.name("username")).sendKeys(invalidUsername);
        	      
        	      driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
        	      
        	      driver.findElement(By.id("loginButton")).click();
        	      Thread.sleep(2000);
        	      
        	      driver.findElement(By.name("username")).clear();
         }
         bt.closeBrowser();
         }
	

}
