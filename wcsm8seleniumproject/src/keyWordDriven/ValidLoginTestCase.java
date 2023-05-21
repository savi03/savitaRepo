package keyWordDriven;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		//  TO OPEN BROWSER CREATE OBJECT FOR BASE-TEST
		
		BaseTest bt = new BaseTest();
		
		// read the data from property file
		
		Flib flib = new Flib();
		
		bt.openBrowser();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(Prop_path, "username"));
		 
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(Prop_path, "password"));
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		bt.closeBrowser();
	}


}


