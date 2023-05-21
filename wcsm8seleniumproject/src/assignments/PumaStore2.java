package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class PumaStore2 {

	public static void main(String[] args) throws InterruptedException {
		// USING AXES
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--disable-notifications");
		
	     WebDriver driver=new ChromeDriver(co);
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     driver.get("https://in.puma.com/in/en");
	     
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[text()='PUMA.com']")).click();
	     
	     Actions act = new Actions(driver);
	    
	     WebElement menu = driver.findElement(By.xpath("//span[text()='Menu']"));
	     
	     act.moveToElement(menu).perform();
	     
	   //  driver.findElement(By.xpath("//span[text()='Menu']")).click();
		

	}

}
