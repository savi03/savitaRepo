package DataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// 
		System.setProperty("webdriver.driver.exe","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omsairam/login.do");
		
		Flib flib = new Flib();
		
	int rc = flib.rowCount("./data/ActiTimeTestCase.xlsx","invalidcreds");
	
	for (int i=1;i<=rc;i++)
	{
		String invalidusername = flib.readExcelData("./data/ActiTimeTestCase.xlsx","invalidcreds",i, 0);
		 String invalidpassword = flib.readExcelData("./data/ActiTimeTestCase.xlsx","invalidcreds" ,i, 1);
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.name("username")).sendKeys(invalidusername);
		 driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
		 
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("username")).clear();
	}

	}

}
