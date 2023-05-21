package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PumaStoreProducts {

public static void main(String[] args) throws InterruptedException {
	//  XPATH BASED ON PUMA STORE by using text() function
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			co.addArguments("--disable-notifications");
			
			WebDriver driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.get("https://in.puma.com/in/en");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Men']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[text()='PUMA White-PUMA Red-PUMA Gold']")).click();
			Thread.sleep(2000);
			driver.quit();
		}

	}


