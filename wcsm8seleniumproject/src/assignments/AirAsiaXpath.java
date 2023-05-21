package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirAsiaXpath {

	public static void main(String[] args) throws InterruptedException {
		// USING CONTAINS XPATH
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airasia.co.in/home");
		
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'login-mobile-input-sso')]")).sendKeys("72024931204");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		

	}

}
