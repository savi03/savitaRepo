package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSyn {

	public static void main(String[] args) {
		// TRAVERSING FROM CART TO LOGIN
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//span[text()='Cart']")).click();
	
	driver.findElement(By.xpath("//span[text()='Login']")).click();

	}

}
